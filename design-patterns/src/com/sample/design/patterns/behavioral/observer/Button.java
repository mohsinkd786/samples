package com.sample.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Button {

	public String id;
	public String name;
	private boolean stateChange = false;
	private List<MyListener> listeners = new ArrayList<>();

	public void notifyObserver() {

		if (stateChange) {
			listeners.get(0).onClick();
		}
	}

	public void addListener(MyListener listener) {
		listeners.add(listener);
	}

	public void removeListener(MyListener listener) {
		listeners.remove(listener);
	}

	public void onClick() {
		System.out.println("On Click Button");
		notifyObserver();
	}

	public String getUpdate() {
		String changedState = null;
		if (stateChange) {
			changedState = "Observer Design Pattern";
		}
		return changedState;
	}
}
