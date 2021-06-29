package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.rest.ResponseModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "工作流相关接口")
@RequestMapping("/act")
public class ActController {

    @GetMapping("/getUserById")
    @ApiOperation("添加用户的接口")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
                    @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", required = true)
            }
    )
    public User getUserById() {
        User user = new User();
        user.setUsername("aaa");
        user.setAddress("bbb");
        user.setId(1093);
        return user;
    }


    @GetMapping("/")
    @ApiOperation("根据id查询用户的接口")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99", required = true)
    public User getUserById(@PathVariable Integer id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    @PutMapping("/{id}")
    @ApiOperation("根据id更新用户的接口")
    public User updateUserById(@RequestBody User user) {
        user.setUsername("1111");
        user.setAddress("2222");
        user.setId(2018);
        return user;
    }

    @PutMapping("/{id}")
    @ApiOperation("查看泛型返回")
    public ResponseModel updateUserById(@RequestBody User user) {
        user.setUsername("1111");
        user.setAddress("2222");
        user.setId(2018);
        ResponseModel responseModel = new ResponseModel();
        return new responseModel.setData(user);
    }
}
