package lab1;

import java.util.*;

public class Bai9 {
	public static void main(String args[]) {
		add(1);
        add(1, 3);
        add(1, 3, 5);
        add(1, 5, 7, 9);
	}
	public static void add(int num, int... values) {
        int total = num;
        for (int i = 0; i < values.length; i++) {
            total = total + values[i];
        }
        System.out.println("Số đối số: " + (values.length + 1));
        System.out.println("Tổng = " + total);
    }
}
