package gateways;

import messages.DailyNewsMessage;

import messages.GradesAnnouncementMessage;
import messages.Message;
import messages.Mobile;
import messages.TaskAddedMessage;
import messages.WayToSend;

public class SMSGateway implements Gateways{
	
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailyNewsMessage) {
			DailyNewsMessage msg = (DailyNewsMessage) message;
			WayToSend mobile = new Mobile();
			msg.prepareMessage(placeHolders,mobile);
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementMessage) {
			GradesAnnouncementMessage msg = (GradesAnnouncementMessage) message;

			WayToSend mobile = new Mobile();
			msg.prepareMessage(placeHolders,mobile);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedMessage) {
			TaskAddedMessage msg = (TaskAddedMessage) message;

			WayToSend mobile = new Mobile();
			msg.prepareMessage(placeHolders,mobile);
			// some code to send message to user
		}
		
	}
}
