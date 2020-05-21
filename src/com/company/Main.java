package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int[][] matrix = initializeMatrix(new int[10][10]);
		printMatrix(matrix);
	}


	public static int[][] initializeMatrix(int[][] matrix) {
		Random randomGenerator = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int matrixElement = randomGenerator.nextInt(89) + 10;
				matrix[i][j] = matrixElement;
			}

		}
		return matrix;
	}

	public static void printMatrix(int[][] matrixToPrint) {
		for (int i = 0; i < matrixToPrint.length; i++) {
			for (int j = 0; j < matrixToPrint.length; j++) {
				System.out.print(matrixToPrint[i][j] + " ");
			}
			System.out.println();
		}
	}
}
