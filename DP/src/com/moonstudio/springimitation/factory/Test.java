package com.moonstudio.springimitation.factory;

import java.util.Properties;

public class Test {

	public static void main(String[] args) throws Exception {

		// 读配置文件
		Properties pros = new Properties();
		pros.load(Test.class.getClassLoader().getResourceAsStream(
				"com/moonstudio/springimitation/factory/spring.properties"));
		String vehicleTypeName = pros.getProperty("VehicleType");
		System.out.println(vehicleTypeName);
		Object o = Class.forName(vehicleTypeName).newInstance();
		Moveable m = (Moveable) o;
		m.run();
		
		
	}

}
