package lab1;

import java.util.Scanner;

public class Bai7 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("nhap n: ");n=sc.nextInt();
		if(n==1 || n==2) System.out.printf("so fibonancy thu %d la 1",n);
		int a1=1,a2=1;
		int i=3,a = 0;
		while(i<=n) {
			a=a1+a2;
			a1=a2;
			a2=a;
			i++;
		}
		System.out.printf("so fibonancy thu %d la %d",n,a);
	}

}
