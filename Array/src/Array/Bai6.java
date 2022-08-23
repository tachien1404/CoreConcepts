package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cua mang:");
		int n = sc.nextInt();

		int[] arr = new int[n + 1];
		System.out.println("Nhap gia tri cac phan tu");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("nhap x:");
		int x = sc.nextInt();

		int index = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] > x) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			arr[n] = x;// chen vtri cuoi
		} else {
			// dich phai toan bo pha tu tu vtri idex
			for (int i = n; i > index; i--) {
				arr[i] = arr[i - 1];
			}
			arr[index] = x;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
