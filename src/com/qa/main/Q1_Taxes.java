package com.qa.main;

public class Q1_Taxes {
	int taxBracketClassification(int salary) {
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

	double taxPaidCalculator(double Salary) {
		if (Salary < 14999) {
			return Salary;
		} else if (Salary < 19999) {
			return Salary * 0.10;
		} else if (Salary < 29999) {
			return Salary * 0.15;
		} else if (Salary < 44999) {
			return Salary * 0.20;
		} else {
			return Salary * 0.25;
		}
	}
}
