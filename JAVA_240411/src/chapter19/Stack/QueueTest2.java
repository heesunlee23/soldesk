package chapter19.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {
	public static void main(String[] args) {
		// Queue가 인터페이스여서 이걸 상속받고 있는 다른 자료구조(linkedlist) 를 이용해서 구현해야 함 
		Queue<String> queue = new LinkedList<String>();  
		
		queue.offer("1번");
		queue.offer("2번");
		queue.offer("3번");
		queue.offer("4번");
		queue.offer("5번");
		
		// poll : 가장 처음에 넣었던 데이터 추출
		while(!queue.isEmpty()) {
			String str = queue.poll(); 
			System.out.println(str);
		}
		
	}
}
