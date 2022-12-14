package StaticDemo;

public class ProductValidator {
	static {
		System.out.println("Statik Yapıcı Blok Çalıştı");
	}
	public ProductValidator() {
		System.out.println("Yapıcı Blok Çalıştı");
	}

	public boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public void deneme() {
	}
	public static class Baskaclass{
		public static void sil() {
			
		}
	}
}
