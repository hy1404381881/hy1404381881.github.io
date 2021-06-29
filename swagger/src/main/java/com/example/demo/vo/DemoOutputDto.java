package com.example.demo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;


/**
 * @author 14043
 */
@Data
public class DemoOutputDto {

    private String res;

    @NotNull
    @ApiModelProperty(value = "defaultOutputStr", example = "mockOutputStrValue")
    private String outputStrDemo;

    @NotNull
    @ApiModelProperty(example = "6666666", required = true)
    private Long outputLongNum;

    @NotNull
    @ApiModelProperty(example = "88888.888")
    private Double outputDoubleNum;

    @NotNull
    @ApiModelProperty(example = "2018-12-12T11:11:11.111Z")
    private Date outputDate;

}
