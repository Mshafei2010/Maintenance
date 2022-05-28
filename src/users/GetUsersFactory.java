package users;

public class GetUsersFactory{
	
public User GetUsersFactory(String UserType,String name, String department, String email, String phoneNumber) {
	
	if(UserType==null)
	{
	return null;
    
	}
	if(UserType.equalsIgnoreCase("Professor"))
	{
	return new Professor(name, department,email,phoneNumber);
    
	}
	if(UserType.equalsIgnoreCase("TA"))
	{
	return new TA(name, department,email,phoneNumber);
    
	}
	if(UserType.equalsIgnoreCase("Student"))
	{
	return new Student(name, department,email,phoneNumber);
    
	}
	return null;
	
}
}