package com.qa.main;

public class Q3_IntegratedTaxMethod {
	int taxBracketClassification(double Salary) {
		if (Salary < 14999) {
			return 0;
		}
		else if (Salary < 19999) {
			return 10;
		}
		else if (Salary < 29999) {
			return 15;
		}
		else if (Salary < 44999) {
			return 20;
		}
		else {
			return 25;
		}
	}
	
	double applyTaxToSalary(double Salary, double Taxbracket) {
		double Result = Taxbracket * Salary / 100;
		return Result;
	}
}
