package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product=new Product(1,"Laptop","HP Laptop",3000,2,"Siyah");//Parametreli Constructor
		Product product=new Product();
		product.setname("Laptop");
		product.setid(1);
		product.setdescription("HP Bilgisayar");
		product.setprice(5000);
		product.setstockAmount(3);
		System.out.println(product._name); 
	
		productManager productManager=new productManager();
		productManager.Add(product);
		productManager.Add2(1, "", "", 2, 200);
		System.out.println(product.getkod ());
	
		

	}

}
