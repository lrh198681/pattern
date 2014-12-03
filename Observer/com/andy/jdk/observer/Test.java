package com.andy.jdk.observer;

import java.util.Observable;
import java.util.Observer;

public class Test {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		Observer observer1 = new ConcreteObserver(subject);
		Observer observer2 = new ConcreteObserver(subject);
		
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		
		subject.setData("新状态");

	}

}
