package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
	public static void nhapMang(int M[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<M.length;i++) {
			System.out.print("M["+i+"]=");
			M[i]=sc.nextInt();
		}
	}
	public static void xuatMang(int M[]) {
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập số lượng phần tử của mảng: ");
		int n=sc.nextInt();
		int []M = new int[n];
		System.out.println("Nhập mảng: ");
		nhapMang(M);
		System.out.println("xuất mảng đã nhập: ");
		xuatMang(M);
		Arrays.sort(M);
		System.out.println("Mảng sau khi sắp xếp: ");
		xuatMang(M);
	}

}
