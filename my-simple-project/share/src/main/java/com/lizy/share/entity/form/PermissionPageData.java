package com.lizy.share.entity.form;

public class PermissionPageData extends PageData {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2906053262119702774L;
	private String name;
	private String parentId;
	private String url;
	private String resiurceType;
	private String permission;
    
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResiurceType() {
		return resiurceType;
	}

	public void setResiurceType(String resiurceType) {
		this.resiurceType = resiurceType;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
	

}
