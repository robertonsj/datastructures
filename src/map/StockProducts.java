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
	
	
	
	public void displayProducts() {
		System.out.println("\n*** Displaying Contacts from Calendar");
		for(var product : stock.entrySet()) {
			System.out.println("[item name=" + product.getValue().getItemName() + 
					", price=" + product.getValue().getPrice() + 
					", stock amount=" + product.getValue().getStockAmount() + "]");
		}
	}
}
