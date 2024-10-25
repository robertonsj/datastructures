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
		System.out.println("\n*** Displaying all Contacts");
		for(Contact contact : contactCalendar) {
			System.out.println(contact);
		}
	}
	public void showContact(Set<Contact> list) {
		for(Contact contact : list) {
			System.out.println(contact);
		}
	}
	
	public void searchByName(String name) {
		System.out.println("\n*** Searching Contact Named " + name.toUpperCase());
		Set<Contact> list = new HashSet<>();
		for(Contact contact : contactCalendar) {
			if(contact.getName().startsWith(name)) {
				list.add(contact);
			}
		}
		showContact(list);
	}
	
	public String updatePhoneNumber(String name, int newNumber) {
		Contact contact;
		for(Contact c : contactCalendar) {
			if(c.getName().equalsIgnoreCase(name)) {
				contact = c;
				contactCalendar.remove(c);
				contact.setNumber(newNumber);
				contactCalendar.add(contact);
				return "\n*** Contact " + name.toUpperCase() + " been updated!";
			}
		}
		return "\n*** Attempt to update contact has failed!";
	}
	
}