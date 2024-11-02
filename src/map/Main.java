package src.map;

import java.time.LocalDate;

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
		
		
		StockProducts products = new StockProducts();
		products.addProduct(1L, "Laptop", 20, 3500.00);
		products.addProduct(1L, "notebook", 20, 3500.00);
		products.addProduct(2L, "SSD", 100, 1500.00);
		products.addProduct(3L, "RAM Memory", 100, 700.00);
		products.addProduct(4L, "PS5", 100, 5000.0);
		
		products.displayProducts();
		products.calculateTotalValueOnStock();
		products.getMostExpensiveProduct();
		products.getCheapestProduct();
		products.getProductWithHighestStockValue();
		*/
		
		try {
			
			EventCalendar eventCalendar = new EventCalendar();
			
			Event event01 = new Event("Java for All");
			event01.addAttraction("1 - Data Types");
			event01.addAttraction("2 - Data Structures");
			event01.addAttraction("3 - Generics");
			eventCalendar.addEvent(LocalDate.of(2024, 11, 5), event01);
			
			Event event02 = new Event("Programming the World!");
			event02.addAttraction("1 - Programming Logic");
			event02.addAttraction("2 - Clean Code");
			event02.addAttraction("3 - Software Engineering");
			eventCalendar.addEvent(LocalDate.of(2024, 12, 5), event02);
			
			Event event04 = new Event("Artificial Inteligence Nowadays!");
			event04.addAttraction("1 - Programming Logic");
			event04.addAttraction("2 - Clean Code");
			event04.addAttraction("3 - Software Engineering");
			eventCalendar.addEvent(LocalDate.of(2023, 12, 5), event04);
			
			eventCalendar.displayCalendar();
			eventCalendar.displayUpcomingEvent();
			
			Event event03 = new Event("Backend Programming");
			eventCalendar.addEvent(LocalDate.of(2025, 1, 5), event03);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}
}
