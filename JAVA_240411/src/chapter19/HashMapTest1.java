package chapter19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		
		// Key, Value (예: id, 이름 - 대응이 되는 것)
		// map - key 중복 허용 안함. 중복 되는 게 있으면 덮어버림 
		Map<String, Integer> map = new HashMap<String, Integer>(); 

		map.put("Java", 85); // ""Java", 85" 같은 걸 entry라고 부름 
		map.put("Oracle", 85);
		map.put("JSP", 90);
		map.put("Spring", 75);
		// key 부분은 HashSet으로 구성되어 있음. value는 dummy value 임 (testing을 위한 것) 
		
		map.put("Java", 95); // 같은 키로 저장 시 value가 교체

		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("Java의 Value : " + map.get("Java"));

		boolean containKey = map.containsKey("Java");//해당하는 Key가 Map에 있는지 여부
		System.out.println(containKey);
		boolean containKey = map.containsKey("HTML"); // 없는 키값 넣으면 false 
		System.out.println(containKey);
		if(!containKey) {
			map.put("Java", 100);
		}
		map.putIfAbsent("CSS", 99);
		map.putIfAbsent("Java", 90);
		
		map.remove("JSP");
		
		Set<String> keySet = map.keySet(); // key들을 담아두는 방법(key는 set으로 구성) 
		Collection<Integer> values = map.values(); // value들을 담아두는 방법(Collection은 List보다 상위임. 여기에 담아둘 수 있음)
		// List<Integer> values = 처럼 List 에 담을 거면 다운 캐스팅 해야 함
		
		for(Integer v : values) {
			System.out.println(v + " ");
		}
		System.out.println();
		for(String k : keySet) {
			System.out.println(k + " ");
		}	
		System.out.println("------------------------------");
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + " \t " + value);
		}
		System.out.println("------------------------------");
		
		// 복잡해도 쓰다 보면 편함 
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // EntrySet: key와 value를 저장 
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();// iterator에 map 넣기 
		while(entryIt.hasNext()) {
			Map.Entry<String, Integer> entry = entryIt.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " \t " + value);
		}
		
		map.clear(); // 전체 삭제 
		System.out.println("총 Entry 수 : " + map.size());
		
	}

}
