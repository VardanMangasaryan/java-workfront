package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String weekDay = "";

		System.out.println("Enter number of weekday 1 - 7");
		short numberOfWeekDay = input.nextShort();


		switch (numberOfWeekDay) {
			case 1:
				weekDay = "Monday";
				break;
			case 2:
				weekDay = "Tuesday";
				break;
			case 3:
				weekDay = "Wednesday";
				break;
			case 4:
				weekDay = "Thursday";
				break;
			case 5:
				weekDay = "Friday";
				break;
			case 6:
				weekDay = "Saturday";
				break;
			case 7:
				weekDay = "Sunday";
				break;
			default:
				System.out.println("Invalid number of weekday");
		}

		System.out.println(weekDay);
	}
}