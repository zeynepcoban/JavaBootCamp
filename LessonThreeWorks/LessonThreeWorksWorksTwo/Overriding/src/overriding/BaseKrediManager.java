package overriding;

public class BaseKrediManager {
	public /*final*/ double hesapla(double tutar) {
		return tutar*1.18;
	}
	//final:Oluşturduğumuz methodun başka bir class içerisinde kullanılmasını istemiyorsak final parametresi ile tanımlarız.
	//Örn:hesapla Methodu: BaseKrediManager ve OgrenciKrediManager

}
