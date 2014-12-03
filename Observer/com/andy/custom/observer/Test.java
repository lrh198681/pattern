package com.andy.custom.observer;

public class Test {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		Observer observer1 = new ConcreteObserver();
		Observer observer2 = new ConcreteObserver();
		
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		
		subject.changeState("新状态");

	}

}
