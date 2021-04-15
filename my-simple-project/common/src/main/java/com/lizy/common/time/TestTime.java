package com.lizy.common.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTime {
	public static void printTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
	}
	public static void main(String[] args) {
		printTime();
	}

}
