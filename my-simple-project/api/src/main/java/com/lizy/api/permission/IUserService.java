package com.lizy.api.permission;

import java.util.List;

import com.lizy.share.entity.Permission;
import com.lizy.share.entity.Role;
import com.lizy.share.entity.User;
import com.lizy.share.entity.form.PageData;
import com.lizy.share.entity.form.UserPageData;

public interface IUserService {
	public User getUserAndRolesByMobileAndPassword(User user);
	/**
	 * 根据角色获取用户权限信息
	 * @param role
	 * @return
	 */
	public List<Permission> getPermissionByRole(Role role);
	/**
	 * 根据Id获取用户信息
	 * @param id
	 * @return
	 */
	public User getUserById(Integer id) ;
	/**
	 * 根据手机号获取用户信息
	 * @param mobile
	 * @return
	 */
	public User getUserByMobile(String mobile) ;
	/**
	 * 添加用户
	 * @param user
	 */
	public void add(User user);
	/**
	 * 更新用户
	 * @param user
	 */
	public void update(User user);
	/**
	 * 删除用户
	 * @param user
	 */
	public void delete(User user) ;
	/**
	 * 根据登录名获取用户信息
	 * @param mobile
	 * @return
	 */
	public User getUserByLoginName(String loginName) ;
	/**
	 * 根据登录名获取用户和角色信息
	 * @param loginName
	 * @return
	 */
	public User getUserAndRolesByLoginName(String loginName);
	/**
	 * 根据用户信息获取菜单信息
	 * @param user
	 * @return
	 */
	public List<Permission> getMenuPermissions(User user);
	/**
	 * 获取用户的分页数据
	 * @param userPageData
	 * @return
	 */
	public PageData getUserPageData(UserPageData userPageData);
	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteBulk(String ids);
	
	
}
