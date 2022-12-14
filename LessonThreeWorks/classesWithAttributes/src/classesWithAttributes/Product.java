package classesWithAttributes;

public class Product {
	public Product(int id, String name, String description, double price, int stockAmound) {
		System.out.println("Yapıcı Blok Çalıştı");
		this._id = id;
		this._name = name;
		this._description = description;
		this._price = price;
		this._stockAmount = stockAmound;

	}

	public Product() {
		// Overloading(Aşırı Yüklenme):Product clasının 1 parametresiz 1 tane de 6
		// parametreli constructoru var anlamına geliyor.
	}

	// attribute and field
	int _id;
	String _name;
	String _description;
	double _price;
	int _stockAmount;
	String _kod;

	/*
	 * public void setKod(String kod) {//KODUN YAZILABİLİR OLMASINI İSTEMİYORSAK
	 * SETTER BLOĞU SİLİNİR. kod = kod; }
	 */
	public String getkod() {
		return this._name.substring(0, 1) +_id;
	}
	
	public void setkod(String kod) {
	 _kod =kod;
	}

	// getter
	public int getid() {
		return _id;
	}

	// setter
	public void setid(int id) {
		_id = id;
	}

	public String getname() {
		return _name;
	}

	public void setname(String name) {
		_name = name;
	}

	public String getdescription() {
		return _description;
	}

	public void setdescription(String description) {
		_description = description;
	}

	public double getprice() {
		return _price;
	}

	public void setprice(double price) {
		_price = price;
	}

	public int getstockAmount() {
		return _stockAmount;
	}

	public void setstockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

}
