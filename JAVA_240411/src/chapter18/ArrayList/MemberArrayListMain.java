package chapter18.ArrayList;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		Member member1 = new Member(1000, "한치헌");
		Member member2 = new Member(1001, "전민석");
		Member member3 = new Member(1002, "임유진");
		Member member4 = new Member(1003, "이예찬");
		Member member5 = new Member(1004, "김윤석");
		
		MemberArrayList ml = new MemberArrayList();
		ml.addMember(member1);
		ml.addMember(member2);
		ml.addMember(member3);
		ml.addMember(member4);
		
		ml.showAllMember();
		ml.removeMember(member3.getId());
		
		ml.showAllMember();
	}

}
