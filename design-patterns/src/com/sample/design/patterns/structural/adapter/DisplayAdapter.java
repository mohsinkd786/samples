package com.sample.design.patterns.structural.adapter;

import java.util.List;

public class DisplayAdapter implements DisplayList {

	@Override
	public void print(Object l) {
		// call the class from here to map bind the two together
		// Converting ArrayList to String so that we can pass String to
		// adaptee class
		String str = String.valueOf(l);

		/*for (String s : l) {
			str += s + "\t";
		}*/
		
		Display display = new Display();
		display.print(str);
	}
}
