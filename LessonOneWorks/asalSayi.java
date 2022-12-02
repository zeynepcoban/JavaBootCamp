package Ders1Odev2Calismalari;

public class asalSayi {

	public static void main(String[] args) {
	  int number=2 ;
	  int remainder=number%2;
	  System.out.println(remainder);
	  boolean isPrime=true;
	  if(number==1) {
		  System.out.println("Sayı Asal Değil");
	  }
	  if(number<2) {
		  System.out.println("Geçersiz Sayı Değeri");
	  }
	    for(int i=2; i<number; i++) {
	    	if(number%i==0) {
	    		isPrime=false;
	    	}
	    }
	    if(isPrime) {
	    	System.out.println("Sayı Asal");
	    }
	    else {
	    	System.out.println("Sayı Asal Değil");
	    	}
	    }
	}


