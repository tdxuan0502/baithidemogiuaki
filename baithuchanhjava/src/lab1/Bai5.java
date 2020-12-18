package lab1;

import java.util.Scanner;

public class Bai5 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s,t;
		System.out.print("nhap n: ");n=sc.nextInt();
		s=0;t=n;
		do {
			s=s+n%10;
			n/=10;
		}while(n>0);
		System.out.printf("tong cac chu so cua %d la %d",t,s);
	}

}
