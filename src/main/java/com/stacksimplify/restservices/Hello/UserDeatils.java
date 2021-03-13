package com.stacksimplify.restservices.Hello;

public class UserDeatils {
	private String firstname;
	private String lastname;
	private String city;
	
	//fields constructor
	public UserDeatils(String firstname, String lastname, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
	}
	
	//Getter and Setter
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "UserDeatils [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + "]";
	}
	
	// to String
	

	
	
	
}
