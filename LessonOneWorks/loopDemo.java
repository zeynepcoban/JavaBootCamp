package Ders1Odev2Calismalari;

public class loopDemo {

	public static void main(String[] args) {
	 //For
		for(int i=1; i<10;i++)///i+=2 =1 3 5 7 9 yazdırır. 
			{
	 		System.out.println(i);
		}
		System.out.println("For Döngüsü Sona Erdi");
	 //While
		int i=1;
		while(i<10)//Sonsuz Döngü
			{
			System.out.println(i);
			i++;//i+=2;=1 3 5 7 9 yazdırır.
			}
		System.out.println("While Dngüsü Bitti");
		
		//Do-While
		int j=0;
		do {
			
			System.out.println(j);
			j++;//i+=2;=1 3 5 7 9 yazdırır.
		}
		while(j<10);
		System.out.println("Do-While Dngüsü Bitti");
	}

}
