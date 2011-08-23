package com.lockerz.thrift.commons.utilities;

public class Utilities {
	
	public static boolean isNullOrEmpty(String target) {
		// return here
		return target == null || target.trim().equals("");
	}
	
	public static String echo(String target) {
		// return here
		return target;
	}
	
	public static String ping(String target) {
		// return here
		return target;
	}
}