package com.lizy.web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.lizy.share.entity.User;
/**
 * 父类控制器
 * @author River.li
 *
 */
public class BaseController {
	//获取用户信息
	public User getUser() {
		Subject subject = SecurityUtils.getSubject();
		User user = (User) subject.getSession().getAttribute("user");
		return user;
	}
    //设置用户信息
	public void setUser(User user) {

		Subject subject = SecurityUtils.getSubject();
		subject.getSession().setAttribute("user", user);
	}
    //获取认证信息
	public Subject getSubject() {
		return SecurityUtils.getSubject();
	}
}
