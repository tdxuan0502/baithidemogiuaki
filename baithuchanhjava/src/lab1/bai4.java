package lab1;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++) {
			int s=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) s+=j;
			}
			if(s==i) {System.out.printf("%d la so hoan hao\n",i);}
		}
	}

}
