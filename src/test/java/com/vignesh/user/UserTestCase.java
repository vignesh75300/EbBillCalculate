package com.vignesh.user;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vignesh.user.UserManager;

public class UserTestCase {

	@Test
	public void test1() {
		String customerId = "vig03324";
		String password = "Viki@75300";
		boolean actual = UserManager.isValidLogin(customerId, password);
		assertTrue(actual);
	}

	@Test
	public void test2() {
		String customerId = "vigne324";
		String password = "75300419";
		boolean actual = UserManager.isValidLogin(customerId, password);
		assertFalse(actual);
	}

	@Test
	public void test3() {
		String customerId = "vign3324";
		String password = "vigneshk";
		boolean actual = UserManager.isValidLogin(customerId, password);
		assertFalse(actual);
	}

	@Test
	public void test4() {
		String customerId = "vigneshk";
		String password = "7530041990";
		boolean actual = UserManager.isValidLogin(customerId, password);
		assertFalse(actual);
	}

	@Test
	public void test5() {
		String customerId = "12345678";
		String password = "viki@75300";
		boolean actual = UserManager.isValidLogin(customerId, password);
		assertFalse(actual);
	}

	@Test
	public void test6() {
		String customerId = "Vig 3324";
		String password = "viki75300";
		boolean actual = UserManager.isValidLogin(customerId, password);
		assertFalse(actual);
	}

}
