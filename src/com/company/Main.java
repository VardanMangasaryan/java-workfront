package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int sum = 0, number;
		double average;

		Scanner input = new Scanner(System.in);
		System.out.println("Input the 5 numbers ");
		for (int i = 0; i < 5; i++) {
			number = input.nextInt();
			sum += number;
		}
		average = sum / 5;

		System.out.println("The sum of 5 is: " + sum + "\n" + "The average is : " + average);
	}
}