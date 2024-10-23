package src.set;

import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ContactCalendar contacts = new ContactCalendar();
		
		contacts.addContact("roberto", 111);
		contacts.addContact("roberto junior", 222);
		contacts.addContact("jose", 333);
		contacts.addContact("rayane", 444);
		contacts.addContact("roberto", 222);
		
		contacts.showContact();
		
		Set<Contact> list = contacts.searchByName("roberto");
		System.out.println(list);
		
//		contacts.updatePhoneNumber("roberto nascimento", 555);
//		contacts.showContact();
	}

}
