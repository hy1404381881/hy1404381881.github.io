package com.lizy.web.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lizy.api.permission.IUserService;
import com.lizy.share.entity.User;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
	@Autowired
	private IUserService iUserService;

	// 错误页面展示
	@RequestMapping(value = "/error", method = RequestMethod.POST)
	public String error() {

		return "error ok!";
	}

	// 数据初始化
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(User user) {
		iUserService.add(user);
		return "addUser is ok! \n";
	}

	/*
	 * //角色初始化
	 * 
	 * @RequestMapping(value = "/addRole") public String addRole(@RequestBody
	 * Map<String,Object> map){ Role role = loginService.addRole(map); return
	 * "addRole is ok! \n" + role; }
	 */

	// 注解的使用
	@RequiresRoles("admin")
	@RequiresPermissions("create")
	@RequestMapping(value = "/create")
	public String create() {
		return "Create success!";
	}

	/**
	 * 用户查询.
	 * 
	 * @return
	 */
	@RequestMapping("/userList")
	@RequiresPermissions("userInfo:view") // 权限管理;
	public String userInfo() {
		return "userInfo";
	}

	/**
	 * 用户添加;
	 * 
	 * @return
	 */
	@RequestMapping("/userAdd")
	@RequiresPermissions("userInfo:add") // 权限管理;
	public String userInfoAdd() {
		return "userInfoAdd";
	}

	/**
	 * 用户删除;
	 * 
	 * @return
	 */
	@RequestMapping("/userDel")
	@RequiresPermissions("userInfo:del") // 权限管理;
	public String userDel() {
		return "userInfoDel";
	}
}