package buoi1;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
	  for(int i = 100000;i<1000000;i++) {
		   if(soNguyenTo(i) && chuSoLe(i)) {
			   System.out.println(i);
		   }
	   }
	}

	public static boolean soNguyenTo(int n) {
		for(int i =2;i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean chuSoLe(int n) {
		int soDu =0;
	    while(n >0) {
	    	soDu = n%10;	
	     if(soDu %2 != 0) {
	    	 n =n/10; 
	     }else {
			return false;
		}
	    }
	    return true;
	}
}
