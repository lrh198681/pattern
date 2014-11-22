package com.andy.bridge.coffee;

public class MilkCoffeeImp extends CoffeeImpl {

	//加不加牛奶行为的具体实现
	@Override
	public void pourCoffeeImpl() {
		System.out.println("加了牛奶的咖啡");

	}

}
