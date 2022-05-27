package users;

import java.sql.Date;

public class Professor extends Users{
	private Date hirringDate;
	private String phDTopic;

	public Professor(String name, String department, String email, String phoneNumber) {
		super(name,department,email,phoneNumber);
	}
	public Date getHirringDate() {
		return hirringDate;
	}
	public void setHirringDate(Date hirringDate) {
		this.hirringDate = hirringDate;
	}
	public String getPhDTopic() {
		return phDTopic;
	}
	public void setPhDTopic(String phDTopic) {
		this.phDTopic = phDTopic;
	}
	
	
	public void notifyProfessor(String message) {
		// do some stuff
		
	}
	
	
	
}
