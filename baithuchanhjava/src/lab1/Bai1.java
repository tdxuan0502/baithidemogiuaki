package lab1;

import java.util.Scanner;

public class Bai1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=1;
		System.out.print("nhap n: ");n=sc.nextInt();
		for(int i=1;i<=n;i++)
			s*=i;
		System.out.printf("giai thua cua %d la %d",n,s);
	}
	

}
