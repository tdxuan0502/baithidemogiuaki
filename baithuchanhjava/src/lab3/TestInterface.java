package lab3;

public class TestInterface implements Interface4,Interface2{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("đây là phương thức 1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("đây là phương thức 2");
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int tru(int c, int d) {
		// TODO Auto-generated method stub
		return c-d;
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("đây là method 3");
	}

}
