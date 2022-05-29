package users;

public class Student extends User{
	
	private int id;
	
	public Student(String name, String department, String email, String phoneNumber) {
		super(name,department,email,phoneNumber);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	@Override
	public void update(String message) {
		// do some stuff
	}
	
}
