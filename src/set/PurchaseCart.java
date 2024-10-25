package src.set;
import java.util.Set;

import java.util.HashSet;
import java.util.TreeSet;

public class PurchaseCart {
	private Set<Product> purchase;
	
	public PurchaseCart() {
		this.purchase = new HashSet<>();
	}
	
	public void registerProduct(String item, double price, int amount) {
		purchase.add(new Product(item, price, amount));
	}
	
	public void displayProducts() {
		System.out.println("\n*** Products in Purchase Cart");
		if(purchase == null) {
			throw new IllegalStateException("\n*** Cart is Empty!");
		} else {
			for(Product product : purchase) {
				System.out.println(product);
			}
		}
	}
	
	public void displayProducts(Set<Product> products) {
		for(Product product : products) {
			System.out.println(product);
		}
	}
	
	//Organize alphabetically the purchase's products in ascending order
	public void orderProductsAlphabetically(){
		System.out.println("\n*** Ordering Products in Cart Alphabetically");
		Set<Product> orderedProducts = new TreeSet<>(purchase);
		displayProducts(orderedProducts);
	}
	
	public void orderProductsByPrice() {
		System.out.println("\n*** Ordering Products in Cart By Price");
		Set<Product> orderedProducts = new TreeSet<>(new PriceComparator());
		orderedProducts.addAll(purchase);
		displayProducts(orderedProducts);
	}
}