package users;

import java.sql.Date;

public abstract class User {

	private String name;
	private String department;
	private String email;
	private String phoneNumber;
	
	public User(String name, String department, String email, String phoneNumber) {
		this.name = name;
		this.department = department;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public abstract void update(String message);
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
