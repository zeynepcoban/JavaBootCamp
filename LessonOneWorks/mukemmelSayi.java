package Ders1Odev2Calismalari;

public class mukemmelSayi {

	public static void main(String[] args) {
		 int number=5; 
		 int total=0;
		 for(int i=0; i<number; i++) {
			 if(number%i==0) {
				 total=total+1;
			 }
			 if(total==number) {
				 System.out.println("Mükemmel Sayıdır");
			 }
			 else {
				 System.out.println("Mükemmel Sayı Değildir");
			 }
		 }

	}

}
