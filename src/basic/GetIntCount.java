package basic;

public class GetIntCount {
	public static void main(String[] args) {
		System.out.println(getCount(123456789));
	}

	public static int getCount(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}
}
