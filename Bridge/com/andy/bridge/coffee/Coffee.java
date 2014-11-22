package com.andy.bridge.coffee;

public abstract class Coffee {

	private CoffeeImpl coffeeImpl;

	public CoffeeImpl getCoffeeImpl() {
		return coffeeImpl;
	}

	public void setCoffeeImpl(CoffeeImpl coffeeImpl) {
		this.coffeeImpl = coffeeImpl;
	}
	
	abstract void pourCoffee();
	
}
