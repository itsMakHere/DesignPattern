/**
 * 
 */
package com.calc.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * @author 212614077
 *
 */
public class CalculatorFactoryTest {
	
	
	@Test
	public void testGetCalculatorType() {
		CalculatorFactory cf = new CalculatorFactory();
		Calculator c = cf.getCalculatorType("NormalCalculator");
		assertThat(c,instanceOf(StandardCalculator.class));
		c = cf.getCalculatorType("ScientificCalculator");
		assertThat(c,instanceOf(ScientificCalculator.class));
	}
	
	@Test
	public void testGetCalculatorType1() {
		CalculatorFactory cf = new CalculatorFactory();
		Calculator c = cf.getCalculatorType("ScientificCalculator");
		assertThat(c,instanceOf(ScientificCalculator.class));
	}

}
