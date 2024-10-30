package src.map;
//import java.util.Comparator;
//import java.util.Objects;

public class Product {
	private String itemName;
	private double price;
	private int stockAmount;
	//private long id;
	
	public Product(String item, double price, int amount) {
		this.itemName = item;
		this.price = price;
		this.stockAmount = amount;
		//this.id = id;
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

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int amount) {
		this.stockAmount = amount;
	}

	@Override
	public String toString() {
		return "[item=" + itemName + ", price=" + price + ", amount=" + stockAmount + "]";
	}

	/*
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return itemName.compareToIgnoreCase(o.getItemName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}
	*/
}

/*
class PriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getPrice(), o2.getPrice());
	}
	
}
*/