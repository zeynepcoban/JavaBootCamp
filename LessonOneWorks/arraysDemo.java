package Ders1Odev2Calismalari;

public class arraysDemo {

	public static void main(String[] args) {
		String[] ogrenci=new String[3];
		ogrenci[0]="Ali";
		ogrenci[1]="Derin";
		ogrenci[2]="Selin";
		for(int i=0; i<ogrenci.length; i++) {
			System.out.println(ogrenci[i]);
		}
		for(String ogrenciler:ogrenci) {//Yaygın kullanım.
			System.out.println(ogrenci );
		}
	}

}
