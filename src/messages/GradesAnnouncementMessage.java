package messages;


public class GradesAnnouncementMessage implements Message{

	public String prepareMessage(String [] placeHolders,WayToSend way) {
		// code to replace place holders of this type
		
		return way.prepareMessageWay(placeHolders);
	}
	
	public boolean verifyGrades() {
		// code to verify Grades before announcement
		
		return true;
	}
}
