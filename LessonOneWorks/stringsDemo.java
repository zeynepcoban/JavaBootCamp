package Ders1Odev2Calismalari;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj="Bugün Hava Çok Güzel";
		System.out.println(mesaj);
		System.out.println("Elema Syısı:"+mesaj.length());
		System.out.println("5.eleman:"+mesaj.charAt(4));//Dizinin 4.indis elemanı.
		System.out.println(mesaj.concat(" Yaşasın!!!"));//birleştirme
		System.out.println(mesaj.startsWith("B"));//B ile başlıyor mu?T/F
		System.out.println(mesaj.endsWith("."));//"." ile bitiyor mu?T/F
		char[] karakterler=new char[5];
		mesaj.getChars(0, 5, karakterler, 0);//0'dan itibaren ilk 5 karakteri almak için
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));//aramaya soldan başlıyor.
		System.out.println(mesaj.lastIndexOf("e"));//aramaya sağdan başlıyor.
		System.out.println("-------------------------------");
		String yeniMesaj=mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		//Substring:Bir metin iiçerisinden parça almak için kullanılır.
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5));//2. indisten 5. indise kadar kes, 5 dahil değil.
		//Split:Belli bir karakter dizisini esas alarak parçalamaya yarar.
		for(String kelime:mesaj.split(" ")) {
		System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());//Küçük harf
		System.out.println(mesaj.toUpperCase());

	}

}
