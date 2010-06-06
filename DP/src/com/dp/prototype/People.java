package com.dp.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *prototype模式(个人理解):
 * 类似于模板，用于生产多个对象，可以将一些相同的东西写成一个模板
 * 被克隆对象的所有变量都含有与原来的对象相同的值
 * 其实类似工厂模式
 *
 *PS:prototype有浅克隆，深克隆
 *两者主要区别:
 *前者仅仅克隆所考虑的对象，而不克隆它所引用的对象
 *后者克隆的对象的所有引用的对象都克隆了一遍
 *
 *☆:x.clone()!=x  x.clone().getClass() = x.getClass()
 */
public abstract class People implements Cloneable{

	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	/**
	 * 浅克隆
	 */
	@Override
	public Object clone(){
		Object object = null;
		
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}
	
	public void saySomething(){
		System.out.println("I'm can say something");
	}
	/**
	 * 深克隆
	 */
//	@Override
//	protected Object clone(){
//
//		ByteArrayOutputStream bo;
//		ObjectOutputStream oo;
//		ObjectInputStream oi;
//		Object object = null;
//		try {
//			
//			bo = new ByteArrayOutputStream();   
//			
//			oo = new ObjectOutputStream(bo);   
//			
//			oo.writeObject(this);        //read from stream   
//			ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());   
//			
//			oi = new ObjectInputStream(bi);   
//			object = oi.readObject();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return object;   
//	}
	

	
}
