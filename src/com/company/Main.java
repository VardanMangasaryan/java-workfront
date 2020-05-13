package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		short daysInMonth = 31;

		System.out.println("Enter Month name ");

		//Using toUpperCase method for handling all cases;
		String monthName = input.nextLine().toUpperCase();

		switch (monthName) {
			case "APRIL":
			case "JUNE":
			case "SEPTEMBER":
			case "NOVEMBER":
				daysInMonth = 30;
				break;
			//Using 28 as default number of days for February.
			case "FEBRUARY":
				daysInMonth = 28;
				break;
		}
		//For all other months daysInMonth is 31, not writing other cases expecting that there will never be another input:D
		System.out.println(daysInMonth);
	}
}