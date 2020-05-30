package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int number, number1, number2, year, radius, side1, side2, side3, dimension;
		int[] array;
		int[][] matrix;
		String someString, someSentence, password, stringForWhileLoop;
		Scanner input = new Scanner(System.in);
		Random randomNumber = new Random();


		// 5.1
		number1 = randomNumber.nextInt();
		number2 = randomNumber.nextInt();

		System.out.println("Two random numbers are: " + number1 + "and " + number2 + "Sum of two random numbers is: " + sumOfTwoNumbers(number1, number2));

		// 5.2
		System.out.println("Input two numbers to calculate product: ");

		number1 = input.nextInt();
		number2 = input.nextInt();

		System.out.println(productOfTwoNumbers(number1, number2));

		// 5.3
		System.out.println("Input two numbers to calculate cube of product: ");

		number1 = input.nextInt();
		number2 = input.nextInt();

		System.out.println(cubeCalculator(productOfTwoNumbers(number1, number2)));

		// 5.4
		System.out.println("Input three numbers to find smallest: ");

		number = input.nextInt();
		number1 = input.nextInt();
		number2 = input.nextInt();

		System.out.println(findSmallestNumber(number, number1, number2));

		// 5.5
		System.out.println("Write some text to find middle character: ");

		someString = input.nextLine();

		System.out.println(findMiddleCharacter(someString));

		//		 5.6
		System.out.println("Write sentence to find words count: ");

		someSentence = input.nextLine();

		System.out.println(numberOfWordsInSentence(someSentence));

		//		 5.7
		System.out.println("Input year to check if it's leap or not: ");
		year = input.nextInt();

		if (isYearLeap(year)) {
			System.out.println(year + " is leap");
		} else {
			System.out.println(year + " is not leap");
		}

		//		 5.8
		System.out.println("Enter password to check if it valid or not: ");
		password = input.nextLine();
		System.out.println(isPasswordValid(password));

		//		 5.9

		System.out.println("Input radius of circle to calculate area and perimeter: ");
		radius = input.nextInt();

		System.out.println("Area of circle is: " + areaOfCircle(radius));
		System.out.println("Perimeter of circle is: " + perimeterOfCircle(radius));

		//		 5.10
		System.out.println("Input sides of triangle to check if it's valid perimeter. If yes area and perimeter will displayed below: ");

		side1 = input.nextInt();
		side2 = input.nextInt();
		side3 = input.nextInt();

		if (isTriangleValid(side1, side2, side3)) {
			System.out.println("Perimeter of triangle is: " + perimeterOfTriangle(side1, side2, side3));
			System.out.println("Area of triangle is: " + areaOfTriangle(side1, side2, side3));
		} else {
			System.out.println("Triangle is not valid");
		}

		//		 5.11, 5,12, 5,13

		array = new int[10];

		initializeArray(array);
		printArray(array);

		printArray(arrayAscendingSort(initializeArray(array)));
		printArray(arrayDescendingSort(initializeArray(array)));


		//		 5.14
		printAllPrimeNumbersLessThenHundred();

		//		5.15
		array = new int[10];
		initializeArray(array);
		printArray(reversedArray(array));

		//		 5.16

		System.out.println(isPalindrome("asdsdasd"));
		System.out.println(isPalindrome("aabbaabbaa"));
		System.out.println(isPalindrome("aabba/  /abbaa"));
		System.out.println(isPalindrome("aabba  abbaA"));

		//		 5.17

		//Should be 1
		System.out.println(calculateFactorial(0));

		//Should be 120
		System.out.println(calculateFactorial(5));

		//		 5.18

		System.out.println("Input dimension of square matrix: ");
		dimension = input.nextInt();

		displaySquareMatrixWithPlusAndMinusElements(dimension);

		//		 5.19

		System.out.println("Input dimension of square matrix: ");
		dimension = input.nextInt();

		matrix = initializeSquareMatrix(dimension);

		printMatrix(matrix);
		System.out.println();

		printMatrix(matrix90DegreeRotate(matrix));
		System.out.println();

		printMatrix(matrix180DegreeRotate(matrix));
		System.out.println();

		printMatrix(matrix270DegreeRotate(matrix));

		//		 5.20
		while (true) {
			System.out.println("------MENU-------\n Press 1 -  to print “Hello Word” \n Press 2 -  to print “Hello Vorld” \n Press 3 -  to print “Hello Uorld” \n Press 4 - EXIT ");
			stringForWhileLoop = input.nextLine();

			if (stringForWhileLoop.equals("1")) {
				System.out.println("Hello Word \n");
			} else if (stringForWhileLoop.equals("2")) {
				System.out.println("Hello Vorld \n");
			} else if (stringForWhileLoop.equals("3")) {
				System.out.println("Hello Uorld \n");
			} else if (stringForWhileLoop.equals("4")) {
				break;
			}
		}

		//		 5.21

		System.out.println("Input dimension of square matrix: ");
		dimension = input.nextInt();
		input.nextLine();

		matrix = initializeSquareMatrix(dimension);

		printMatrix(matrix);
		while (true) {
			System.out.println("------MENU-------\n Press 1 for rotating 90° \n Press 2 for rotating 180° \n Press 3 for rotating 270° \n Press 4 for Exit ");
			stringForWhileLoop = input.nextLine();

			if (stringForWhileLoop.equals("1")) {
				printMatrix(matrix90DegreeRotate(matrix));
			} else if (stringForWhileLoop.equals("2")) {
				printMatrix(matrix180DegreeRotate(matrix));
			} else if (stringForWhileLoop.equals("3")) {
				printMatrix(matrix270DegreeRotate(matrix));
			} else if (stringForWhileLoop.equals("4")) {
				break;
			}
		}
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

	public static int numberOfWordsInSentence(String someSentence) {
		if (someSentence.equals("")) {
			return 0;
		}
		return someSentence.split("\\s+").length;
	}

	public static boolean isYearLeap(int year) {
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

	public static boolean isPasswordValid(String password) {
		if (password.matches("[a-zA-Z0-9]*$")) {
			return password.matches("(?=(?:.*[0-9]){2}).{10,}$");
		}
		return false;
	}

	public static double areaOfCircle(int radius) {
		return Math.pow(Math.PI, 2) * radius;

	}

	public static double perimeterOfCircle(int radius) {
		return Math.PI * 2 * radius;

	}

	public static boolean isTriangleValid(int side1, int side2, int side3) {
		return (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2);
	}

	public static int perimeterOfTriangle(int side1, int side2, int side3) {
		return side1 + side2 + side3;
	}

	public static double areaOfTriangle(int side1, int side2, int side3) {
		int halfPerimeter = (side1 + side2 + side3) / 2;
		return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
	}

	public static int[] initializeArray(int[] array) {
		Random randomNumber = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = randomNumber.nextInt();
		}
		return array;
	}

	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static int[] arrayAscendingSort(int[] array) {
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


	public static int[] arrayDescendingSort(int[] array) {
		boolean swapped = true;
		int i = 0;
		int temp;
		while (swapped) {
			swapped = false;
			i++;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}
		}
		return array;
	}

	public static void printAllPrimeNumbersLessThenHundred() {
		for (int i = 2; i <= 100; i++) {
			int prime = 1;
			for (int j = 2; j <= i / 2; j++) {
				if ((i % j) == 0) {
					prime = 0;
					break;
				}
			}
			if (prime != 0) {
				System.out.print(i + ", ");
			}
		}
	}

	public static int[] reversedArray(int[] array) {
		int arrayLength = array.length;
		int[] reversedArray = new int[arrayLength];
		for (int value : array) {
			reversedArray[arrayLength - 1] = value;
			arrayLength -= 1;
		}
		return reversedArray;
	}

	public static boolean isPalindrome(String someString) {
		int firstIndex = 0;
		int lastIndex = someString.length() - 1;
		while (firstIndex < lastIndex) {
			if (someString.charAt(firstIndex) != someString.charAt(lastIndex))
				return false;
			lastIndex--;
			firstIndex++;
		}
		return true;
	}

	public static int calculateFactorial(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void displaySquareMatrixWithPlusAndMinusElements(int dimension) {
		Random random = new Random();

		char[][] matrix = new char[dimension][dimension];
		char plusOrMinus;

		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				plusOrMinus = random.nextBoolean() ? '+' : '-';
				matrix[i][j] = plusOrMinus;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] initializeSquareMatrix(int dimension) {
		Random randomGenerator = new Random();
		int[][] matrix = new int[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				int matrixElement = randomGenerator.nextInt(51) + 27;
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

	public static int[][] matrix90DegreeRotate(int[][] matrix) {
		int matrixLength = matrix.length;
		int[][] rotatedMatrix = new int[matrixLength][matrixLength];
		for (int i = 0; i < matrixLength; i++) {
			for (int j = 0; j < matrixLength; j++) {
				rotatedMatrix[i][matrixLength - j - 1] = matrix[j][i];
			}

		}
		return rotatedMatrix;
	}

	public static int[][] matrix180DegreeRotate(int[][] matrix) {
		int matrixLength = matrix.length;
		int[][] rotatedMatrix = new int[matrixLength][matrixLength];
		for (int i = 0; i < matrixLength; i++) {
			for (int j = 0; j < matrixLength; j++) {
				rotatedMatrix[i][j] = matrix[matrixLength - 1 - i][matrixLength - 1 - j];
			}

		}
		return rotatedMatrix;
	}

	public static int[][] matrix270DegreeRotate(int[][] matrix) {
		int matrixLength = matrix.length;
		int[][] rotatedMatrix = new int[matrixLength][matrixLength];
		for (int i = 0; i < matrixLength; i++) {
			for (int j = 0; j < matrixLength; j++) {
				rotatedMatrix[i][j] = matrix[j][matrixLength - 1 - i];
			}
		}

		return rotatedMatrix;
	}

}