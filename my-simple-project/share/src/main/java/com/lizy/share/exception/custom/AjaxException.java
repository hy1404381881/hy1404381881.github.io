package com.lizy.share.exception.custom;

public class AjaxException extends RuntimeException {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 4613577040864798769L;
	
	public AjaxException(String message) {
		 super(message);
	}	
	 public AjaxException() {
		 super();
	 }

}
