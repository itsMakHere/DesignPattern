/**
 * 
 */
package com.calc.factory;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author 212614077
 *
 */
public class StandardCalculatorTest {
	
	StandardCalculator sc = new StandardCalculator();

	/**
	 * Test method for {@link com.calc.factory.StandardCalculator#calculate(java.lang.String)}.
	 */
	@Test
	public void testCalculate() {
		String expr = "5+2*3";
		assertEquals(21,sc.calculate(expr));
	}

	/**
	 * Test method for {@link com.calc.factory.StandardCalculator#perfromOperation(char, int, int)}.
	 */
	@Test
	public void testPerfromOperation() {
		int firstNumber = 30;
		int secondNumber = 10;
		
		assertEquals("30 + 10 should be 40",40,sc.perfromOperation('+', firstNumber, secondNumber));
		assertEquals("30 - 10 should be 40",20,sc.perfromOperation('-', firstNumber, secondNumber));
		assertEquals("30 * 10 should be 40",300,sc.perfromOperation('*', firstNumber, secondNumber));
		assertEquals("30 / 10 should be 40",3,sc.perfromOperation('/', firstNumber, secondNumber));
		assertEquals(0,sc.perfromOperation('o', firstNumber, secondNumber));
		
		
		
		
	}

}
