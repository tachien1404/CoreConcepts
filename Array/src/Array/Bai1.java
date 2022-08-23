package Array;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap so luong phan tu cua mang:");
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i= 0;i<n;i++) {
    	   System.out.println("Nhap gia tri phan tu thu " + (i+1));
    	   arr[i] = sc.nextInt();
       }
       
       boolean check = true;
       
       for(int i = 0;i<(n/2); i++) {
    	   int x = n -i-1;
    	   if(arr[i] != arr[x]) {
    		check = false;   
    	   }
       }
       
       if(check == true) {
    	   System.out.println("Mang doi xung");
       } else {
		System.out.println("Mang k doi xung");
	}
	}

}
