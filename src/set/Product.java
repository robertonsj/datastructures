package src.set;
import java.util.Comparator;

public class Product implements Comparable<Product>{
	private String itemName;
	private double price;
	private int amount;
	
	public Product(String item, double price, int amount) {
		this.itemName = item;
		this.price = price;
		this.amount = amount;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String item) {
		this.itemName = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "[item=" + itemName + ", price=" + price + ", amount=" + amount + "]";
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return itemName.compareToIgnoreCase(o.getItemName());
	}
	
}

class PriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getPrice(), o2.getPrice());
	}
	
}
