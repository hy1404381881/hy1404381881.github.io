package com.lizy.service.permission;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.instantiator.android.Android10Instantiator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lizy.api.permission.IRoleService;
import com.lizy.share.entity.Role;
import com.lizy.share.entity.form.PageData;
import com.lizy.share.entity.form.RolePageData;
import com.lizy.share.enums.IsDelEnum;
import com.lizy.share.exception.custom.MyException;
import com.lizy.share.exception.custom.MyException.UserExceptionRemark;
import com.lizy.share.mapper.RoleMapper;
import com.lizy.share.mapper.RolePermissionMapper;
import com.lizy.share.mapper.UserRoleMapper;
@Service
public class RoleService implements IRoleService {
	@Autowired
	private RoleMapper roleMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RolePermissionMapper rolePermissionMapper;
	@Override
	@Transactional
	public void delete(Role record) {
		// TODO Auto-generated method stub
		//首先删除role,然后删除user-role表中数据,然后删除role-permission中的数据
		record.setIsDel(IsDelEnum.Deleted.getIsDel());
		roleMapper.updateByPrimaryKey(record);
		//删除对应用户的角色信息
		userRoleMapper.deleteByRole(record);
		//删除角色对应的权限信息
		rolePermissionMapper.deleteByRole(record);
		
        
	}

	@Override
	public int add(Role record) {
		// TODO Auto-generated method stub
		//先查询对应的角色信息存不存在
		List<Role> roles=roleMapper.selectByRole(record);
		if(roles!=null || roles.size()==0) {
			long timeStamp=System.currentTimeMillis();
			record.setCreateTime(timeStamp);
			record.setUpdateTime(timeStamp);
			record.setIsDel(IsDelEnum.Normal.getIsDel());
			return roleMapper.insertSelective(record);
		}else{
			throw new MyException(UserExceptionRemark.USER_ROLE_EXISTED);			
		}
		
	}

	@Override
	public int update(Role record) {
		// TODO Auto-generated method stub
		record.setUpdateTime(System.currentTimeMillis());
		return roleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public PageData getPageData(RolePageData pageData) {
		pageData.setRows(roleMapper.selectPagedData(pageData));
		pageData.setTotal(roleMapper.selectPagedDataNum(pageData));
		return pageData;
	}

}
