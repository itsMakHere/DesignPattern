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
public class ScientificCalculatorTest {

	@Test
	public void calculateTest() {
		ScientificCalculator sc = new ScientificCalculator();
		String expr = "5+2*3";
		assertEquals(11,sc.calculate(expr));
	}

}
