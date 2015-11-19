package basic;

import java.util.ArrayList;
import java.util.List;

public class SumIntegerValues {
	public static void main(String[] args) {
		String s = "";
		int integer = 123456789;
		System.out.println(sum(digits(integer), s));

	}

	public static List<Integer> digits(int i) {
		List<Integer> digits = new ArrayList<Integer>();
		while (i > 0) {
			digits.add(i % 10);
			i /= 10;
		}
		return digits;
	}

	public static String sum(List<Integer> num, String s) {
		int sum = 0;

		for (int i = num.size() - 1; i >= 0; i--) {
			sum = sum + num.get(i);
			s = s + " + " + num.get(i);
		}

		return s.replaceFirst("\\+", "") + " = " + sum;
	}
}
