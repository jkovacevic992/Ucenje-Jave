package practice;

import javax.swing.JOptionPane;

public class Person {
	private String name;
	private String lastName;
	private int id;
	private String city;

	public Person(String name, String lastName, int id, String city) {
		super();
		this.setCity(city);
		this.name = name;
		this.lastName = lastName;
		this.id = id;
	}
	
	public static Person createPerson() {
		
		return new Person(JOptionPane.showInputDialog("Enter name"), JOptionPane.showInputDialog("Enter last name"), 1, JOptionPane.showInputDialog("Enter city"));
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


}
