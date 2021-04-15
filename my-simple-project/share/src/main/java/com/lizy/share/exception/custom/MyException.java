package com.lizy.share.exception.custom;

public class MyException extends RuntimeException {
	/**
	 * 系统异常信息
	 */
	public enum SysExceptionRemark {
		SYS_PAGE_ERROR("000200", "您访问的页面不存在");
		private String code;
		private String remark;

		SysExceptionRemark() {

		}

		SysExceptionRemark(String code, String remark) {
			this.code = code;
			this.remark = remark;

		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}
	}
	/**
	 * 用户异常信息
	 */
	public enum UserExceptionRemark {
		USER_LOGIN_NOT_REGISTER("000100", "用户未注册!"), 
		USER_LOGIN_ERROR_PASSWORD("000101", "密码错误!!"), 
		USER_LOGIN_NOT_AVALIABLE("000102", "该账户不可用~"), 
		USER_LOGIN_TIMES_OUT("000103", "尝试次数超限!!"),
		USER_ADD_DUBBLE("000104", "登录名、用户名或者手机号已存在"),
		USER_ROLE_EXISTED("000105", "角色名称已经存在"),
		USER_PERMISSION_EXISTED("000106", "权限信息已经存在");
		private String code;
		private String remark;

		UserExceptionRemark() {

		}

		UserExceptionRemark(String code, String remark) {
			this.code = code;
			this.remark = remark;

		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}
	}
	private static final long serialVersionUID = 3649242873548941087L;
    private String code;
    private String remark;
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public MyException() {
		super();
	}	
	public MyException(UserExceptionRemark userExceptionRemark) {
		this.setCode(userExceptionRemark.getCode());
		this.setRemark(userExceptionRemark.getRemark());
		
	}
	public MyException(SysExceptionRemark sysExceptionRemark) {
		this.setCode(sysExceptionRemark.getCode());
		this.setRemark(sysExceptionRemark.getRemark());
	}

}
