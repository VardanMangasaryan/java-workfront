package com.company;

import java.sql.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int num, sumOfNumbers = 0, averageOfNumbers;

		Scanner inputNumber = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			num = inputNumber.nextInt();
			sumOfNumbers += num;
		}

		averageOfNumbers = sumOfNumbers / 10;

		System.out.println("Sum of numbers " + sumOfNumbers);
		System.out.println("Average of numbers " + averageOfNumbers);
	}
}