package buoi1;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n:");
		int n = sc.nextInt();
		
		int count =0;
   for(int i=1;i<=n;i++) {
	   if(n%i == 0) {
		   System.out.println(i + " ");
		   count++;
	   }
   }
   System.out.println("so luong uoc:" + count);
	}

}
