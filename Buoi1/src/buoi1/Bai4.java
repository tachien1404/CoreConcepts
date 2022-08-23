package buoi1;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap can duoi a:");
		int a = sc.nextInt();
		System.out.println("Nhap can tren b:");
		int b = sc.nextInt();
		
		if(a <b && a>0) {
		  for(int i =a; i<=b; i++) {
			  if(soNguyenTo(i)) {
				  System.out.println(i);
			  }
		  }
		} else {
			System.out.println("Nhap lai a b");
		}
	
	}
	
	
public static boolean soNguyenTo(int n) {
	if(n <2) {
		return false;
	}
	for(int i = 2;i<=Math.sqrt(n);i++) {
		if(n%i == 0) {
			return false;
		}
	}
	return true;
}
}
