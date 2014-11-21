package com.andy.ObjectAdaptor;

public class AdapteeCar implements Car {
	//对象适配器，适配器解决实现类与接口类方法名不一致
	private RealCar car = new RealCar();
	
	@Override
	public void engine() {
		car.realEngine();

	}

}
