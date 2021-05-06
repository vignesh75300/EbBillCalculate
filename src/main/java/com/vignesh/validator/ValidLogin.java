package com.vignesh.validator;

public class ValidLogin 
{

	public static boolean isValidLogin(String customerId, String password) {
		boolean exist = false;
		   
			if ( ValidUser.isValidCustomerId(customerId) && ValidUser.isValidPassword(password)) {
				exist = true;
				
			}
        return exist;
	}


}
