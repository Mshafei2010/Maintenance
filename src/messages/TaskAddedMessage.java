package messages;


public class TaskAddedMessage implements Message{

	public String prepareMessage(String [] placeHolders,WayToSend way) {
		// code to replace place holders of this type
		return way.prepareMessageWay(placeHolders);
	}
	
	
	public void addTeamDescription() {
		//some logic
		
	}
}
