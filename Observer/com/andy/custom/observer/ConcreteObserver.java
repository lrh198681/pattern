package com.andy.custom.observer;

public class ConcreteObserver implements Observer {
	
	private String observerState;

	@Override
	public void update(String state) {
		this.observerState = state;
		
		System.out.println("state :" + observerState);

	}

}
