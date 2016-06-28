package day5;

import java.util.Scanner;

public class SumOfDigits {

	// sum of digits of the number
	public static int sumOfDigit(int number) {
		int sum = 0;
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter integer number :");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Sum of digits = " + sumOfDigit(n));

	}

}
