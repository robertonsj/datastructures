package src.set;

import java.util.Objects;

public class Contact {
	private String name;
	private int number;
	
	public Contact(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(name, other.name);
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "[name=" + name + " | number=" + number + "]";
	}
	
	
	
}