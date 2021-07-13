package com.talent;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TalentTest {

	@Test
	public void testAddPass() {
		Calculator calculator = new Calculator();
		assertEquals("error in add() function", 3, calculator.add(1, 2));
		assertEquals("error in add() function", -3, calculator.add(-1, -2));
		assertEquals("error in add() function", 9, calculator.add(9, 0));
	}

	@Test
	public void testAddFail() {
		Calculator calculator = new Calculator();
		assertNotEquals("error in add() function", 0, calculator.add(1, 2));
	}

	@Test
	public void testSubPass() {
		Calculator calculator = new Calculator();
		assertEquals("error in sub() function", 1, calculator.sub(2, 1));
		assertEquals("error in sub() function", -1, calculator.sub(-2, -1));
		assertEquals("error in sub() function", 0, calculator.sub(2, 2));
	}

	@Test
	public void testSubFail() {
		Calculator calculator = new Calculator();
		assertNotEquals("error in sub() function", 0, calculator.sub(2, 1));
	}
}