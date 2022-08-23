package Array;

import java.util.Iterator;
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cua mang:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arrCount = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap gia tri phan tu thu " + (i + 1));
			arr[i] = sc.nextInt();
			arrCount[i] = -1;
		}

		// dem so lan xuat hien cua phan tu
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arrCount[j] != 0 && arr[i] == arr[j]) {
					count++;
					arrCount[j] = 0;
				}
			}

			if (arrCount[i] != 0) {
				arrCount[i] = count;
			}
		}
		// tim max
		int max = arrCount[0];
		for (int i = 0; i < n; i++) {
			if (arrCount[i] > max) {
				max = arrCount[i];
			}
		}
		System.out.println("So lan xh max: " + max + " cua cac phan tu: ");
		for (int i = 0; i < n; i++) {
			if (arrCount[i] == max) {
				System.out.print(arr[i] + ",");
			}
		}

		// liet ke cac phan tu xuat hien bao nhieu lan
		for (int i = 0; i < n; i++) {
			if (arrCount[i] != 0) {
				System.out.println("Phan tu co gia tri " + arr[i] + " xuathien " + arrCount[i] + "lan");
			}
		}
	}
}
