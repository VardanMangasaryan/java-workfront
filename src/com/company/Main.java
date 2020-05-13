package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int randomNumber1, randomNumber2, result = 0;
		char mathOperator;


		Scanner input = new Scanner(System.in);

		Random randomGenerator = new Random();
		randomNumber1 = randomGenerator.nextInt();
		randomNumber2 = randomGenerator.nextInt();

		System.out.println("There are two random numbers " + randomNumber1 + " and " + randomNumber2 + ":  Type '-', '+', '*', '/' for calculation");
		mathOperator = input.next().charAt(0);

		switch (mathOperator) {
			case '+':
				result = randomNumber1 + randomNumber2;
				break;
			case '-':
				result = randomNumber1 - randomNumber2;
				break;
			case '/':
				result = randomNumber1 / randomNumber2;
				break;
			case '*':
				result = randomNumber1 * randomNumber2;
				break;
			default:
				System.out.println("Invalid math operator");
		}

		System.out.println(result);
	}
}