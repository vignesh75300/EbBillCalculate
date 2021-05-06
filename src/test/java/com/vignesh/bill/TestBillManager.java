package com.vignesh.bill;

class TestBillManager {
	public static void main(String args[]) {

		System.out.println("-----------------------------------------------------");
		System.out.println("|                                                    |");
		System.out.println("|                 EB-BILL-CALCULATION                |");
		System.out.println("|                                                    |");
		System.out.println("-----------------------------------------------------");
		System.out.println("\n--------------------------------------");
		System.out.println("|     Calculation for 100 Units:       |");
		System.out.println("----------------------------------------\n");
		int units = 100;
		String type1 = "Home";
		double billHome = TotalBill.getBill(type1, units);
		System.out.println("The Total Bill Amount for Home :");
		System.out.println(units + "--" + billHome);
		String type2 = "Commercial";
		double billCommercial = TotalBill.getBill(type2, units);
		System.out.println("The Total Bill Amount for Commercial:");
		System.out.println(units + "--" + billCommercial);
		String type3 = "Agriculture";
		double billAgriculture = TotalBill.getBill(type3, units);
		System.out.println("The Total Bill Amount for Agriculture:");
		System.out.println(units + "--" + billAgriculture);
		System.out.println("\n-------------------------------------");
		System.out.println("|  Calculation for 200 Units:          |");
		System.out.println("---------------------------------------\n");
		int units2 = 200;
		String type11 = "Home";
		double billHome1 = TotalBill.getBill(type11, units2);
		System.out.println("The Total Bill Amount for Home :");
		System.out.println(units2 + "--" + billHome1);
		String type22 = "Commercial";
		double billCommercial1 = TotalBill.getBill(type22, units2);
		System.out.println("The Total Bill Amount for Commercial:");
		System.out.println(units2 + "--" + billCommercial1);
		String type33 = "Agriculture";
		double billAgriculture1 = TotalBill.getBill(type33, units2);
		System.out.println("The Total Bill Amount for Agriculture:");
		System.out.println(units2 + "--" + billAgriculture1);
		System.out.println("\n-------------------------------------");
		System.out.println("|  Calculation for 300 Units:          |");
		System.out.println("---------------------------------------\n");
		int units3 = 300;
		String type12 = "Home";
		double billHome12 = TotalBill.getBill(type12, units3);
		System.out.println("The Total Bill Amount for Home :");
		System.out.println(units3 + "--" + billHome12);
		String type23 = "Commercial";
		double billCommercial12 = TotalBill.getBill(type23, units3);
		System.out.println("The Total Bill Amount for Commercial:");
		System.out.println(units3 + "--" + billCommercial12);
		String type13 = "Agriculture";
		double billAgriculture12 = TotalBill.getBill(type13, units3);
		System.out.println("The Total Bill Amount for Agriculture:");
		System.out.println(units3 + "--" + billAgriculture12);	

	}
}
