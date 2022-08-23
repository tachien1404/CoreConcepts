package buoi1;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen duong a:");
		int a = sc.nextInt();
		System.out.println("Nhap so nguyen duong  b:");
		int b = sc.nextInt();
		
		System.out.println("UCLN cua " + a + " "+b + " ="  + UCLN(a, b));
		System.out.println("BCNN cua " + a + " "+b + " ="  + BSCNN(a, b));
	}
	
	
	public static int UCLN(int a,int b) {
		if(b==0) return a;
		return UCLN(b,a % b);
	}
	
	 public static int BSCNN(int a, int b) {
	        return (a * b) / UCLN(a, b);
	    }
	

}
