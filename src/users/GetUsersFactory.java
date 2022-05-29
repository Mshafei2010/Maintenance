package users;

public class GetUsersFactory{
	
public User getUsers(String userType,String name, String department, String email, String phoneNumber) {
	
	if(userType==null)
	{
	return null;
    
	}
	if(userType.equalsIgnoreCase("Professor"))
	{
	return new Professor(name, department,email,phoneNumber);
    
	}
	if(userType.equalsIgnoreCase("TA"))
	{
	return new TA(name, department,email,phoneNumber);
    
	}
	if(userType.equalsIgnoreCase("Student"))
	{
	return new Student(name, department,email,phoneNumber);
    
	}
	return null;
	
}
}