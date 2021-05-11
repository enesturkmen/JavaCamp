package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.id = 1;
		product1.name = "Lenovo";
		product1.unitPrice = 15000;
		product1.detail = "16 GB Ram";
		
		Product product2 = new Product(2, "Lenovo V15", 16000, "32 Gb Ram");
		
		
		Product product3 = new Product();
		product3.id = 3;
		product3.name = "HP";
		product3.unitPrice = 10000;
		product3.detail = "16 GB Ram";
		
		Product[] products = {
				product1, product2, product3
		};
		
		for(Product product : products) {
			
			System.out.println(product.name);
		}
		
		
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Computer";
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Home, office";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		
	}

}
