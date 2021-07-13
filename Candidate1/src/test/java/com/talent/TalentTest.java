package com.talent;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class TalentTest {


	@InjectMocks
    Calculator calculator;
	
	

	@Test
	public void testAddPass() {
		assertEquals("error in add() function", 3, calculator.add(1, 2));
		assertEquals("error in add() function", -3, calculator.add(-1, -2));
		assertEquals("error in add() function", 9, calculator.add(9, 0));

	}

	@Test
	public void testAddFail() {
		assertNotEquals("error in add() function", 0, calculator.add(1, 2));
	}

	@Test
	public void testSubPass() {
		assertEquals("error in sub() function", 1, calculator.sub(2, 1));
		assertEquals("error in sub() function", -1, calculator.sub(-2, -1));
		assertEquals("error in sub() function", 0, calculator.sub(2, 2));
	}

	@Test
	public void testSubFail() {
		assertNotEquals("error in sub() function", 0, calculator.sub(2, 1));
	}
	

}