package com.lizy.share.entity;

import java.io.Serializable;
import java.util.List;

public class Permission implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String name;

    private String remark;

    private String parentId;

    private String parentIds;

    private String permission;

    private String resiurceType;

    private String url;
    
    private String css;
    private Integer sort;

    private Byte isDel;
    /**
     * 二级菜单
     */
    private List<Permission> childPermissions;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public String getResiurceType() {
        return resiurceType;
    }

    public void setResiurceType(String resiurceType) {
        this.resiurceType = resiurceType == null ? null : resiurceType.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public List<Permission> getChildPermissions() {
		return childPermissions;
	}
	

	public void setChildPermissions(List<Permission> childPermissions) {
		this.childPermissions = childPermissions;
	}
}