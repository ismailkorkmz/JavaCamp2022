package oop1;

public class Main {

	public static void main(String[] args) {


		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(9);
		product2.setUnitPrice(6500);
		product2.setUnitInStock(4);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(9500);
		product3.setUnitInStock(2);
		product3.setImageUrl("image3.jpg");


		Product[] products = { product1, product2, product3 };
        
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + " " + product.getUnitPrice() + " " + product.getDiscount() + " "
					+ product.getUnitInStock() + " " + product.getImageUrl() + " </li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer =new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("052222222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("İsmail Murat");
		individualCustomer.setLastName("Korkmaz");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
		
		
	}

}
