package chapter19.Example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		Message m1 = new Message("sendMail", "홍길동");
		Message m2 = new Message("sendSMS", "김유신");
		Message m3 = new Message("sendKakaotalk", "이순신");
		
		messageQueue.offer(m1);
		messageQueue.offer(m2);
		messageQueue.offer(m3);
		
//		for(Message message : messageQueue) {
//			System.out.println(message);
//		}
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch (message.getCommand()) {
			case "sendMail":
				System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.getTo() + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.getTo() + "님에게 카카오톡을 보냅니다.");
				break;
			default:
				break;
			}
		}
	}
}
