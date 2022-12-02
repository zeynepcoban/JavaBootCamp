package Ders1Odev2Calismalari;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] sehirler=new String[3][3];
		sehirler[0][0]="İstanbul";
		sehirler[0][1]="İzmir";
		sehirler[0][2]="İnegöl";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Muş";
		sehirler[1][2]="Malatya";
		sehirler[2][0]="Bursa";
		sehirler[2][1]="Bolu";
		sehirler[2][2]="Nevşehir";
		for(int i=0; i<=2;i++) {
			System.out.println("-----------");
			for(int j=0; j<=2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}
}
