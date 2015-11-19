package basic;

public class ReverseString {
	public static void main(String[] args) {
		String str = "amit kumar";
		String newString = "";

		for (int i = str.length()-1 ; i >= 0; i--) {
			/*System.out.print(str.charAt(i));*/
			newString = newString + str.charAt(i);
		}
		
		System.out.println(newString);
	}
}
