package com.example.demo.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author 14043
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponse<T> implements Serializable {


    /**
     * 程序定义状态码
     */
    private int code;
    /**
     * 必要的提示信息
     */
    private String message;
    /**
     * 业务数据
     */
    private T datas;

    /**
     * 对业务数据单独处理
     * @return
     */
    @Override
    public String toString() {
        return "GenericResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", datas=" + datas +
                '}';
    }
}