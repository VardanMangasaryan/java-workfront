package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input a value for inch:");
		double inch = input.nextDouble();

		double inchToMeter = inch * 0.0254;
		System.out.println(inch + " inch is " + inchToMeter + " meters");
	}
}
