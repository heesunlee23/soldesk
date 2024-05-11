package chapter19.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {

		// HashMap은 순서보장 안함
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Java", 85);
		map.put("Oracle", 85);
		map.put("JSP", 90);
		map.put("Spring", 75);
		
		map.put("Java", 95);//같은 키로 저장 시 value가 교체
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("Java의 Value : " + map.get("Java"));
		
		boolean containKey = map.containsKey("Java");//해당하는 Key가 Map에 있는지 여부
		System.out.println(containKey);
		if(!containKey) {
			map.put("Java", 100);
		}
		map.putIfAbsent("CSS", 99);
		map.putIfAbsent("Java", 90);
		
		map.remove("JSP");
		
		Set<String> keySet = map.keySet();//key는 set으로 구성
		
		Collection<Integer> values = map.values();
		for(Integer v : values) {
			System.out.print(v + " ");
		}
		System.out.println();
		for(String k :keySet) {
			System.out.print(k + " ");
		}
		System.out.println("\n--------------------------------");
		// 방법 1
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + " \t " + value);
		}
		System.out.println("--------------------------------");
		// 방법 2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();//EntrySet: key와 value를 저장
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<String, Integer> entry = entryIt.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " \t " + value);
		}
		
		map.clear();//전체 삭제
		System.out.println("총 Entry 수 : " + map.size());

	}

}
