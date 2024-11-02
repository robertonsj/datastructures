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
		Map<LocalDate, Event> events = new TreeMap<>(eventCalendar);
		for(var event : events.entrySet()) {
			System.out.println(event.getValue());
			System.out.println("### Date=" + event.getKey());
		}
	}
}
