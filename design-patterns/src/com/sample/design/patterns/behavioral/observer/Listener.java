package com.sample.design.patterns.behavioral.observer;

public interface Listener {

	public void update();

	public void setSubject(Subject subject);
}