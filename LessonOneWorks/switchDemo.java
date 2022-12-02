package Ders1Odev2Calismalari;

public class switchDemo {

	public static void main(String[] args) {
		char grade='C';
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel:Geçtiniz...");
			break;
		case 'B':
			System.out.println("İyi:Geçtiniz...");
			break;
		
	    case 'C':
		System.out.println("Güzel:Geçtiniz...");
		break;
	    case 'D':
			System.out.println("Fena Değil:Geçtiniz...");
			break;
	    case 'F':
			System.out.println("Kötü:Maalesef Kaldınız...");
			break;
			default:
				System.out.println("Geçersiz Not Değeri Girdiniz!!!");
			}
		
		}
	
	}
	


