package exception;

public class Exception3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		try {
		String str=null;
		System.out.println(str.length());}
		catch(NullPointerException e) {
			System.out.println("thuc hien lenh nay khong!!");
		}
		try {
		int a=20,b=0;
		float c=a/b;
		System.out.println("c = "+c);}
		catch(ArithmeticException e){
			System.out.println("thuc hien tiep!!");
		}
		try {
		int a[] = new int [5];
		a[5]=5;
		System.out.println("a[2]= "+a[2]);}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("lai thuc hien!!d");
		}
		
	    int num= Integer.parseInt("java");
		System.out.println("num= "+num);}
		catch(NumberFormatException e){
		System.out.println("tiep tuc nao!!");}
	}
}

