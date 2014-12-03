package com.andy.jdk.observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

	public ConcreteObserver(Observable o){
        o.addObserver(this);
    }
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("状态发生改变：" + ((ConcreteSubject)o).getData());
		
	}

}
