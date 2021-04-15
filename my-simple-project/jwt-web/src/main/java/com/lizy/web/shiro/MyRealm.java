package com.lizy.web.shiro;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lizy.api.permission.IUserService;
import com.lizy.share.entity.Permission;
import com.lizy.share.entity.Role;
import com.lizy.share.entity.User;
import com.lizy.web.util.JWTUtil;

@Service
public class MyRealm extends AuthorizingRealm {

	@Autowired
	private IUserService iUserService;

	/**
	 * 大坑！，必须重写此方法，不然Shiro会报错
	 */
	@Override
	public boolean supports(AuthenticationToken token) {
		return token instanceof JWTToken;
	}

	/**
	 * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = JWTUtil.getUsername(principals.toString());
		User user = iUserService.getUserAndRolesByLoginName(username);
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		  for (Role role:user.getRoles()) {
	            //添加角色
	            simpleAuthorizationInfo.addRole(role.getName());
	            List<Permission> permissions=iUserService.getPermissionByRole(role);
	            for (Permission permission:permissions) {
	                //添加权限
	                simpleAuthorizationInfo.addStringPermission(permission.getPermission());
	            }
	        }
		  System.out.println("=====================授权=======================");
        return simpleAuthorizationInfo;
	}

	/**
	 * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws AuthenticationException {
		String token = (String) auth.getCredentials();
		// 解密获得username，用于和数据库进行对比
		String username = JWTUtil.getUsername(token);
		if (username == null) {
			throw new AuthenticationException("token invalid");
		}

		User user = iUserService.getUserByLoginName(username);
		if (user == null) {
			throw new AuthenticationException("User didn't existed!");
		}

		if (!JWTUtil.verify(token, username, user.getPassword())) {
			throw new AuthenticationException("Username or password error");
		}
		//=============================================
		//设置用户信息
		Subject subject = SecurityUtils.getSubject();
		subject.getSession().setAttribute("user", user);
		//==============================================
		System.out.println("=====================认证=======================");
		return new SimpleAuthenticationInfo(token, token, "my_realm");
	}
}
