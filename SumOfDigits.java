package day5;

import java.util.Scanner;

public class SumOfDigits {

	public static int sumOfDigit(int n) {
		int sum = 0;
		while (n > 0) {
			sum = sum + n % 10;
			n = n / 10;
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
