package com.dp.facade;

/**
 *现在有两个抽屉: 抽屉1（有抽屉2的钥匙） 抽屉2（有文件） 
 *现在要拿抽屉2中的文件：打开抽屉1 拿到钥匙 打开抽屉2 取得文件
 *
 *
 */
class DrawerOne {

	void open(){
		System.out.println("第一个抽屉被打了");
	}
	
	void getKey(){
		System.out.println("得到了钥匙");
	}
	
}

class DrawerTwo{
	void open(){
		System.out.println("第二个抽屉被打开了");
	}
	
	void getFile(){
		System.out.println("得到文件");
	}
}

//客户端需要做的事情
public class NonFacade{
	public static void main(String[] args) {
		DrawerOne one = new DrawerOne();
		one.open();
		one.getKey();
		DrawerTwo two = new DrawerTwo();
		two.open();
		two.getFile();
	}
}
