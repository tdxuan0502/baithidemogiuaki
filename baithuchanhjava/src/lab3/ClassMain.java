package lab3;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface obj = new TestInterface();
		obj.method1();
		obj.method2();
		obj.method3();
		System.out.println("\t"+obj.sum(4, 5));
		System.out.println("\t"+obj.tru(5, 8));
	}

}
