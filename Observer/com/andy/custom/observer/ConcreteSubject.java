package com.andy.custom.observer;

public class ConcreteSubject extends Subject {
	private String state;
	
	public String getState(){
		return state;
	}
	
	public void changeState(String newState){
		this.state = newState;
		
		this.notifyAllObservers(state);
	}
}
