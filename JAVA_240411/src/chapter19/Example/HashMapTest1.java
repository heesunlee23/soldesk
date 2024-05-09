package chapter19.Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		
		// HashMap은 순서 보장 안함 
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		String student;
		
		// 데이터 넣기 
		map.putIfAbsent("전민석", 1);
		map.putIfAbsent("김현중", 2);
		map.putIfAbsent("이주미", 4);
		map.putIfAbsent("노승찬", 3);
		map.putIfAbsent("한치헌", 3);
		map.putIfAbsent("김하경", 2);
		map.putIfAbsent("임승연", 3);
		map.putIfAbsent("지은영", 4);
		
		System.out.println("인원 수 :" + map.size());
		
		student = "이주미";
		System.out.println(student + " 학생이 속한 팀: " + map.get(student));
		System.out.println();
		
		System.out.println("모든 인원 출력");
		// 방법 1 - key 먼저 담기 
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		// 방법 2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> et = entrySet.iterator();
		while(et.hasNext()) {
			Map.Entry<String, Integer> entry = et.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}

}
