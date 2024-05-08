package chapter18.Example;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	// HashSet은 중복을 허용하지 않음 
	// String이랑 Integer는 중복 처리 하는데 나머지는 다른 객체로 인식해서 중복 처리 안함
	// equals()랑 hashcode() 추가 해야 함

	// 생성자 써서 초기화 할 것 
	// private HashSet<Member> hs = new HashSet<Member>();
	
	HashSet<Member> hashSet;
	
	public HashSetTest() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
		
	}

	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member.getName() + "님의 아이디는 " + member.getId() + "입니다.");
		}
	}

	public boolean removeMember(int id) {
		Iterator<Member> it = hashSet.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getId();
			if(tempId == id) {
				it.remove(); 
				return true;
			}
		}
		System.out.println(id + "가 존재하지 않습니다.");
		return false;

	}

}
