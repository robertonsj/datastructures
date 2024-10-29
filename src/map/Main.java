package src.map;
public class Main{
	
	public static void main(String[] args) {
		
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
	}
}
