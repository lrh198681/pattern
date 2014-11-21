package com.andy.ClassAdaptor;

public class AdapteeCar extends RealCar implements Car {
	//类适配器，适配器解决实现类与接口类方法名不一致
//	private RealCar car = new RealCar();
	
	@Override
	public void engine() {
		this.realEngine();

	}

}
