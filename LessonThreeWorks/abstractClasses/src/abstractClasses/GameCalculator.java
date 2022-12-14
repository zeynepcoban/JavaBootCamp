package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	//ABSTRACT CLASS:oluşturulan methodu her class kendi şartlarına göre abstract ettirsin. Yani her class kendi şartını kendi belirlesin(Kids, woman, man) ana class(GameCalcurator) içerisine o methoda ait hiçbir şart verilmesin.
	public void gameOver() {
		System.out.println("Oyun Bitti");
	}

}
