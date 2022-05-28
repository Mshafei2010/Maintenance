package Gateways;

import messages.DailyNewsMessage;
import messages.Email;
import messages.GradesAnnouncementMessage;
import messages.TaskAddedMessage;
import messages.WayToSend;

public class EmailGateway {
	
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailyNewsMessage) {
			DailyNewsMessage dailyNewsEmailMessage = (DailyNewsMessage) message;
			WayToSend way = new Email();
			dailyNewsEmailMessage.prepareMessage(placeHolders,way);
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementMessage) {
			GradesAnnouncementMessage announcementEmailMessage = (GradesAnnouncementMessage) message;

			WayToSend way = new Email();
			announcementEmailMessage.prepareMessage(placeHolders,way);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedMessage) {
			TaskAddedMessage addedEmailMessage = (TaskAddedMessage) message;

			WayToSend way = new Email();
			addedEmailMessage.prepareMessage(placeHolders,way);
			
			// some code to send message by email to user
		}
		
	}
}
