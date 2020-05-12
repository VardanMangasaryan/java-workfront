package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input first number");
		int numberOne = input.nextInt();

		System.out.println("Input second number");
		int numberTwo = input.nextInt();

		int product = numberOne * numberTwo;

		System.out.println(numberOne + " x " + numberTwo + " = " + product);
	}
}
