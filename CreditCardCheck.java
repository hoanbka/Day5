package day5;

import java.util.Scanner;

public class CreditCardCheck {

	// boolean method to check whether the number is Valid
	public static boolean isValid(long number) {

		int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

		if ((total % 10 == 0) && (isRightPrefix(number) == true)
				&& (getSize(number) >= 13) && (getSize(number) <= 16)) {
			return true;
		} else {
			return false;
		}
	}

	// Return number(digit) if the number < 10, else return (sum of two digits)
	public static int getDigit(int number) {

		if (number <= 9) {
			return number;
		} else {
			int firstDigit = number % 10;
			int secondDigit = (int) (number / 10);

			return firstDigit + secondDigit;
		}
	}

	// Sum of odd digits from right(startIndex = 1) to left
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		int count = 0;
		while (number > 0) {
			if (count % 2 == 0) {
				sum = sum + (int) (number % 10);
			}
			number = number / 10;
			count++;
		}

		return sum;
	}

	// Sum of even digits from right (startIndex = 1) to left
	public static int sumOfDoubleEvenPlace(long number) {

		int sum = 0;
		int count = 0;
		while (number > 0) {
			if (count % 2 != 0) {
				sum = sum + getDigit((int) (number % 10) * 2);
			}
			number = number / 10;
			count++;
		}

		return sum;
	}

	// boolean rightPrefix is true if is 4,5,6 or 37
	public static boolean isRightPrefix(long number) {
		int d = 1;

		if ((getPrefix(number, d) == 4) || (getPrefix(number, d) == 5)
				|| (getPrefix(number, d) == 3) || (getPrefix(number, d) == 6)) {

			if (getPrefix(number, d) == 4) {
				System.out.println("Visa Card ");
			} else if (getPrefix(number, d) == 5) {
				System.out.println("Master Card ");
			} else if (getPrefix(number, d) == 3) {
				if ((getPrefix(number, 2) == 37)) {
					System.out.println("American Express Card ");
				} else {
					return false;
				}
			} else {
				System.out.println("Discovery");
			}

			return true;

		} else {

			return false;

		}
	}

	// get size of the number
	public static int getSize(long number) {

		int count = 0;

		while (number > 0) {
			number = number / 10;
			count++;
		}

		return count;

	}

	// get prefix of the number
	public static long getPrefix(long number, int k) {

		if (getSize(number) < k) {
			return number;
		} else {

			int size = (int) getSize(number);

			for (int i = 0; i < (size - k); i++) {
				number = number / 10;
			}

			return number;

		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out
				.print("Enter a long integer that represents a credit card : ");

		long number = input.nextLong();

		if (isValid(number)) {
			System.out.println("\n" + number + " is Valid. ");
		} else {
			System.out.println("\n" + number + " is Invalid. ");
		}

	}
}
