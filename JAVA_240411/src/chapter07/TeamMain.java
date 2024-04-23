package chapter07;

// 팀 멤버 관리 프로그램
// 문제점 : 객체가 많아지면 코드가 너무 길어짐 -> 해결: 배열(TeamGroup)
public class TeamMain {

	public static void main(String[] args) {
		
		TeamMember t = new TeamMember(); // 한 명의 멤버를 저장하기 위한 객체 
		t.setTeamName("1팀");
		t.setmName("구유진");
		t.setmName("010-1111-2222");
		t.setmName("오현석");
		t.setmName("남성");
		
		System.out.println("팀명 : " + t.getTeamName());
		System.out.println("팀장 : " + t.getmName());
		System.out.println("팀장 번호 : " + t.getmPhone());
		System.out.println("팀원 : " + t.getName());
		System.out.println("팀원 성별 : " + t.getGender());
		
		System.out.println("----------------------");
		
		TeamGroup team = new TeamGroup();
		team.init();
		team.disp();
	
	}

}
