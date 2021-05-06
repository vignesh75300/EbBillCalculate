package com.vignesh.validator;



public class TestValidPassword {

	public static void main(String[] args) {
		String password = "Viki@75300";

		if (ValidUser.isValidPassword(password))
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");

	}
}
