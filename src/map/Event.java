package src.map;
import java.util.List;
import java.util.ArrayList;
public class Event {
	
	private String eventName;
	private List<String> attractions;
	
	public Event(String eventName) {
		this.eventName = eventName;
		this.attractions = new ArrayList<>();
	}
	
	//GETTERS
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getAttractions() {
		if(attractions.isEmpty()) {
			throw new IllegalStateException("\nWARNING: There is No Attractions in the event "
					+ getEventName().toUpperCase());
		} else {
			String showAttractions = "Attractions of the Event:";
			for(String att : attractions) {
				showAttractions += ("\n" + att);
			}
			return showAttractions;
		}
	}
	
	public void addAttraction(String attraction) {
		attractions.add(attraction);
	}

	@Override
	public String toString() {
		return "\n*** Event=" + eventName.toUpperCase() + "\n" + getAttractions();
	}
	
	
	
}
