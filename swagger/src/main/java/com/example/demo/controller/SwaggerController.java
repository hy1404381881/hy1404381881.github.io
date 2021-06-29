package com.example.demo.controller;

import com.example.demo.dto.DemoDto;
import com.example.demo.entity.User;
import com.example.demo.rest.ResponseModel;
import com.example.demo.vo.DemoOutputDto;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class SwaggerController {

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

    @GetMapping("/aah")
    @ApiOperation(value = "post请求调用示例", notes = "invokePost说明", httpMethod = "POST")
    public ResponseModel<DemoOutputDto> invokePost(@ApiParam(name = "传入对象", value = "传入json格式", required = true) @RequestBody @Valid DemoDto input) {
        return new ResponseModel();
    }

}
