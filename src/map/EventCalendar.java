package src.map;
import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class EventCalendar {
	private Map<LocalDate, Event> eventCalendar;
	public EventCalendar() {
		this.eventCalendar = new HashMap<>();
	}
	
	public void addEvent(LocalDate date, Event events) {
		eventCalendar.put(date, events);
	}
	
	//Displays Calendar's Events in Ascending Order
	public void displayCalendar() {
		System.out.println("\n*** All Events from Calendar");
		Map<LocalDate, Event> events = new TreeMap<>(eventCalendar);
		for(var event : events.entrySet()) {
			System.out.println(event.getValue());
			System.out.println("## Date=" + event.getKey());
		}
	}
	
	public void displayUpcomingEvent() {
		System.out.println("\n\n*** Upcoming Event");
		LocalDate todaysDate = LocalDate.now();
		Map<LocalDate, Event> events = new TreeMap<>(eventCalendar);
		
		for(var event : events.entrySet()) {
			if(event.getKey().equals(todaysDate) || event.getKey().isAfter(todaysDate)) {
				System.out.println(event.getValue());
				System.out.println("## Date=" + event.getKey());
				break;
			}
		}
	}
}
