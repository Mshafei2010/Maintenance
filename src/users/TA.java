package users;

public class TA extends User{

	public TA(String name, String department, String email, String phoneNumber) {
		super(name,department,email,phoneNumber);
	}

	@Override
	public void update(String message) {
		// do some stuff
	}
}
