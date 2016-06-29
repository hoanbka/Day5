package day5;

import java.util.Scanner;

public class CalculatorWithArgStringWithSpace {

	public static int parseStringToInt(String str) {
		int number = Integer.parseInt(str);
		return number;
	}

	public static int sum(String str1, String str2) {
		int answer = 0;
		answer = parseStringToInt(str1) + parseStringToInt(str2);
		return answer;
	}

	public static int subtract(String str1, String str2) {
		int answer = 0;
		answer = parseStringToInt(str1) - parseStringToInt(str2);
		return answer;
	}

	public static int mutiply(String str1, String str2) {
		int answer = 0;
		answer = parseStringToInt(str1) * parseStringToInt(str2);
		return answer;
	}

	public static double divide(String str1, String str2) {
		double answer = 0;
		answer = (double) parseStringToInt(str1) / parseStringToInt(str2);
		return answer;
	}

	public static boolean isValidStringInput(String str) {
		boolean isValid = false;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(0) != '+') && ((str.charAt(0) != '-'))
					&& ((str.charAt(0) != '*')) && ((str.charAt(0) != '/'))
					&& (str.charAt(str.length() - 1) != '+')
					&& ((str.charAt(str.length() - 1) != '-'))
					&& ((str.charAt(str.length() - 1) != '*'))
					&& ((str.charAt(str.length() - 1) != '/'))) {
				char operator = str.charAt(i);
				if ((operator == '+') || ((operator == '-'))
						|| ((operator == '*')) || ((operator == '/'))) {
					count++;
				}
			} else {
				return isValid;
			}
		}
		if (count == 3) {
			isValid = true;
		}
		return isValid;

	}

	public static String changedString(String str) {
		String newStr = str;
		if (str.contains("+")) {
			newStr = str.replaceAll(" ", "+");
		} else if (str.contains("-")) {
			newStr = str.replaceAll(" ", "-");
		} else if (str.contains("*")) {
			newStr = str.replaceAll(" ", "*");
		} else {
			newStr = str.replaceAll(" ", "/");
		}
		return newStr;
	}

	public static void main(String[] args) {
		System.out.println("Input your string as format (345 + 4567):");
		Scanner input = new Scanner(System.in);
		String test = input.nextLine();
		// System.out.println("Original String = " + test);
		String str = changedString(test);
		// System.out.println("ChangedString = " + str);

		// System.out.println(isValidStringInput(str));
		if (isValidStringInput(str)) {
			if (str.contains("+")) {
				int index = str.indexOf('+');
				String subStr1 = str.substring(0, index);
				String subStr2 = str.substring(index + 3);
				int answer = sum(subStr1, subStr2);
				System.out.println("Answer = " + answer);

			} else if (str.contains("-")) {
				int index = str.indexOf('-');
				String subStr1 = str.substring(0, index);
				System.out.println(subStr1);
				String subStr2 = str.substring(index + 3);
				System.out.println(subStr2);
				int answer = subtract(subStr1, subStr2);
				System.out.println("Answer = " + answer);

			} else if (str.contains("*")) {
				int index = str.indexOf('*');
				String subStr1 = str.substring(0, index);
				String subStr2 = str.substring(index + 3);
				int answer = mutiply(subStr1, subStr2);
				System.out.println("Answer = " + answer);

			} else {
				int index = str.indexOf('/');
				String subStr1 = str.substring(0, index);
				String subStr2 = str.substring(index + 3);
				double answer = divide(subStr1, subStr2);
				System.out.println("Answer = " + answer);
			}

		} else {
			System.out.println("You entered wrong string, sorry :D");
		}

	}
}
