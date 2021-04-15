package com.lizy.web.controller;

import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lizy.api.permission.IUserService;
import com.lizy.share.entity.User;
import com.lizy.share.exception.custom.DataInfo;
import com.lizy.web.util.JWTUtil;

@RestController
public class WebController extends BaseController {

    @Autowired
    private IUserService iUserService;
    @PostMapping("/login")    
    public DataInfo login(@Valid @RequestBody User user) {
        User userLogin = iUserService.getUserByLoginName(user.getLoginName());
        if (userLogin.getPassword().equals(user.getPassword())) {
           return DataInfo.getDataInfo(JWTUtil.sign(user.getLoginName(), user.getPassword()));
        } else {
            throw new UnauthorizedException();
        }
    }
    @GetMapping("/article")    
    public DataInfo article() {        
        if (getSubject().isAuthenticated()) {
            return DataInfo.getDataInfo("You are already logged in", null);
        } else {
            return DataInfo.getDataInfo("You are guest", null);
        }
    }

    @GetMapping("/require_auth")
    @RequiresAuthentication
    public DataInfo requireAuth() {
        return DataInfo.getDataInfo("You are authenticated", null);
    }

    @GetMapping("/require_role")
    @RequiresRoles("admin")
    public DataInfo requireRole() {
        return DataInfo.getDataInfo( "You are visiting require_role", null);
    }

    @GetMapping("/require_permission")
    @RequiresPermissions(value = {"userInfo:view", "userInfo:add"})
    public DataInfo requirePermission() {
        return DataInfo.getDataInfo( "You are visiting permission require edit,view", null);
    }

    @RequestMapping(path = "/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public DataInfo unauthorized() {
        return DataInfo.getDataInfo("Unauthorized", null);
    }
}
