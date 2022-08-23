package buoi1;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen duong n = ");
		int n = scanner.nextInt();

		int i = 2;

		System.out.print(n + " = ");
		while (n > 1) {

			if (n % i == 0) {
				System.out.print(i + " x ");
				n /= i;
			} else {
				++i;
			}
		}
	}

}
