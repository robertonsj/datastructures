package src.set;

import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* PRACTICE ONE
ContactCalendar contacts = new ContactCalendar();
		
		contacts.addContact("roberto", 111);
		contacts.addContact("roberto junior", 222);
		contacts.addContact("jose", 333);
		contacts.addContact("rayane", 444);
		contacts.addContact("roberto", 222);
		
		contacts.showContact();
		
		System.out.println(contacts.updatePhoneNumber("roberto", 888));
		contacts.showContact();
		
		contacts.searchByName("roberto");
		
		System.out.println(contacts.updatePhoneNumber("Padre Pio", 888));
		contacts.showContact();
//		*/
		
		
		//PRACTICE TWO
		PurchaseCart purchaseCart = new PurchaseCart();
		purchaseCart.registerProduct("Notebook", 3500, 1);
		purchaseCart.registerProduct("Mouse", 80.00, 2);
		purchaseCart.registerProduct("Camera", 250.50, 2);
		purchaseCart.registerProduct("SSD", 550.50, 2);
		
		purchaseCart.displayProducts();
	
		purchaseCart.orderProductsAlphabetically();
		purchaseCart.orderProductsByPrice();
		
	}

}
