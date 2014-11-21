package com.andy.Facade;

public class Test {

	public static void main(String[] args) {
		//外观模式解决客户一个功能需要调用多个子系统
		PhoneFacade iphone = new PhoneFacade();
		
		iphone.takePic();
		iphone.stopPic();

	}

}
