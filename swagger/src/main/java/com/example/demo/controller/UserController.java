package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.exception.MyException;
import com.example.demo.repository.UserRepository;
import com.example.demo.rest.GenericResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.UUID;

/**
 * @author 14043
 */
@Api(value = "userController", tags = {"用户"})
@RestController
@RequestMapping("users")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户的详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
    @GetMapping(value = "/{id}")
    public GenericResponse<User> get(@PathVariable Long id) {
        User user;
        try {
            user = userRepository.findUserById(id);
        } catch (Exception e) {
            user = null;
            throw new MyException(50004, e);
        }
        return new GenericResponse(200, "", user);
    }

    @ApiOperation(value = "增加用户", notes = "根据user对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细信息User", required = true, dataType = "User")
    @PostMapping()
    public GenericResponse<User> add(@RequestBody User user) {
        String password = UUID.randomUUID().toString();
        user.setPassword(password);
        user = userRepository.save(user);

        return new GenericResponse(200, "", user);
    }


    @ApiOperation(value = "删除用户", notes = "根据url的id来删除用户")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public GenericResponse<User> delete(@PathVariable Long id) {
        userRepository.deleteById(id);
        return new GenericResponse(200, "", "ID为" + id + "的用户删除成功");
    }

    @ApiOperation(value = "更新用户", notes = "根据url的id来更新用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path"),
            @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User")
    })

    @PutMapping(value = "/{id}")
    public GenericResponse<User> update(@PathVariable Long id, @RequestBody User user) {
        User user1 = userRepository.findUserById(id);
        user1.setGender(user.getGender());
        user1.setMobile(user.getMobile());
        user1.setRealName(user.getRealName());
        user1.setUpdateAt(new Date(System.currentTimeMillis()));

        return new GenericResponse(200, "", user1);
    }

    @ApiOperation(value = "更新用户局部信息", notes = "根据url的id来更新用户局部信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path"),
            @ApiImplicitParam(name = "realname", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "mobile", value = "联系方式", required = true, dataType = "String")
    })

    @PatchMapping(value = "/{id}")
    public GenericResponse<User> patch(@PathVariable Long id, String realName, String mobile) {
        User user = userRepository.findUserById(id);
        user.setRealName(realName);
        user.setMobile(mobile);

        return new GenericResponse(200, "", userRepository.saveAndFlush(user));
    }

    @ApiOperation(value = "获取用户信息列表", notes = "获取用户信息列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "int"),
            @ApiImplicitParam(name = "size", value = "单页条数", required = true, dataType = "int")
    })
    @GetMapping()
    public GenericResponse<User> list(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {
        Pageable pageable = new PageRequest(page - 1, size);
        Page<User> pageList = userRepository.findAll(pageable);
        return new GenericResponse(200, "", pageList);
    }


    @ApiOperation(value = "筛选获取用户信息列表", notes = "筛选获取用户信息列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "关键字", required = true, dataType = "String"),
            @ApiImplicitParam(name = "startDate", value = "开始时间", required = true, dataType = "Date"),
            @ApiImplicitParam(name = "endDate", value = "结束时间", required = true, dataType = "Date"),
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "int"),
            @ApiImplicitParam(name = "size", value = "单页条数", required = true, dataType = "int")
    })
    @GetMapping(value = "/pageList")
    public GenericResponse<User> pageList(
            @RequestParam(name = "key") String key,
            @RequestParam(name = "startDate") Date startDate,
            @RequestParam(name = "endDate") Date endDate,
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {
        Pageable pageable = new PageRequest(page - 1, size);
        Page<User> pageList = userRepository.pageList(key, startDate, endDate, pageable);
        return new GenericResponse(200, "", pageList);
    }


}