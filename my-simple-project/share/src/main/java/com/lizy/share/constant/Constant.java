package com.lizy.share.constant;

public class Constant {
	//
	public static final String PREFIX="my-shiro-session:";
	// session 在redis过期时间是30分钟30*60
	public static final int EXPIRE_TIME=30*60;
	/**
	 * jwt token的过期时间 3天
	 */
	public static final int EXPIRE_TIME_JWT=3*24*60*60*1000;
	public  static final String REDIS_SHIRO_CACHE = "weiyou-shiro-cache:";

}
