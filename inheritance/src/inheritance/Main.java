package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer enes = new IndividualCustomer();
		enes.customerNumber = "12345";
		
		CorporateCustomer halkbank = new CorporateCustomer();
		halkbank.customerNumber = ("67890");
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		Customer[] customers = {enes, halkbank, abc};
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(halkbank);
		//customerManager.add(enes);
		//customerManager.add(abc);
		customerManager.addMultiple(customers);
		
	}

}
