package lab1;

import java.util.Scanner;

public class Bai8 {
	/*
	 * public static void nhapMang(int M[][],int n,int m) { for(int i=0;i) }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so hang: ");
		int m=sc.nextInt();
		System.out.print("nhap so cot: ");
		int n=sc.nextInt();
		int M[][] = new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++) {
				System.out.print("M["+i+"]["+j+"]= ");
				M[i][j]=sc.nextInt();
			}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				//System.out.println("M[" + i + "][" + j + "] = " +M[i][j]);
				System.out.print(M[i][j]+"  ");
			}
			System.out.println();
		}
		int dem=1,s;
		for(int i=0;i<m;i++) {
			s=0;
			for(int j=0;j<n;j++) {
				//System.out.println("M[" + i + "][" + j + "] = " +M[i][j]);
				s+=M[i][j];
			}
			System.out.printf("tong cua hang %d la %d\n",dem,s);
			dem++;
		}
	}

}
