package inter.test;

public class MediaterClass implements testInteer {

	String string = "MediaterClass";

	@Override
	public String show(String str) {
		str = string;
		return str;
	}

}
