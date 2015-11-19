package basic;

public class FinalClass {
	String name;
	static FinalClass finalClass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FinalClass() {

	}

	private FinalClass getInstFinalClass() {
		if (finalClass == null) {
			finalClass = new FinalClass();
		}
		return finalClass;
	}

	public static void main(String[] args) {
		finalClass = new FinalClass();
		finalClass.getInstFinalClass();
		finalClass.setName("name");
		System.out.println(finalClass.getName());

		finalClass.getInstFinalClass();
		System.out.println(finalClass.getName());
	}

}
