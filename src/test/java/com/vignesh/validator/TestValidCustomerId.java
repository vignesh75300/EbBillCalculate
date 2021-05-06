package com.vignesh.validator;


public class TestValidCustomerId {

	public static void main(String[] args) {
		String customerId = "vig03324";

		if (ValidUser.isValidCustomerId(customerId))
			System.out.println("Valid Customer Id");
		else
			System.out.println("Invalid Customer Id");
	}
}
