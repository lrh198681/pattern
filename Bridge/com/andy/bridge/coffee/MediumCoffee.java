package com.andy.bridge.coffee;

public class MediumCoffee extends Coffee {

	//中杯冲两次咖啡
	@Override
	void pourCoffee() {
		for (int i = 0; i < 2; i++) {
			this.getCoffeeImpl().pourCoffeeImpl();
		}

	}

}
