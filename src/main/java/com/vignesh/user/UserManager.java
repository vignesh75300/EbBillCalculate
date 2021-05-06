package com.vignesh.user;

import java.util.ArrayList;
import java.lang.String;

public class UserManager {
	static ArrayList<User> userList = new ArrayList<User>();
	static {
		User user = new User();
		String name = "vignesh";

		user.name = name;
		user.mobileNo = 7530041990L;

		String consumerNo = "03349003324";
		user.consumerNumber = consumerNo;

		String subStr = name.substring(0, 3);
		String subStr1 = consumerNo.substring(consumerNo.length() -5, consumerNo.length());
		String custId = subStr + subStr1;

		user.customerId = custId;

		user.password = "Viki@75300";
		userList.add(user);

	}

	/**
	 * This function is used to display user details
	 */

	public static void display() {

		for (User user : userList) {
			System.out.println(user.name + "\n" + user.mobileNo + "\n" + user.consumerNumber + "\n" + user.customerId
					+ "\n" + user.password);

		}
	}

	/**
	 * This Function is Used to validate the login
	 * 
	 * @param CustomerId
	 * @param Password
	 * @return
	 */

	public static boolean isValidLogin(String customerId, String password) {
		boolean exist = false;
		for (User login : userList) {
			if (login.customerId.equalsIgnoreCase(customerId) && login.password.equals(password)) {
				exist = true;
				break;
			}

		}
		return exist;
	}

}