package com.andy.ObjectAdaptor;

public class AdapteeCar implements Car {
	
	private RealCar car = new RealCar();
	
	@Override
	public void engine() {
		car.realEngine();

	}

}
