package src.map;
public class Main{
	
	public static void main(String[] args) {
		
		/*
		ContactCalendar contactCalendar = new ContactCalendar();
//		
		try {
			
			contactCalendar.addContact("roberto", 222);
			contactCalendar.addContact("junior", 444);
			contactCalendar.addContact("rayane", 888);
			contactCalendar.addContact("rayane", 666);
		
			contactCalendar.displayContacts();
//			contactCalendar.removeContact("caio");
			
//			contactCalendar.displayContacts();
			contactCalendar.removeContact("junior");
			contactCalendar.displayContacts();
			
			contactCalendar.searchContact("rayane");
			contactCalendar.searchContact("nascimento");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			System.exit(0);
		}
		*/
		
		StockProducts products = new StockProducts();
		products.addProduct(1L, "Laptop", 20, 3500.00);
		products.addProduct(1L, "notebook", 20, 3500.00);
		products.addProduct(2L, "SSD", 100, 1500.00);
		products.addProduct(3L, "RAM Memory", 100, 700.00);
		
		products.displayProducts();
		products.calculateTotalValueOnStock();
		products.getMostExpensiveProduct();
		products.getCheapestProduct();
	}
}
