package com.sample.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSample {

	public static void main(String[] args) throws ScriptException {
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");

		String js;

		js = "var map = Array.prototype.map \n";
		js += "var names = [\"Mohsin\", \"Khursheed\", \"Dar\"]\n";
		js += "var a = map.call(names, function(name) { return name.length() })\n";
		js += "print(a)";

		engine.eval(js);
	}

}
