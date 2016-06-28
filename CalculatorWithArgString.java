package day5;

import java.util.Scanner;

public class CalculatorWithArgString {

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
		if (count == 1) {
			isValid = true;
		}
		return isValid;

	}

	public static void main(String[] args) {
		System.out.println("Input your string :");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(isValidStringInput(str));
		if (isValidStringInput(str)) {
			if (str.contains("+")) {
				int index = str.indexOf('+');
				String subStr1 = str.substring(0, index);
				String subStr2 = str.substring(index + 1);
				int answer = sum(subStr1, subStr2);
				System.out.println("Answer = " + answer);

			} else if (str.contains("-")) {
				int index = str.indexOf('-');
				String subStr1 = str.substring(0, index);
				String subStr2 = str.substring(index + 1);
				int answer = subtract(subStr1, subStr2);
				System.out.println("Answer = " + answer);

			} else if (str.contains("*")) {
				int index = str.indexOf('*');
				String subStr1 = str.substring(0, index);
				String subStr2 = str.substring(index + 1);
				int answer = mutiply(subStr1, subStr2);
				System.out.println("Answer = " + answer);

			} else {
				int index = str.indexOf('/');
				String subStr1 = str.substring(0, index);
				String subStr2 = str.substring(index + 1);
				double answer = divide(subStr1, subStr2);
				System.out.println("Answer = " + answer);
			}
			// } else {
			// System.out.println("You entered wrong string, sorry :D");
			// }
		} else {
			System.out.println("You entered wrong string, sorry :D");
		}

	}
}
