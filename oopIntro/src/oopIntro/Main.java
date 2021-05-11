package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo V15", 16000, "32 Gb Ram", 10);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V14");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(13500);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		Category category2 = new Category();
		
		category1.setId(1);
		category1.setName("Computer");
		category2.setId(2);
		category2.setName("Electronics");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
	}

}
