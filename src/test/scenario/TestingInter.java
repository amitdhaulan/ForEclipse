package test.scenario;

import testing.inter.AbstractA;
import testing.inter.InterA;
import testing.inter.InterB;

public class TestingInter extends AbstractA implements InterA, InterB{
	
	static AbstractA a;
	public static void main(String[] args) {
		a = new TestingInter();
		a.show();
		
	}

	@Override
	public void show() {
		System.out.println("Implemented Method");
	}
	
}
