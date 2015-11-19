package test.scenario;

public class SingletonClass {
	String string;
	static SingletonClass class1;
	static SingletonClass class2;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	
	private static SingletonClass getInstance() throws NullPointerException{
		if (class1 == null) {
			return new SingletonClass();
		} else {
			return class1;
		}
		
	}
	
	public static void main(String[] args) {
		class1 = SingletonClass.getInstance();
		class1.setString("singleton");
		System.out.println(class1.getString());
		class2 = SingletonClass.getInstance();
		System.out.println(class2.getString());
	}
}
