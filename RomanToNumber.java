package RomanToInteger;
import java.util.Scanner;

public class RomanToNumber {

	int value(char r) {
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}

	int romanToDecimal(String str) {

		int res = 0;

		for (int i = 0; i < str.length(); i++) {

			int s1 = value(str.charAt(i));

			if (i + 1 < str.length()) {
				
				int s2 = value(str.charAt(i + 1));
				if (s1 < s2) {
					res -= s1;
				} else {
					res += s1;
				}
			} else {
				res += s1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RomanToNumber romanToNumber = new RomanToNumber();
		System.out.println("Enter Roman number in capital : ");
		String inputRoman = sc.next();
		int result = romanToNumber.romanToDecimal(inputRoman);
		System.out.println("The integer value is: " + result);
	}
}