package Array;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       System.out.println("Nhap so luong phan tu cua mang:");
	       int n = sc.nextInt();
	       int[] arr = new int[n];
	       for(int i= 0;i<n;i++) {
	    	   System.out.println("Nhap gia tri phan tu thu " + (i+1));
	    	   arr[i] = sc.nextInt();
	       }
	       sapXep(arr);
	       
	       System.out.println("Mang sau sap xep la: ");
	       for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
    public static void sapXep(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
