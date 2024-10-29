package src.map;
import java.util.Map;
import java.util.HashMap;
public class ContactCalendar {
	
	Map<String, Integer> contactCalendar;
	public ContactCalendar() {
		contactCalendar = new HashMap<>();
	}
	
	//Verify whether the collection is empty.
	private void verifyCollection(Map<String, Integer> collection) {
		if(collection.isEmpty()) {
			throw new IllegalStateException("The Contact"
					+ " Calendar is empty!");
		}
	}
	
	//Verify whether given name corresponds with an existing contact.
	private void verifyCollection(String contactName) {
		if(!contactCalendar.containsKey(contactName)) {
			throw new IllegalStateException("The name doesn't match any contacts!");
		}
	}
	
	public void addContact(String name, Integer phoneNumber) {
		contactCalendar.putIfAbsent(name, phoneNumber);
	}
	
	//Search contact by contact name
	public void searchContact(String contactName) {
		System.out.println("\n*** Looking up " + contactName.toUpperCase() + " in Calendar...");
		verifyCollection(contactCalendar);
		verifyCollection(contactName);
		System.out.println("Phone number: " + contactCalendar.get(contactName));
	}
	
	public void removeContact(String name) {
		System.out.println("\n*** Removing contact...");
		verifyCollection(contactCalendar);
		verifyCollection(name);
		contactCalendar.remove(name);
		System.out.println("Contact " + name.toUpperCase() + " removed successfully");
	}
	
	public void displayContacts() {
		System.out.println("\n*** Displaying Contacts from Calendar");
		verifyCollection(contactCalendar);//Checks if it is empty
		for(var entry : contactCalendar.entrySet()) {
			System.out.println("[ key=" + entry.getKey() + ", value=" + entry.getValue() + "]");
		}
	}
}
