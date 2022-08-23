package Array;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index =-1,min = Integer.MAX_VALUE;
		System.out.println("Nhap so luong phan tu cua mang:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Nhap gia tri cac phan tu");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Nhap so x:");
		int x= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if (ngTo(arr[i])  && getMin(arr[i], x) <min ) {
				min = getMin(arr[i], x);
				index = i;
			}
		}

		if (index != -1) {
			System.out.println("chi so phan tu " + index + ", Gia tri = " +arr[index] );
		} else {
			System.out.println("khong ton tai gia tri thoa man");
		}
	}

	public static boolean ngTo(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}		
		return true;
	}
	
	public static int getMin(int a, int x) {
		return Math.abs(a-x);
	}
}
