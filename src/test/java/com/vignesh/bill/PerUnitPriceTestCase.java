package com.vignesh.bill;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerUnitPriceTestCase {

	@Test
	public void test1() {
		int units = 100;
		String type = "Home";
		double perUnitPrice = BillManager.getPerUnitPrice(type, units);
		assertEquals(0.0f, perUnitPrice, 0);
	}

	@Test
	public void test2() {
		int units = 100;
		String type = "Commercial";
		double perUnitPrice = BillManager.getPerUnitPrice(type, units);
		assertEquals(10.0f, perUnitPrice, 0);
	}

	@Test
	public void test3() {
		int units = 100;
		String type = "Agriculture";
		double perUnitPrice = BillManager.getPerUnitPrice(type, units);
		assertEquals(5.0f, perUnitPrice, 0);
	}

	@Test
	public void test4() {
		int units = 200;
		String type = "Home";
		double perUnitPrice = BillManager.getPerUnitPrice(type, units);
		assertEquals(5.0f, perUnitPrice, 0);
	}

	@Test
	public void test5() {
		int units = 200;
		String type = "Commercial";
		double perUnitPrice = BillManager.getPerUnitPrice(type, units);
		assertEquals(20.0f, perUnitPrice, 0);
	}

	@Test
	public void test6() {
		int units = 200;
		String type = "Agriculture";
		double perUnitPrice = BillManager.getPerUnitPrice(type, units);
		assertEquals(10.0f, perUnitPrice, 0);
	}


	@Test(expected = IllegalArgumentException.class)
	public void test7() {
		int units = 200000;
		String type = "Agriculture";
		BillManager.getPerUnitPrice(type, units);
        
	}
}