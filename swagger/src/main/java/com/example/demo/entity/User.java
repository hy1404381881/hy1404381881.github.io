package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class User implements Serializable {

    @ApiModelProperty(value = "用户id")
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "性别")
    private String gender;


    @ApiModelProperty(value = "用户地址")
    private String address;


    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "更新时间")
    private Date updateAt;



}

