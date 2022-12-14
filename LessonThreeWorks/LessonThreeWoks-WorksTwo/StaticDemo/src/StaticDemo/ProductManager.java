package StaticDemo;

public class ProductManager {
	public void add(Product product) {
		ProductValidator validator=new ProductValidator();
		if(validator.isValid(product)) {
			System.out.println("Eklendi");
		}
		else {
		System.out.println("Ürün Bilgileri Geçersizdir.");
		}
		//Statikler direkt class ismiyle çağırılır ve çağırıldığında da bellekte oluşturulur.
		//ProductValidator productValidator=new ProductValidator();
		//productValidator.deneme();
		
	}

}
