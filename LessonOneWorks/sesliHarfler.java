package Ders1Odev2Calismalari;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf='A';
		  switch (harf) {
          case 'A':
          case 'I':
          case 'O':
          case 'U':
          System.out.println("Kalın Sesli Harf");
          break; 
          case 'E':
          case 'İ':
          case 'Ö':
          case 'Ü':
          System.out.println("İnce Sesli Harf");
          break;
          default:
          System.out.println("Hatalı Değer Girdiniz");
	}
   }
  }
