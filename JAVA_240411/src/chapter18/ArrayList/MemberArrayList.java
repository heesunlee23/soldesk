package chapter18.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	// 저장 
	public void addMember(Member member) {
		arrayList.add(member);
	}
	// 삭제 
	public void removeMember(int id) {
		Iterator<Member> it = arrayList.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getId();
			if(tempId == id) {
				arrayList.remove(member);
				return;
				// return true;
			} // if
		}// while
		System.out.println(id + "가 존재하지 않습니다.");
		// return false;
	}
	// 정보출력 
	public void showAllMember() {
		for(Member m : arrayList) {
			System.out.println(m);
		}
		System.out.println();
	}
}
