package src.map;
import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

public class EventCalendar {
	private Map<LocalDate, Event> eventCalendar;
	public EventCalendar() {
		this.eventCalendar = new HashMap<>();
	}
	
	public void addEvent(LocalDate date, Event events) {
		eventCalendar.put(date, events);
	}
	
	public void displayEvents() {
		for(var event : eventCalendar.entrySet()) {
			System.out.println(event.getValue());
			System.out.println("### Date=" + event.getKey());
		}
	}
}
