package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		short radius = 5;
		double area, perimeter;

		perimeter = 2 * Math.PI * radius;
		area = Math.PI * Math.pow(radius, 2);

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("------MENU-------");
			System.out.println("Enter 1 for calculating area of the circle\nEnter 2 for calculating perimeter of the circle\nEnter 2 for calculating perimeter of the circle");
			int entryNumber = scanner.nextShort();
			if (entryNumber == 1) {
				System.out.println("Area of circle with radius 5 is equal: " + area);
			} else if (entryNumber == 2) {
				System.out.println("Perimeter of circle with radius 5 is equal: " + perimeter);
			} else if (entryNumber == 3)
				break;
		}
	}
}