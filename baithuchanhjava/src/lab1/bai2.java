package lab1;
public class bai2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=100;i++) {
			int count=0;
			for(int j=2;j<=i;j++) 
				if(i%j==0) count++;
			if(count==1) System.out.printf("%d la so nguyen to\n",i);
		}

	}

}
