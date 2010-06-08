package com.moonstudio.dp.factory.springimitation;

import java.util.Properties;

public class Test {

	public static void main(String[] args) throws Exception {
	
		
		// =============================================================
		// 现在我们自己写配置，读配置
		// 在Spring中，就是applicationContext.xml
		// =============================================================

		// 读配置文件：这个就可以写个工厂了
		Properties pros = new Properties();
		pros.load(Test.class.getClassLoader().getResourceAsStream(
				"com/moonstudio/dp/factory/springimitation/spring.properties"));
		String vehicleTypeName = pros.getProperty("VehicleType");
		System.out.println(vehicleTypeName);
		Object o = Class.forName(vehicleTypeName).newInstance();
		Moveable m = (Moveable) o;
		m.run();
		// =============================================================
		// 下面是Spring(我们自己的)的写法.它的叫法：bean容器,bean工厂,IOC
		// =============================================================

		 BeanFactory factory = new ClassPathXmlApplicationContext("com/moonstudio/dp/factory/springimitation/applicationContext.xml");
		 //id是配置中beans-bean的id
		 //Object o = factory.getBean("id");
		Moveable m2 = (Moveable) factory.getBean("VehicleType");
		m2.run();

	}

}
