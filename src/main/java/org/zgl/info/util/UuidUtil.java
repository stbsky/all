package org.zgl.info.util;

import java.util.UUID;

public class UuidUtil {

	public static String get32UUID() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}
	
	public static void main(String[] args) {
		//System.out.println(get32UUID());
		//System.out.println(get32UUID());
		System.out.println(getMoveUUID());
		System.out.println(getMoveUUID());
	}
	
	public static String getMoveUUID(){
		String uuid = String.valueOf(System.currentTimeMillis());
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uuid;
	}
}

