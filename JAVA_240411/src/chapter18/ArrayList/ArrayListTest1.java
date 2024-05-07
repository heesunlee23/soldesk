package chapter18.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // autoboxing - Integer 클래스만 넣을 수 있지만 그냥 int 넣을 수 있다. 
		list.add(20);
		
		// 가져올 때는 보통 for 문 쓴다. 
		// 자료구조에서는 for를 주로 '읽기'를 위해 쓴다. 
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} // 일반 for문
		System.out.println("=====================");
		for(Integer i : list) {
			System.out.println(i);
		} // 향상된 for 문
		
		// 삭제 때 for 쓰면 에러날 확률 높음 
		// 처음 index = 0 일때 삭제는 가능. 단 삭제후 방이 하나로 줄어듦
		// index는 1이 되었는데 1번째 방이 없어 에러 발생 
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			list.remove(i);
//		} // 일반 for문
//		System.out.println("=====================");
//		for(Integer i : list) {
//			System.out.println(i);
//			list.remove(i);
//		} // 향상된 for 문
		
		System.out.println("====================");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer i = it.next(); // iterator 값 하나씩 뽑아옴 
			System.out.println(i);
			it.remove();
		} // 반복자
		// 리스트 자체를 가져오는 게 아니라 포인터를 활용하는 거임 
		System.out.println("=====================");
		System.out.println(list.size());
		// iterator로 읽기가 가능하나 for쓸 것 
		// 삭제하거나 수정 할 때는 iterator 쓸 것 
		
	}
}
