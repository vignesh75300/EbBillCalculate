package com.vignesh.validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vignesh.validator.ValidUser;

public class ValidPasswordTestCase {

	@Test
	public void test1() {
		String password = "Viki@75300";
		boolean actual = ValidUser.isValidPassword(password);
		assertTrue(actual);

	}

	@Test
	public void test2() {
		String password = "viki@75300";
		boolean actual = ValidUser.isValidPassword(password);
		assertFalse(actual);

	}

	@Test
	public void test3() {
		String password = "vigneshk";
		boolean actual = ValidUser.isValidPassword(password);
		assertFalse(actual);

	}

	@Test
	public void test4() {
		String password = "75300419";
		boolean actual = ValidUser.isValidPassword(password);
		assertFalse(actual);

	}

	@Test
	public void test5() {
		String password = "Viki 75300";
		boolean actual = ValidUser.isValidPassword(password);
		assertFalse(actual);
	}

	@Test
	public void test6() {
		String password = " ";
		boolean actual = ValidUser.isValidPassword(password);
		assertFalse(actual);
	}
}