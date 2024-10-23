package src.set;

import java.util.HashSet;
import java.util.Set;

//This class represents phone numbers kept in a phone
public class ContactCalendar {
	Set<Contact> contactCalendar;
	
	public ContactCalendar() {
		this.contactCalendar = new HashSet<>();
	}
	
	
	public void addContact(String name, int number) {
		contactCalendar.add(new Contact(name, number));
	}
	
	public void showContact() {
		System.out.println("\n\n*** Listing all Contacts");
		System.out.print(contactCalendar);
	}
	
	public Set<Contact> searchByName(String name) {
		System.out.println("\n\n*** Searching Contact Named " + name.toUpperCase());
		Set<Contact> list = new HashSet<>();
		for(Contact contact : contactCalendar) {
			if(contact.getName().startsWith(name)) {
				list.add(contact);
			}
		}
		return list;
	}
	
	public String updatePhoneNumber(String name, int newNumber) {
		System.out.println("\n\n*** Updating Phone Number ");
		Contact contact = null;
		for(Contact c : contactCalendar) {
			if(c.getName().equalsIgnoreCase(name)) {
				contact = c;
				contact.setNumber(newNumber);
				contactCalendar.remove(c);
				contactCalendar.add(contact);
				return "Calendar updated!";
			}
		}
		return "Contact not updated!\n";
	}
	
}