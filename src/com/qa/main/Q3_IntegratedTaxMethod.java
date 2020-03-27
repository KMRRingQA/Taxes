package com.qa.main;

public class Q3_IntegratedTaxMethod {
	double applyTaxToSalary(double salary, double taxbracket) {
		double result = taxbracket * salary / 100;
		return result;
	}

	int taxBracketClassification(double salary) {
		if (salary < 14999) {
			return 0;
		} else if (salary < 19999) {
			return 10;
		} else if (salary < 29999) {
			return 15;
		} else if (salary < 44999) {
			return 20;
		} else {
			return 25;
		}
	}
}
