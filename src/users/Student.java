package users;

public class Student extends User{
	
	private int Id;
	
	public Student(String name, String department, String email, String phoneNumber) {
		super(name,department,email,phoneNumber);
	}
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	

	@Override
	public void update(String message) {
		// do some stuff
	}
	
}
