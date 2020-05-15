package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		String myString, reversedMyString = "";

		myString = "ROBOTS_WILL_KILL_ALL_HUMANZ";

		for (int i = myString.length() - 1; i >= 0; i--) {
			reversedMyString += myString.charAt(i);
		}
		System.out.println(reversedMyString);
	}
}
