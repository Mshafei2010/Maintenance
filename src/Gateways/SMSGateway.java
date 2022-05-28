package Gateways;

import messages.DailyNewsMessage;
import messages.GradesAnnouncementMessage;
import messages.Mobile;
import messages.TaskAddedMessage;
import messages.WayToSend;

public class SMSGateway {
	
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailyNewsMessage) {
			DailyNewsMessage msg = (DailyNewsMessage) message;
			WayToSend way = new Mobile();
			msg.prepareMessage(placeHolders,way);
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementMessage) {
			GradesAnnouncementMessage msg = (GradesAnnouncementMessage) message;

			WayToSend way = new Mobile();
			msg.prepareMessage(placeHolders,way);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedMessage) {
			TaskAddedMessage msg = (TaskAddedMessage) message;

			WayToSend way = new Mobile();
			msg.prepareMessage(placeHolders,way);
			// some code to send message to user
		}
		
	}
}
