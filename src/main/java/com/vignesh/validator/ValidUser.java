package com.vignesh.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUser {
	
	/**
	 * This Function is Used to Validate the customerId
	 * @param customerId
	 * @return
	 */

	public static boolean isValidCustomerId(String customerId) {
		// If the customerId is empty return false

		if (customerId == null) {
			return false;
		}

		// ReGex to check valid customerId and Compile the ReGex
		Pattern p = Pattern.compile("[a-z]{3}[0-9]{5}");

		Matcher m = p.matcher(customerId);

		// Return if the customerId is matched the ReGex
		return m.matches();
	}
	
	/**
	 * Function to validate the password
	 * 
	 * @param password
	 * @return
	 */

	public static boolean isValidPassword(String password) {
		// If the password is empty return false
		if (password == null) {
			return false;
		}
		// ReGex to check valid customerId and Compile the ReGex
		Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");

		Matcher m = p.matcher(password);

		// Return if the password is matched the ReGex
		return m.matches();
	}
}
