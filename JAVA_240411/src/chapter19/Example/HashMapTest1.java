// 봤음
package chapter19.Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("한치헌", 1);
		map.put("전민석", 1);
		map.put("김현중", 2);
		map.put("김하경", 2);
		map.put("임승연", 3);
		map.put("노승찬", 3);
		map.put("이주미", 4);
		map.put("지은영", 4);
		
		System.out.println("인원 수 : " + map.size());
		System.out.println("----------------------");
		
		System.out.println("이주미 학생이 속한 팀");
		System.out.println(map.get("이주미"));
		System.out.println("----------------------");
		
		System.out.println("모든 인원 출력");
		//방법1
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("----------------------------------");
		//방법2
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
