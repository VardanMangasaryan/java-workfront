package com.company;

import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {

		int[][] matrix = initializeMatrix(10, 15);
		printMatrix(matrix);

		// Finding maximum value of matrix's elements
		System.out.println("Maximum value of matrix is: " +maximumValueOfMatrix(matrix));

		// Sum of given raw of matrix
		System.out.println("Input the row of matrix:");

		// Matrix rotation
		Scanner input = new Scanner(System.in);
		int rowNumber = input.nextInt();
		System.out.println(sumOfGivenRowMatrix(matrix, rowNumber));

		while (true) {
			System.out.println("------MENU-------\n Press 1 for rotating 90° \n Press 2 for rotating 180° \n Press 3 for rotating 270° \n Press 4 for Exit ");
			int number = input.nextInt();

			if (number == 1) {
				printMatrix(matrix90DegreeRotate(matrix));
			} else if (number == 2) {
				printMatrix(matrix180DegreeRotate(matrix));
			} else if (number == 3) {
				printMatrix(matrix270DegreeRotate(matrix));
			} else if (number == 4) {
				break;
			}
		}

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

	public static int findMaximumOfArray(int[] array) {
		Arrays.sort(array);
		return array[array.length - 1];
	}

	public static int maximumValueOfMatrix(int[][] matrix) {
		int max = 0;
		for (int[] ints : matrix) {
			if (findMaximumOfArray(ints) > max) {
				max = findMaximumOfArray(ints);
			}
		}
		return max;
	}

	public static int sumOfGivenRowMatrix(int[][] matrix, int row) {
		return IntStream.of(matrix[row]).sum();
	}

	public static int[][] matrix90DegreeRotate(int[][] matrix) {
		int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < rotatedMatrix.length; i++) {
			for (int j = 0; j < rotatedMatrix[i].length; j++) {
				rotatedMatrix[i][matrix.length - j - 1] = matrix[j][i];
			}

		}
		return rotatedMatrix;
	}

	public static int[][] matrix180DegreeRotate(int[][] matrix) {
		int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < rotatedMatrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				rotatedMatrix[i][j] = matrix[matrix.length - 1 - i][matrix[matrix.length - 1 - i].length - 1 - j];
			}

		}
		return rotatedMatrix;
	}

	public static int[][] matrix270DegreeRotate(int[][] matrix) {
		int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < rotatedMatrix.length; i++) {
			for (int j = 0; j < rotatedMatrix[i].length; j++) {
				rotatedMatrix[i][j] = matrix[j][matrix[j].length - 1 - i];
			}
		}

		return rotatedMatrix;
	}

}
