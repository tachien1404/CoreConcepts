package buoi1;

public class Bai9 {

	public static void main(String[] args) {
		for(int i = 1000000;i<1000000000;i++) {
			   if(soThuanNghich(i) && tongChiaHet10(i) && chuaChuSo068(i)) {
				   System.out.println(i);
			   }
		   }
	}

	
	
	public static boolean soThuanNghich(int n) {
		String numberStr = String.valueOf(n);
		int size = numberStr.length();
		for(int i = 0; i<(size/2);i++) {
			if(numberStr.charAt(i) != numberStr.charAt(size - i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean chuaChuSo068(int n) {
		int soDu;
	    while(n >0) {
	    	soDu = n%10;	
	     if(soDu==0 || soDu==6 || soDu==8) {
	    	 n =n/10; 
	     }else {
			return false;
		}
	    }
	    return true;
	}
	
	public static boolean tongChiaHet10(int n) {
		int sum = 0;
		while(n>0) {
			int soDu = n%10;
			sum = sum+soDu;
			n = n/10;
		}
		if(sum %10==0) {
			return true;
		} else {
			return false;
		}
		
	}
}
