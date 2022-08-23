package buoi1;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen duong n: ");
	    int n = sc.nextInt();
	    
	    int soDu, tong =0;
	    while(n >0) {
	    	soDu = n%10;
	    	n =n/10;
	    	tong += soDu;
	    }
		
	    System.out.println("Tong cac chu so:" +tong );
		
	}
}
