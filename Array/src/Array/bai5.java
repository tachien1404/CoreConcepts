package Array;

import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int p;
		System.out.println("nhap so luong mang thu nhat");
		int x = sc.nextInt();
		int[] arr1 = nhap(x);

		System.out.println("nhap so luong mang thu hai");
		int y = sc.nextInt();
		int[] arr2 = nhap(y);

		int[] arr3 = new int[x + y];

		System.out.println("Nhap gia tri p:");
		do {
			p = sc.nextInt();
		} while (p >= x || p < 0);
		
		// ghép mảng
		for(int i =0;i<p;i++) {
			arr3[i] = arr1[i];
		}
		
		for(int i=0;i<y;i++) {
			arr3[i+p] = arr2[i];
		}
		
		for(int i = p;i<x;i++) {
			arr3[i+y] = arr1[i];
		}
		
		System.out.println("arr[1]: "+Arrays.toString(arr1));
		System.out.println("arr[2]: "+Arrays.toString(arr2));
		System.out.println("arr[3]: "+Arrays.toString(arr3));
	}

	public static int[] nhap(int n) {
		int[] arr = new int[n];
		System.out.println("Nhap gia tri cac phan tu: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
