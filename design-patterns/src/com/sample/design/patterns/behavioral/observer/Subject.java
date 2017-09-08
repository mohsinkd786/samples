package com.sample.design.patterns.behavioral.observer;

public interface Subject {

	public void registerObserver(Listener observer);

	public void notifyObserver();

	public void unRegisterObserver(Listener observer);

	public Object getUpdate();

}