package com.vignesh.bill;

import java.util.ArrayList;

public class BillManager {

	static ArrayList<UnitPrice> list = new ArrayList<UnitPrice>();
	static {
		UnitPrice unitPriceHome = new UnitPrice();
		unitPriceHome.minUnit = 0;
		unitPriceHome.price = 0.0;
		unitPriceHome.maxUnit = 100;
		unitPriceHome.type = "Home";

		UnitPrice unitPriceCom = new UnitPrice();
		unitPriceCom.minUnit = 0;
		unitPriceCom.price = 10.0;
		unitPriceCom.maxUnit = 100;
		unitPriceCom.type = "Commercial";

		UnitPrice unitPriceAgri = new UnitPrice();
		unitPriceAgri.minUnit = 0;
		unitPriceAgri.price = 5.0;
		unitPriceAgri.maxUnit = 100;
		unitPriceAgri.type = "Agriculture";

		UnitPrice unitPriceHome1 = new UnitPrice();
		unitPriceHome1.minUnit = 101;
		unitPriceHome1.price = 5.0;
		unitPriceHome1.maxUnit = 200;
		unitPriceHome1.type = "Home";

		UnitPrice unitPriceCom1 = new UnitPrice();
		unitPriceCom1.minUnit = 101;
		unitPriceCom1.price = 20.0;
		unitPriceCom1.maxUnit = 200;
		unitPriceCom1.type = "Commercial";

		UnitPrice unitPriceAgri1 = new UnitPrice();
		unitPriceAgri1.minUnit = 101;
		unitPriceAgri1.price = 10.0;
		unitPriceAgri1.maxUnit = 200;
		unitPriceAgri1.type = "Agriculture";

		UnitPrice unitPriceHome2 = new UnitPrice();
		unitPriceHome2.minUnit = 201;
		unitPriceHome2.price = 10.0;
		unitPriceHome2.maxUnit = 300;
		unitPriceHome2.type = "Home";

		UnitPrice unitPriceCom2 = new UnitPrice();
		unitPriceCom2.minUnit = 201;
		unitPriceCom2.price = 30.0;
		unitPriceCom2.maxUnit = 300;
		unitPriceCom2.type = "Commercial";

		UnitPrice unitPriceAgri2 = new UnitPrice();
		unitPriceAgri2.minUnit = 201;
		unitPriceAgri2.price = 20.0;
		unitPriceAgri2.maxUnit = 300;
		unitPriceAgri2.type = "Agriculture";
		
		UnitPrice unitPriceAgri3 = new UnitPrice();
		unitPriceAgri3.minUnit = 301;
		unitPriceAgri3.maxUnit = 100000;
		unitPriceAgri3.price = 50.0;
		unitPriceAgri2.type = "Agriculture";
		

		list.add(unitPriceHome);
		list.add(unitPriceCom);
		list.add(unitPriceAgri);
		list.add(unitPriceHome1);
		list.add(unitPriceCom1);
		list.add(unitPriceAgri1);
		list.add(unitPriceHome2);
		list.add(unitPriceCom2);
		list.add(unitPriceAgri2);
		list.add(unitPriceAgri3);

	}

	/**
	 * This Function is Used to Calculate Per Unit Price
	 * 
	 * @param type
	 * @param units
	 * @return
	 */
	public static double getPerUnitPrice(String type, int units) {

		if(units < 0 || units > 100000) {
			throw new IllegalArgumentException("Invalid Unit");
		}
		double perUnitPrice = 0;
		for (UnitPrice unitPrice : list) {
			if (unitPrice.type.equalsIgnoreCase(type) && units >= unitPrice.minUnit && units <= unitPrice.maxUnit) {
				perUnitPrice = unitPrice.price;
				break;
			}
			
			}
		
		return perUnitPrice;

	}
	

}