package com.lizy.web.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lizy.share.exception.custom.AjaxException;
import com.lizy.share.exception.custom.DataInfo;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(AjaxException.class)
	@ResponseBody
	public DataInfo ajaxException(HttpServletRequest req,Exception e){
		DataInfo errInfo = new DataInfo();
		errInfo.setCode(DataInfo.ERROR);
		errInfo.setMessage(e.getMessage());
		errInfo.setUrl(req.getRequestURI().toString());
		errInfo.setData(null);
		return errInfo;
	}
	@ExceptionHandler(BindException.class)
	@ResponseBody
	public DataInfo validateModelException(HttpServletRequest req,BindException e) {
		DataInfo errInfo = new DataInfo();
		errInfo.setCode(DataInfo.ERROR);
		errInfo.setMessage(e.getBindingResult().getFieldError().getDefaultMessage());
		errInfo.setUrl(req.getRequestURI().toString());
		errInfo.setData(null);
		return errInfo;
	}
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public DataInfo systemException(HttpServletRequest req,Exception e){
		DataInfo errInfo = new DataInfo();
		errInfo.setCode(DataInfo.ERROR);
		errInfo.setMessage(e.getMessage());
		errInfo.setUrl(req.getRequestURI().toString());
		errInfo.setData(null);
		return errInfo;
	}


}
