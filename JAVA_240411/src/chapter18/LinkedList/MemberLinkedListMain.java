package chapter18.LinkedList;

import chapter18.Member;

public class MemberLinkedListMain {
	public static void main(String[] args) {
		// 순서 O, 중복 O
		MemberLinkedList ml = new MemberLinkedList();
		
		// 팀원들의 정보 
		Member memberKim = new Member(1000, "김씨");
		Member memberLee = new Member(1001, "이씨");
		Member memberPark = new Member(1002, "박씨");
		Member memberHong = new Member(1002, "홍씨");
		Member memberHong2 = new Member(1003, "홍씨");
		
		ml.addMember(memberKim);
		ml.addMember(memberLee);
		ml.addMember(memberPark);
		ml.addMember(memberHong);
		ml.addMember(memberHong2);//List는 중복을 허용, 순서대로 저장
		
		ml.showAllMember();
		
		ml.removeMember(1001);
		System.out.println("--------------------");
		
		ml.showAllMember();
	}
}
