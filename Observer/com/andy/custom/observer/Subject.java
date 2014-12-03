package com.andy.custom.observer;

import java.util.ArrayList;

public abstract class Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer){
		this.observers.add(observer);
	}
	
	public void removeObserver(Observer observer){
		this.observers.remove(observer);
	}
	
	//通知所有观察者
	public void notifyAllObservers(String newState){
		
		for (Observer observer : observers) {
			observer.update(newState);
		}
		
	}
	
}
