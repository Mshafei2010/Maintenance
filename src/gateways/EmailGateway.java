package gateways;


import messages.DailyNewsMessage;

import messages.Email;
import messages.GradesAnnouncementMessage;
import messages.TaskAddedMessage;
import messages.WayToSend;

public class EmailGateway implements Gateways{
	
	public void sendMessage(Object message , String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailyNewsMessage) {
			DailyNewsMessage dailyNewsEmailMessage = (DailyNewsMessage) message;
			WayToSend mail = new Email();
			dailyNewsEmailMessage.prepareMessage(placeHolders,mail);
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementMessage) {
			GradesAnnouncementMessage announcementEmailMessage = (GradesAnnouncementMessage) message;

			WayToSend mail = new Email();
			announcementEmailMessage.prepareMessage(placeHolders,mail);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedMessage) {
			TaskAddedMessage addedEmailMessage = (TaskAddedMessage) message;

			WayToSend mail = new Email();
			addedEmailMessage.prepareMessage(placeHolders,mail);
			
			// some code to send message by email to user
		}
		
	}
}
