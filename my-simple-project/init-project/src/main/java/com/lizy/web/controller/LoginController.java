package com.lizy.web.controller;

import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lizy.share.entity.User;
import com.lizy.share.exception.custom.DataInfo;
import com.lizy.share.exception.custom.MyException;
import com.lizy.share.exception.custom.MyException.UserExceptionRemark;

/**
 * 该控制器主要用于对shiro进行控制
 * 
 * @author River.li
 *
 */
@RestController
public class LoginController {

	
	// 退出的时候是get请求，主要是用于退出
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "";
	}

	// post登录
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	@ResponseBody
	public DataInfo login(@Valid User user) {		
		// 添加用户认证信息
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getLoginName(), user.getPassword());
		// 进行验证，这里可以捕获异常，然后返回对应信息
		try {
            // 执行登陆
			subject.login(usernamePasswordToken);
			user= (User) subject.getPrincipal();
			user.setPassword(null);
			subject.getSession().setAttribute("user",user);

       } catch ( UnknownAccountException e ) {    	   
           throw new MyException(UserExceptionRemark.USER_LOGIN_ERROR_PASSWORD);
        } catch ( IncorrectCredentialsException e ) {
        	throw new MyException(UserExceptionRemark.USER_LOGIN_ERROR_PASSWORD);
        } catch ( LockedAccountException e ) {
        	throw new MyException(UserExceptionRemark.USER_LOGIN_NOT_AVALIABLE);
        } catch ( ExcessiveAttemptsException e ) {
        	throw new MyException(UserExceptionRemark.USER_LOGIN_TIMES_OUT);
        }		
		return  DataInfo.getDataInfo("登陆成功",user);
		
	}

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

	// 登出
	@RequestMapping(value = "/logout")
	public String logout() {
		return "logout";
	}

	
}
