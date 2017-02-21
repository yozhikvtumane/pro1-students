package cz.uhk.pro1.students.model;

public class Student {
	private String firstName;
	private String lastName;
	private int minute;
	private int hour;

//dedicnost, polimorphism

	public Student ( String firstName, String lastName, int hour, int minute) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.minute = minute;
		this.hour = hour;
	} // konstruktor

	public Student(){} //vyzov
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) { //void because nothing is returned
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getTotalMinutesAfterMidnight() {
		return hour * 60 + minute;
	}
	
	public String toString() {
		return "Student " + firstName + " " + lastName + " " + "prishel "  + hour + ":" + minute;
	}
}
