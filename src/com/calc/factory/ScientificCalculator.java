package com.calc.factory;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScientificCalculator implements Calculator {

	@Override
	public int calculate(String exp) {
		int result = 0;
		 ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		    try {
				System.out.println(engine.eval(exp));
				result = (int) engine.eval(exp);
			} catch (ScriptException e) {
				e.printStackTrace();
			} 
		return result;
	}
	

}
