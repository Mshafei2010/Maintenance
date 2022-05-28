import java.util.ArrayList;
import Gateways.EmailGateway;
import Gateways.SMSGateway;
import users.User;
import messages.Email;
import messages.Message;
import messages.Mobile;
import messages.TaskAddedMessage;
import messages.WayToSend;

public class Course {
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	
	ArrayList<User> peopleForEmail;
	ArrayList<User> peopleForSMS;
	
	
	
	public Course(String name, String code) {
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<String>();
		exams = new ArrayList<>();
		grades = new ArrayList<>();
		peopleForEmail=new ArrayList<>();
		peopleForSMS=new ArrayList<>();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void attachPeopleForEmailNotification(User user) {
		peopleForEmail.add(user);
	}
	
	public void attachPeopleForPhoneNotification(User user) {
		peopleForEmail.add(user);
	}
	public void deattachFromEmailNotification(User user) {
		peopleForEmail.remove(user);
	}
	public void deattachFromPhoneNotification(User user) {
		peopleForEmail.remove(user);
	}
	
	
	
	public void aaddAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody};
		// do some logic here 
		notifyAllUsersByMail(placeholders);
		notifyAllUsersBySMS(placeholders);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllUsersByMail(String[] placeholders) {
		// notify users by email
		Message msg = new TaskAddedMessage();
		WayToSend way = new Email();
		String notification = msg.prepareMessage(placeholders,way);
		
		// open connection for Email gateway and do some configurations to the object
		
		EmailGateway emailGateway = new EmailGateway();
		
		for (User user : peopleForEmail) {
		     user.update(notification);
			emailGateway.sendMessage(notification,user.getEmail());
		}
	}
	private void notifyAllUsersBySMS(String[] placeholders) {
		// notify users by email
		Message msg = new TaskAddedMessage();
		WayToSend way = new Mobile();
		String notification = msg.prepareMessage(placeholders,way);
		
		// open connection for Email gateway and do some configurations to the object
		
		SMSGateway smsGateway = new SMSGateway();
		
		for (User user : peopleForEmail) {
		     user.update(notification);
			smsGateway.sendMessage(notification,user.getEmail());
		}
	}
}
