package src.map;
import java.util.Map;
import java.util.HashMap;

public class StockProducts {
	
	Map<Long, Product> stock;
	public StockProducts() {
		this.stock = new HashMap<>();
	}
	
	public void addProduct(long cod, String itemName, int stockAmount, double price) {
		stock.putIfAbsent(cod, new Product(itemName, price, stockAmount));
	}
	
	//Returns the total value on stock considering each product's amount and price.
	public void calculateTotalValueOnStock() {
		
		double totalValue = 0;
		for(Product product : stock.values()) {
			totalValue += product.getPrice() * product.getStockAmount();
		}
		System.out.println("\n*** Total Value in Stock: R$" + totalValue);
	}
	
	public void getMostExpensiveProduct() {
		Product product = null;
		double higherPrice = Double.MIN_VALUE;
		for(Product item : stock.values()) {
			if(item.getPrice() > higherPrice) {
				product = item;
				higherPrice = item.getPrice();
			}
		}
		System.out.println("\n*** Most Expensive Product \n" + product);
	}
	
	public void getCheapestProduct() {
		Product product = null;
		double cheapest = Double.MAX_VALUE;
		for(Product p : stock.values()) {
			if(p.getPrice() < cheapest) {
				cheapest = p.getPrice();
				product = p;
			}
		}
		System.out.println("\n*** The Cheapest Product \n" + product);
	}
	
	
	//Returns the product which the highest stock value.
	
	
	public void displayProducts() {
		System.out.println("\n*** Displaying Contacts from Calendar");
		for(Product product : stock.values()) {
			System.out.println("[item name=" + product.getItemName() + 
					", price=" + product.getPrice() + 
					", stock amount=" + product.getStockAmount() + "]");
		}
	}
}
