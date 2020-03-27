package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Q1_Taxes taxes = new Q1_Taxes();
		System.out.println("Your tax bracket is " + taxes.taxBracketClassification(20000) + "%");
		System.out.println("You pay " + taxes.taxPaidCalculator(20000) + "€ in taxes.");

		System.out.println("\n");
		// question 3 starts here:
		double salary = 20000;
		Q3_IntegratedTaxMethod taxes2 = new Q3_IntegratedTaxMethod();
		double taxbracket = taxes2.taxBracketClassification(salary);
		System.out.println("Your tax bracket is " + taxbracket + "%\nYou pay "
				+ taxes2.applyTaxToSalary(salary, taxbracket) + "€ in taxes.");

	}

}
