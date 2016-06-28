package day5;

import java.util.Scanner;

public class SortedArrayCheck {

	// boolean method to check the array is sorted or not
	public static boolean isSorted(int[] array) {
		int size = array.length;
		boolean isSorted = true;
		for (int i = 0; i < size - 1; i++) {
			if (array[i] > array[i + 1]) {
				isSorted = false;
				break;
			}
		}
		return isSorted;

	}

	public static void main(String[] args) {
		System.out.println("Enter length of the array :");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int array[] = new int[length];
		System.out.println("Enter " + length + " elements of the array :");
		for (int i = 0; i < length; i++) {
			array[i] = input.nextInt();
		}
		boolean isSorted = isSorted(array);
		if (isSorted) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array is NOT sorted");
		}

	}

}
