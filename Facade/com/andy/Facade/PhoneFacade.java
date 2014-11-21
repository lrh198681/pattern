package com.andy.Facade;

public class PhoneFacade {
	
	private Camera camera = new Camera();
	
	private Light light = new Light();
	
	public void takePic(){
		light.turnOnLight();
		camera.turnOnCamera();
	}
	
	public void stopPic(){
		light.turnOffLight();
		camera.turnOffCamera();
	}

}
