package day5;

import java.util.Scanner;

public class NumberOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] arr = new int[101];// declare an array with 101 elements with
									// default value of each one =0;
		System.out.println("Enter the integers between 1 and 100: ");
		for (int i = 0; i < arr.length; i++) {
			int data = input.nextInt();
			arr[data] = arr[data] + data;// Sum of array[i] at position i
			if (data == 0)
				break;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				if (arr[i] / i > 1)
					System.out.println(i + " occurs " + arr[i] / i + " times");
				else
					System.out.println(i + " occurs " + 1 + " time");
			}
		}
	}

}
