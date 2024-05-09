package chapter19.Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest2 {
	
	private HashMap<Integer, String> hashMap;
	
	public HashMapTest2() {
		hashMap = new HashMap<Integer, String>();
	}

	public void addMember(Member member) {
		hashMap.put(member.getId(), member.getName());
	}
	
	// 내답 
//	public void showAllMember() {
//		// iterator 활용 
//		Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet(); // EntrySet: key와 value를 저장 
//		Iterator<Map.Entry<Integer, String>> entryIt = entrySet.iterator();// iterator에 map 넣기 
//		while(entryIt.hasNext()) {
//			Map.Entry<Integer, String> entry = entryIt.next();
//			Integer key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println(key + " \t " + value);
//		}
//	}

	public boolean removeMember(int memberId) {
		// id에 맞는 값 찾아서 지워야 함 (iterator 활용)
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId+"가 존재하지 않습니다");
		return false;
	}
	
	// 이게 선생님 답
	public void showAllMember() {
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> it = keySet.iterator();
		
		while(it.hasNext()) {
			int key = it.next();
			String value = hashMap.get(key);
			System.out.println(value);
		}
	}
	
	

}
