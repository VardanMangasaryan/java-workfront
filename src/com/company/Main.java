package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int number, number1, number2, year;
		String someString, someSentence;

		Scanner input = new Scanner(System.in);
		Random randomNumber = new Random();


//		// 5.1
//		number1 = randomNumber.nextInt();
//		number2 = randomNumber.nextInt();
//
//		System.out.println(sumOfTwoNumbers(number1, number2));
//
//		// 5.2
//		System.out.println("Input two numbers to calculate product: ");
//
//		number1 = input.nextInt();
//		number2 = input.nextInt();
//
//		System.out.println(productOfTwoNumbers(number1, number2));
//
//		// 5.3
//		System.out.println("Input two numbers to calculate cube of product: ");
//
//		number1 = input.nextInt();
//		number2 = input.nextInt();
//
//		System.out.println(cubeCalculator(productOfTwoNumbers(number1, number2)));
//
//		// 5.4
//		System.out.println("Input three numbers to find smallest: ");
//
//		number = input.nextInt();
//		number1 = input.nextInt();
//		number2 = input.nextInt();
//
//		System.out.println(findSmallestNumber(number, number1, number2));
//
//		// 5.5
//		System.out.println("Write some text to find middle character: ");
//
//		someString = input.nextLine();
//
//		System.out.println(findMiddleCharacter(someString));

		// 5.6
//		System.out.println("Write sentence to find words count: ");
//
//		someSentence = input.nextLine();
//
//		System.out.println(numberOfWordsInSentence(someSentence));

		// 5.7
//		System.out.println("Input year to check if it's leap or not: ");
//		year = input.nextInt();
//
//		if(isYearLeap(year)){
//			System.out.println(year + " is leap");
//		}
//		else {
//			System.out.println(year + " is not leap");
//		}

		// 5.8
		String password = "09280298eh()(i1he";
		String p = "w434312321312343";
		System.out.println(isPasswordValid(password));
		System.out.println(isPasswordValid(p));
	}


	public static int sumOfTwoNumbers(int number1, int number2) {
		return number1 + number2;
	}

	public static double productOfTwoNumbers(int number1, int number2) {
		return number1 * number2;
	}

	public static double cubeCalculator(double number) {
		return Math.pow(number, 3);
	}

	public static int findSmallestNumber(int number, int number1, int number2) {
		return Math.min(Math.min(number, number1), number2);
	}

	public static char findMiddleCharacter(String someString) {
		int indexOfMiddleChar = someString.length() / 2;
		return someString.charAt(indexOfMiddleChar);
	}

	public static int numberOfWordsInSentence(String someSentence){
		if (someSentence.equals("")){
			return 0;
		}
		return someSentence.split("\\s+").length;
	}

	public static boolean isYearLeap(int year){
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

	public static boolean isPasswordValid(String password){
		return password.matches("[a-zA-Z0-9]+$(?=.*\\d{2,}).{10,}$");
	}
}