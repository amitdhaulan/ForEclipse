package basic;

public class SumIntegerArray {
	public static void main(String[] args) {
		/*String s = "";
		int[] integer = { 1, 2, 3, 4, 5 };
		System.out.println(sum(integer, s));*/
		
		/*int a = 3348, b;
		b = (a > 1) ? 4 : 3;
		
		
		b = ((a > 1) ? (a > 2) ? (a > 3) ? (a > 4) ? (a > 5 || a < 7) ? a : 5 : 4 : 3 : 2
		: 1);
		System.out.println(b);*/
		
		
		String str = "location/property/building/floor/space";
		System.out.print(str.split("/")[str.split("/").length - 5]+"->");
		System.out.print(str.split("/")[str.split("/").length - 4]+"->");
		System.out.print(str.split("/")[str.split("/").length - 3]+"->");
		System.out.print(str.split("/")[str.split("/").length - 2]+"->");
		System.out.print(str.split("/")[str.split("/").length - 1]);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static String sum(int[] num, String s) {
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
			s = s + " + " + num[i];
		}

		return s.replaceFirst("\\+", "") + " = " + sum;
	}
}
