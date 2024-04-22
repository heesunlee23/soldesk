package chapter08;

public class TeamMember {
	
	// 멤버변수
	private String teamName; // private 이기 때문에 바로 접근 못하고 getter/setter으로 접근 
	private String mName;
	private String mPhone;
	private String name;
	private String gender;
	
	// 생성자(오버로딩)
	public TeamMember(String teamName, String name) {
		this.teamName = teamName;
		this.name = name;
	}
	
	public TeamMember() {
		
	}
	// 오버로딩 된 생성자 적었는데 기본 생성자 쓸려면 기본생성자를 명시적으로 작성해야 함 

	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmPhone() {
		return mPhone;
	}
	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
