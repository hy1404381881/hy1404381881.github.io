package com.lizy.share.entity.form;

import java.io.Serializable;

public class PageData implements Serializable{
	/**
	 * 序列表示id
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 当前页码
	 */
	private int offset;
	/**
	 * 每一页有多少条数据
	 */
	private int limit;
	/**
	 * 查询出的对应数据的总条数
	 */
	private int total;
	/**
	 * 返回的分页查询数据
	 */
	private Object rows;
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Object getRows() {
		return rows;
	}
	public void setRows(Object rows) {
		this.rows = rows;
	}
	
	
	
	
	

}
