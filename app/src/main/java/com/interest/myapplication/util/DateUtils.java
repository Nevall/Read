package com.interest.myapplication.util;
/**
 * 日期格式工具类
 */
public class DateUtils {
	/**
	 * 设置日期格式
	 */
	public static String convertDate(String date) {
		String result = date.substring(0,4);
		result += "年";
        result += date.substring(4, 6);
        result += "月";
        result += date.substring(6, 8);
        result += "日";
        return result;
	}

}
