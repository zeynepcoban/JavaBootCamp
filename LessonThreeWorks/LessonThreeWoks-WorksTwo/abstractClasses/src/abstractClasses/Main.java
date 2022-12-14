package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
	/*	GameCalculator gameCalculator=new GameCalculator() {//Abstract sınıflar new'lenemez. newlwnebilmesi için override iimzasını taşıyor olması gerekmetedir.
			
			@Override
			public void hesapla() {
					}	
			};*/
		GameCalculator gameCalculator=new WomanGameCalculator();

	}

}
