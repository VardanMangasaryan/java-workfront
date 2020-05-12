package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Radius =");
		double radius = input.nextDouble();

		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);

		System.out.println("Perimeter is - " + perimeter + "\n" + "Area is - " + area);

	}
}
