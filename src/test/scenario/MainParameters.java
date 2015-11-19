package test.scenario;

public class MainParameters {
	public static void main(String[] args) {
		
		for(int i = 0; i<6; i++){ System.out.print(args[i]); }

		System.out.println();
		String x = "xyz";
		String y = x.toUpperCase();
		String z = y.replace("Y", "y") + "abc";
		System.out.println(z);
	}
}
