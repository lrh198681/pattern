package com.andy.jdk.observer;

import java.util.Observable;

public class ConcreteSubject extends Observable {
	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {

		if (!this.data.equals(data)) {
			this.data = data;
			setChanged();
		}
		notifyObservers();
	}
}
