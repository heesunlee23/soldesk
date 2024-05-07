package chapter18.List;

import java.util.ArrayList;
import java.util.List;

/*
 * Collection 안에 List있고 List안에 Array, Vector, LinkedList
 */
public class ArrayEx1 {

	public static void main(String[] args) {
		
		String[] as = new String[10]; // 배열 => 고정길이 
		as[0] = "안녕";
//		for(int i = 0; i < 11; i++) { // 에러남
//			as[i] = "안녕";
//		}
		
		List<String> ls = new ArrayList<String>(); // 배열리스트=>가변길이
		ls.add("Hi");
		System.out.println(ls.get(0)); // get 통해 값 볼 수 있다. 
		System.out.println(ls.size());
		ls.add("Happy");
		System.out.println(ls.get(1));
		System.out.println(ls.size());
		ls.add("Nice");
		System.out.println(ls.get(2));
		System.out.println(ls.size());
		
		for(int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));
		}
		
		// 데이터 삽입 밀려남 
		System.out.println("------ 데이터 추가 후 ---------");
		ls.add(2, "Good");
		System.out.println(ls.size());
		for(int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));
		}
		
		// 데이터 삭제 후 : 왼쪽으로 댕김
		System.out.println("------ 데이터 삭제 후 ---------");
		ls.remove(0);
		System.out.println(ls.size());
		for(int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));
		}

	}

}
