package day5;

import java.util.Scanner;

public class Sum3 {
	private int sum = 0;

	public int sumOfDitgits(int number) {

		if (number > 0) {
			sum = sum + number % 10;
		} else {
			return sum;
		}
		return sumOfDitgits(number / 10);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = input.nextInt();
		Sum3 test = new Sum3();
		System.out.println("Sum of digits = " + test.sumOfDitgits(number));
	}
}
