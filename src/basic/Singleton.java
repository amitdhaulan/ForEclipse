package basic;

public class Singleton {

	private String message;
	static Singleton myObj;

	/**
	 * Create protected constructor
	 */
	private Singleton() {

	}

	/**
	 * Create a static method to get instance.
	 */
	public static Singleton getInstance() {
		if (myObj == null) {
			myObj = new Singleton();
			System.out.println(myObj);
		}
		System.out.println(myObj);
		return myObj;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static void main(String a[]) {
		// Singleton st = Singleton.getInstance();
		Singleton st = new Singleton();

		st.setMessage("Hello");
		// Singleton st1 = Singleton.getInstance();
		Singleton st1 = new Singleton();
		st1.setMessage("Bye");
		System.out.println(st.getMessage() + "  " + st1.getMessage());
		System.out.println(myObj);
	}
}