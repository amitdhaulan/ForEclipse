package basic;

public class PhoneNumber {
	public static void main(String[] args) {
		String phNo = "9654-12(23)65";
		String newString = "";
		for (int i = 0; i < phNo.length(); i++) {
			try {
				int integer = Integer.parseInt(phNo.charAt(i) + "");
				newString = newString + integer;
			} catch (Exception exception) {

			}
		}
		
		System.out.println(newString);
	}
}
