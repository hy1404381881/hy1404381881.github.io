package com.lizy.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lizy.api.permission.IPermissionService;
import com.lizy.api.permission.IRoleService;
import com.lizy.api.permission.IUserService;
import com.lizy.share.entity.Permission;
import com.lizy.share.entity.User;
import com.lizy.share.entity.form.PageData;
import com.lizy.share.entity.form.PermissionPageData;
import com.lizy.share.entity.form.UserPageData;
import com.lizy.share.exception.custom.DataInfo;

@RestController
@RequestMapping(value="manage")
public class ManageController extends BaseController {
	@Autowired
    private IUserService iUserService;
	@Autowired
	private IRoleService iRoleService;
	@Autowired
	private IPermissionService iPermissionService;
	@RequiresAuthentication
	@RequestMapping(value="menuUserList",method=RequestMethod.GET)
	public DataInfo menuUserList(){
		return DataInfo.getDataInfo(iUserService.getMenuPermissions(getUser()));
	}
	
	@RequestMapping(value="userListTest",method=RequestMethod.GET)
	public PageData userList(PageData pageData){
		List<User> list=new ArrayList<>();
		for(int i=0;i<192;i++) {
			User user=new User();
			user.setId(i+1);
			user.setLoginName("loginName"+String.valueOf(i+1));
			list.add(user);
		}
		pageData.setRows(list.stream().skip(pageData.getOffset()).limit(pageData.getLimit()).collect(Collectors.toList()));
		pageData.setTotal(192);
		return pageData;
	}
	@RequiresAuthentication
	@RequestMapping(value="userList",method=RequestMethod.GET)
	public PageData userList(UserPageData pageData){
		iUserService.getUserPageData(pageData);
		return pageData;
	}
	@RequiresAuthentication
	@RequestMapping(value="user/{id}",method=RequestMethod.GET)
	public DataInfo user(@PathVariable(value="id")Integer id){
		User user=iUserService.getUserById(id);
		if(user==null) {
			return DataInfo.getDataError();
		}
		return DataInfo.getDataInfo(user);
	}
	
	@RequiresAuthentication
	@RequestMapping(value="userAdd",method=RequestMethod.POST)
	public DataInfo userAdd(@RequestBody User user) {
		iUserService.add(user);
		return DataInfo.getDataInfo();
	}
	@RequiresAuthentication
	@RequestMapping(value="userUpdate",method=RequestMethod.POST)
	public DataInfo userUpdate(@RequestBody User user) {
		iUserService.update(user);
		return DataInfo.getDataInfo();
	}
	@RequiresAuthentication
	@RequestMapping(value="userDelete/{ids}",method=RequestMethod.POST)
	public DataInfo userDelete(@PathVariable(value="ids")String ids) {
		iUserService.deleteBulk(ids);
		return DataInfo.getDataInfo();
	}
	@RequiresAuthentication
	@RequestMapping(value="menuList",method=RequestMethod.GET)
	public PageData menuList(PermissionPageData pageData) {
		iPermissionService.getPageData(pageData);
		return pageData;
	}
	
	
	

}
