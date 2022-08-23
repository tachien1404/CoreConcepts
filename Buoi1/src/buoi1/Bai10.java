package buoi1;

public class Bai10 {

	public static void main(String[] args) {
		for(int i = 1000000;i<10000000;i++) {
			   if(soNguyenTo(i) && chuSolaSoNT(i) && soNguyenTo(daoNguocSo(i))) {
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
	
	public static boolean chuSolaSoNT(int n) {
		int soDu;
	    while(n >0) {
	    	soDu = n%10;	
	     if(soDu==2 || soDu==3 || soDu==5 || soDu ==7) {
	    	 n =n/10; 
	     }else {
			return false;
		}
	    }
	    return true;
	}
	
	public static int daoNguocSo(int n) {
		   int reverse = 0; 
		    while (n > 0) {
		        reverse = reverse * 10 + n % 10;
		        n /= 10;
		    }
		    return reverse;
		
	}

}
