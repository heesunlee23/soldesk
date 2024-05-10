package chapter19.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	
	public static void main(String[] args) {
		
		Map<Member, Integer> memberTreeMap = new TreeMap<Member, Integer>();
		
		// 키 Member는 Set 으로 이룽져 있음
		// treeMap은 순서보장 함 
		// 18에서 TreeSet배웠음
		
		Member member1 = new Member(1000, "손씨");
		Member member2 = new Member(1001, "전씨");
		Member member3 = new Member(1002, "장씨");
		Member member4 = new Member(1003, "권씨");
		Member member5 = new Member(1004, "권씨");
		
		memberTreeMap.put(member1, 95);
		memberTreeMap.put(member2, 85);
		memberTreeMap.put(member3, 95);
		memberTreeMap.put(member4, 75);
		memberTreeMap.put(member4, 75);
		
		Set<Map.Entry<Member, Integer>> entrySet = memberTreeMap.entrySet();
		Iterator<Map.Entry<Member, Integer>> entryIt = entrySet.iterator();
		
		while(entryIt.hasNext() ) {
			Map.Entry<Member, Integer> entry = entryIt.next();
			Member key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " | " + value);
		}

		
	}

}
