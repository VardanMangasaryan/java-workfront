package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input a number");
		int number = input.nextInt();

		for (int i = 1; i < 11; i++) {
			System.out.println(number + " x " + i + " = " + number * i);
		}
	}
}
