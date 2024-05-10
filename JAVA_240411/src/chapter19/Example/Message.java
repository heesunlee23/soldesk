package chapter19.Example;

public class Message {
	
	private String command;
	private String to;
	
	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	@Override
	public String toString() {
		if(command.equals("sendMail")) {
			return to + "에게" + " 메일을 보냅니다";
		} else if(command.equals("sendSMS")) {
			return to + "에게" + " SMS를 보냅니다";
		} else if(command.equals("sendKakaotalk")) {
			return to + "에게" + " 카카오톡을 보냅니다";
		}
		return command + "" + to;
	}
}
