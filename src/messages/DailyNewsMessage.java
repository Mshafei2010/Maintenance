package messages;


public class DailyNewsMessage implements Message {
	
	public String prepareMessage(String [] placeHolders,WayToSend way)  {
		// code to replace place holders of this type
		return way.prepareMessageWay(placeHolders);
	}
}
