package com.lizy.service.permission;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lizy.api.permission.IUserService;
import com.lizy.share.entity.Permission;
import com.lizy.share.entity.Role;
import com.lizy.share.entity.User;
import com.lizy.share.entity.form.PageData;
import com.lizy.share.entity.form.UserPageData;
import com.lizy.share.enums.IsDelEnum;
import com.lizy.share.exception.custom.MyException;
import com.lizy.share.exception.custom.MyException.UserExceptionRemark;
import com.lizy.share.mapper.RoleMapper;
import com.lizy.share.mapper.UserMapper;
import com.lizy.share.mapper.UserRoleMapper;
/**
 * 用户信息的相关操作
 * @author River.li
 *
 */
@Service
public class UserService implements IUserService{
	@Autowired
	private UserMapper userMapper;
	@Autowired 
	private RoleMapper roleMapper;
	@Autowired
	private UserRoleMapper userRoleMapper;
	/**
	 * 	根据手机号和密码获取用户个人信息和角色信息
	 * @param user
	 * @return
	 */
	public User getUserAndRolesByMobileAndPassword(User user) {
		return userMapper.getUserAndRolesByLoginNameAndPassword(user);
	}
	/**
	 * 根据角色获取用户权限信息
	 * @param role
	 * @return
	 */
	public List<Permission> getPermissionByRole(Role role){
		return roleMapper.getPermissionByRole(role);
	}
	/**
	 * 根据Id获取用户信息
	 * @param id
	 * @return
	 */
	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
	/**
	 * 根据手机号获取用户信息
	 * @param mobile
	 * @return
	 */
	public User getUserByMobile(String mobile) {
		return userMapper.getUserByMobile(mobile);
	}
	/**
	 * 添加用户
	 * @param user
	 */
	public void add(User user) {
		if(user!=null) {
			//首先查询用户是否存在
			List<User> users=userMapper.selectByUser(user);
			if(users==null || users.size()==0) {
				long timeStamp=System.currentTimeMillis();
				user.setCreateTime(timeStamp);
				user.setUpdateTime(timeStamp);
				user.setLoginTime(timeStamp);
				user.setIsDel(IsDelEnum.Normal.getIsDel());
				userMapper.insertSelective(user);
			}else {
				throw new MyException(UserExceptionRemark.USER_ADD_DUBBLE);
			}
			
		}
		
	}
	/**
	 * 更新用户
	 * @param user
	 */
	public void update(User user) {
		//跟新用户
		user.setUpdateTime(System.currentTimeMillis());
		userMapper.updateByPrimaryKeySelective(user);
	}
	/**
	 * 删除用户
	 * @param user
	 */
	@Transactional
	public void delete(User user) {
		//首先删除用户，然后删除用户对应的角色信息
		user.setIsDel(IsDelEnum.Deleted.getIsDel());
		userMapper.updateByPrimaryKeySelective(user);
		//删除用户对应的角色信息
		userRoleMapper.deleteByUser(user);
		
		
		
	}
	@Override
	public User getUserByLoginName(String loginName) {
		// TODO Auto-generated method stub
		return userMapper.getUserByLoginName(loginName);
	}
	@Override
	public User getUserAndRolesByLoginName(String loginName) {
		// TODO Auto-generated method stub
		return userMapper.getUserAndRolesByLoginName(loginName);
	}
	@Override
	public List<Permission> getMenuPermissions(User user) {
		// TODO Auto-generated method stub
		List<Permission> permissions=userMapper.getPermissionByUser(user);
		//获取一级菜单
		List<Permission> parentPermission=permissions.stream().filter(u->(u.getParentId()!=null && u.getParentId().equals("0"))).collect(Collectors.toList());;
		//获取二级菜单
		List<Permission> childPermission=permissions.stream().filter(u->(u.getParentId()!=null && !u.getParentId().equals("0"))).collect(Collectors.toList());
		//获取对应的二级菜单
		for (Permission permission : parentPermission) {
			permission.setChildPermissions(childPermission.stream()
					.filter(u->u.getParentId().equals(permission.getId().toString()))
							.collect(Collectors.toList())
							);
		}
		
		return parentPermission;
	}
	@Override
	public PageData getUserPageData(UserPageData userPageData) {
		// TODO Auto-generated method stub
		userPageData.setTotal(userMapper.selectPagedDataNum(userPageData));
		userPageData.setRows(userMapper.selectPagedData(userPageData));
		return userPageData;
	}
	@Override
	public void deleteBulk(String ids) {
		// TODO Auto-generated method stub		
		int id=0;
		String idArr[]=ids.split(",");
		for (String item : idArr) {
			id=Integer.valueOf(item);
			User user=new User();
			user.setId(id);
			delete(user);
		}
		
		
	}
	
}
