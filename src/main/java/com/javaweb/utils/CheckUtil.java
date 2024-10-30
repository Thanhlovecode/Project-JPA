package com.javaweb.utils;

public class CheckUtil {
	public static boolean checkNumber(Integer number) {
		if(number !=null) {
			return true;
		}
		return false;
	}
	public static boolean checkString(String string) {
		if(string!= null  && !string.equals("")){
			return true;
		}
		return false;
	}

}
