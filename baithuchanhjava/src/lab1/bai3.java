package lab1;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0,d=0;
		for(int i=1;i<=100;i++) {
			if(i%5==0) a++;
			if(i%5==1) b++;
			if(i%5==2) c++;
			if(i%5==3) d++;
		}
		System.out.printf("co %d so chia het cho 5 \nco %d so chia 5 du 1 \nco %d so chia 5 du 2 \nco %d so chia 5 du 3\n",a,b,c,d);

	}

}
