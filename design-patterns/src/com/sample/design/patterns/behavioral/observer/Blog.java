package com.sample.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {

	List<Listener> observersList;
	private boolean stateChange;

	public Blog() {
		this.observersList = new ArrayList<>();
		stateChange = false;
	}

	public void postNewArticle() {
		stateChange = true;
		notifyObserver();
	}
	
	
	
	
	

	public void notifyObserver() {

		if (stateChange) {
			for (Listener listener : observersList) {
				listener.update();
			}
		}
	}

	public Object getUpdate() {
		Object changedState = null;
		
		// should have logic to send the
		// state change to querying observer
		if (stateChange) {
			changedState = "Observer Design Pattern";
		}
		return changedState;
	}

	
	
	
	
	
	
	
	public void registerObserver(Listener observer) {
		observersList.add(observer);
	}

	public void unRegisterObserver(Listener observer) {
		observersList.remove(observer);
	}
}
