package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int data;
		int temp = 0;
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		do {
			System.out.println("Enter an integer from 0 to 100 :");
			data = input.nextInt();
			arraylist.add(data);
		} while (data != 0);// data=0, input process will end
		
		while (arraylist.size() > 0) {
			for (int i = 0; i < (arraylist.size() - 1); i++) {
				for (int j = 1; j < arraylist.size(); j++) {
					if (arraylist.get(i) == arraylist.get(j)) {
						arraylist.remove(i);
						arraylist.remove(j);
						temp++;
					}
				}
			}
		}
		System.out.println(temp);
	}

}
