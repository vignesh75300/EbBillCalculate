
package com.vignesh.bill;

public class TotalBill {
	/**
	 * This Function is Used to Calculate Total Bill.
	 * 
	 * @param type
	 * @param units
	 * @return
	 */
	public static double getBill(String type, int units) {
		if(units < 0 || units > 100000) {
			throw new IllegalArgumentException("Invalid Unit");
		}
		double perUnitPrice = BillManager.getPerUnitPrice(type, units);
		double totalBill = perUnitPrice * units;
		return totalBill;
	}

}