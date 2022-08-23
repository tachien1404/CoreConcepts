package buoi1;

import java.util.Scanner;

public class Bai1b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n:");
		int n = sc.nextInt();

		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum += (1 / i);
		}
System.out.println("tong: "+ sum);
	}
}
