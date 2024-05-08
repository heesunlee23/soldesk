package chapter18.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

import chapter18.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> list;
	
	public MemberLinkedList() {
		list = new LinkedList<Member>();
	}
	
	public void addMember(Member member) {
		list.add(member);
	}
	
	public void showAllMember() {
		for(Member member : list) {
			System.out.println(member);
		}
	}
	
	public boolean removeMember(int id) {
		Iterator<Member> it = list.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			if(id == member.getId()) {
				it.remove();
				return true;
			}
		}
		System.out.println(id+"가 존재하지 않습니다.");
		return false;
	}


}
