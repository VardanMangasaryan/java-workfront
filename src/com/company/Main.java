package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i < 21; i++) {
			if (i % 3 == 0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}