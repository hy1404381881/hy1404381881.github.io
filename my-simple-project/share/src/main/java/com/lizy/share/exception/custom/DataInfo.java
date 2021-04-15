package com.lizy.share.exception.custom;

import java.io.Serializable;

public class DataInfo implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4958076206575013878L;
	public static final String  OK = "200";
	public static final String  ERROR = "500";
	
	private String code;
	private String busCode;
	private String message;
	private String url;
	private Object data;
	public static DataInfo getDataInfo() {
		return new DataInfo(OK);
	}
	public static DataInfo getDataInfo(Object data) {
		return new DataInfo(OK,null,null,data);
	}
	public static DataInfo getDataInfo(String message,Object data) {
		return new DataInfo(OK,message,null,data);
	}
	public static DataInfo getDataInfo(String message,String url,Object data) {
		return new DataInfo(OK,message,url,data);
	}
	public static DataInfo getDataError() {
		return new DataInfo(ERROR);
	}
	public static DataInfo getDataError(Object data) {
		return new DataInfo(ERROR,null,null,data);
	}
	public static DataInfo getDataError(String message,Object data) {
		return new DataInfo(ERROR,message,null,data);
	}
	public static DataInfo getDataError(String message,String url,Object data) {
		return new DataInfo(ERROR,message,url,data);
	}
	public DataInfo() {
		
	}
	
	private DataInfo(String code) {
		this.code = code;
		
	}
	
	private DataInfo(String code,String message) {
		this.code = code;
		this.message = message;	
	}
	
	private DataInfo(String code,String message,String url) {
		this.code = code;
		this.message = message;	
		this.url = url;
	}
	
	private DataInfo(String code,String message,String url,Object data) {
		this.code = code;
		this.message = message;	
		this.url = url;
		this.data = data;
	}
 
	public String getCode() {
		return code;
	}
 
	public void setCode(String code) {
		this.code = code;
	}
 
	public String getMessage() {
		return message;
	}
 
	public void setMessage(String message) {
		this.message = message;
	}
 
	public String getUrl() {
		return url;
	}
 
	public void setUrl(String url) {
		this.url = url;
	}
 
	public Object getData() {
		return data;
	}
 
	public void setData(Object data) {
		this.data = data;
	}
 
	public static String getOk() {
		return OK;
	}
 
	public static String getError() {
		return ERROR;
	}
 
	public String getBusCode() {
		return busCode;
	}
	public void setBusCode(String busCode) {
		this.busCode = busCode;
	}
	@Override
	public String toString() {
		return "ErrorInfo [code=" + code + ", message=" + message + ", url=" + url +",busCode="+busCode+ "]";
	}

}
