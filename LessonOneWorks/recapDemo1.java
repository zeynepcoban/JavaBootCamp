package Ders1Odev2Calismalari;

public class recapDemo1 {

	public static void main(String[] args) {
	/*	int sayi1=5, sayi2=7 , sayi3=9;
		if(sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("Sayı 1 Büyüktür...");
		}
		else if(sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("Sayı 2 Büyüktür...");
		}
		else{
			System.out.println("Sayı 3 Büyüktür...");
		}*/
	int sayi1=5, sayi2=17,sayi3=8,enBuyuk=sayi1;
	if(enBuyuk<sayi2) {
		enBuyuk=sayi2;
	}
	if(enBuyuk<sayi3) {
		enBuyuk=sayi3;
	}
	System.out.println("En Büyük:"+enBuyuk);

	}

}
