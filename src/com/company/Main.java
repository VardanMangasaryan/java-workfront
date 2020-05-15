package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner inputNumber = new Scanner(System.in);

		System.out.println("Input the number (Table to be calculated): ");
		int num = inputNumber.nextInt();

		for (int i = 1; i < 11; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}
}