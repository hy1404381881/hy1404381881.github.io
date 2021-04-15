package com.lizy.share.enums;
/**
 * 枚举类型，是否删除;-1,已删除;0正常状态，默认没删除状态
 * @author River.li
 *
 */
public enum IsDelEnum {
	Normal((byte)0),Deleted((byte)-1);
	private Byte isDel;
	IsDelEnum(byte isDel) {
		this.isDel=new Byte(isDel);
	}
	public Byte getIsDel() {
		return isDel;
	}
	public void setIsDel(Byte isDel) {
		this.isDel = isDel;
	}
	public static void main(String[] args) {
		IsDelEnum[] dels=IsDelEnum.values();
		for (IsDelEnum isDelEnum : dels) {
			System.out.println(isDelEnum.isDel.intValue());
		}
	}
}
