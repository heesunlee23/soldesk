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
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId+"가 존재하지 않습니다");
		return false;
	}
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
