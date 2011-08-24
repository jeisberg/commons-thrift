package com.lockerz.thrift.commons.utilities;

public class Utilities {
	
	public static boolean isNullOrEmpty(String target) {
		// return here
		return target == null || target.trim().equals("");
	}
	
	public static String slug(String target) {
		// return here
		return target;
	}
}