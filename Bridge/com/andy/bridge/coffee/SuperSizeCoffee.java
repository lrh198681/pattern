package com.andy.bridge.coffee;

public class SuperSizeCoffee extends Coffee {

	//大杯冲三次咖啡
	@Override
	void pourCoffee() {
		for (int i = 0; i < 3; i++) {
			this.getCoffeeImpl().pourCoffeeImpl();
		}

	}

}
