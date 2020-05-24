package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int[][] matrix = initializeMatrix(10, 15);
		printMatrix(matrix);
		System.out.println(maximumValueOfMatrix(matrix));

	}


	public static int[][] initializeMatrix(int rows, int columns) {
		Random randomGenerator = new Random();
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				int matrixElement = randomGenerator.nextInt(89) + 10;
				matrix[i][j] = matrixElement;
			}

		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] ints : matrix) {
			for (int anInt : ints) {
				System.out.print(anInt + " ");
			}
			System.out.println();
		}
	}

	public static int[] ascendingSort(int[] array){
		boolean swapped = true;
		int i = 0;
		int temp;
		while (swapped) {
			swapped = false;
			i++;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}
		}
		return array;
	}

	public static int findMaximumOfArray(int[] array){
		ascendingSort(array);
		return array[array.length - 1];
	}

	public static int maximumValueOfMatrix(int[][] matrix){
		int max = 0;
		for (int[] ints : matrix) {
			if (findMaximumOfArray(ints) > max) {
				max = findMaximumOfArray(ints);
			}
		}
		return max;
	}


}
