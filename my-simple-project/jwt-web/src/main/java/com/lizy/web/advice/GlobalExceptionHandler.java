package com.lizy.web.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lizy.share.exception.custom.AjaxException;
import com.lizy.share.exception.custom.DataInfo;
import com.lizy.share.exception.custom.MyException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MyException.class)
	@ResponseBody
	public DataInfo myException(HttpServletRequest req,MyException e){
		DataInfo errInfo = new DataInfo();
		errInfo.setCode(DataInfo.ERROR);
		errInfo.setBusCode(e.getCode());
		errInfo.setMessage(e.getRemark());
		errInfo.setUrl(req.getRequestURI().toString());
		errInfo.setData(null);
		return errInfo;
	}
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
	/**
	 * model绑定异常
	 * @param req
	 * @param e
	 * @return
	 */
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
	/**
	 * 参数绑定一场
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	public DataInfo methodArgumentNotValidException(HttpServletRequest req,MethodArgumentNotValidException e) {
		DataInfo errInfo = new DataInfo();
		errInfo.setCode(DataInfo.ERROR);
		errInfo.setMessage(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
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
