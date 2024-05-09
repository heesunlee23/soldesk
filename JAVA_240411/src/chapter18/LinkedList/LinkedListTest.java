package chapter18.LinkedList;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		/*
		특정 인덱스에서 객체를 제거하거나 추가하면 바로 앞뒤 링크로 연결
		빈번한 객체 삽입 삭제가 일어나는 곳에서는 ArrayList보다 성능이 좋음
		*/
		
		/*
		 * ArrayList - 뭐가 삭제 되면 하나씩 당김 - 삽입/삭제가 느려짐. 대신 검색은 상대적으로 빠름 (인덱스 기반이어서)
		 * LinkedList - 인덱스 없는 대신 링크 있다. 삽입/삭제 빠름. 링크만 올려주면 됨. 검색은 상대적으로 느림 
		 * 
		 * 공통: 넣은 순서대로 저장, 중복 값 s
		 */
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		list.add(1, "D");
		System.out.println(list);
		
		list.addFirst("E");
		System.out.println(list);
		
		list.addLast("ㄱ");
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
	}
}
