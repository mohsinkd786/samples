package com.sample.design.patterns.behavioral.observer;

public class MyListener {

	private Button buttn;
	//private String onClick;

	public void addEvent(Button button) {
		// button.id = "1";
		// button.name = "Save";
		this.buttn = button;
		//this.onClick="Save";
	}

	public void onClick() {
		//this.onClick =
				buttn.getUpdate();
		//System.out.println("Get On click " + this.onClick);
	}
	public void getOnClick() {
		//System.out.println("Get On click " + this.onClick);
	}
}
