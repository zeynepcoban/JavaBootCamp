package Ders1Odev2Calismalari;

public class arkadasSayilar {

	public static void main(String[] args) {
		int sayi1=220, sayi2=284,toplam=0,toplam2=0;
		for(int i=1; i<sayi1;i++) {
			if(sayi1%i==0) {
				toplam=toplam+i;
			}
		}
			for(int i=1; i<sayi2;i++) {
				if(sayi1%i==0) {
					toplam2=toplam2+i;
				}
			}
			if(sayi1==toplam2 && sayi2==toplam) {
				System.out.println("Arkadaş");
			 }
			System.out.println("Arkadaş Değil");
			}
	}

