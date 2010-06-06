package com.dp.singletom;

/**
 * singleton模式（单态）:
 * 某个class只能有一个实例
 *
 */
public class Unique {
	
	private static Unique onlyone;
	
	public static Unique getInstance(){
		if(onlyone == null){
			onlyone = new Unique();
		}
		return onlyone;
	}
	//必须是private的构造函数 以避免其他地方new
	private Unique(){
		
	}
}
