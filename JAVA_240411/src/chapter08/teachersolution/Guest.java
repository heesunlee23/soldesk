// 24-04-24

package chapter08.teachersolution;

public class Guest {
	private String name;
	private String gender;
	
	// 새로운 방법 - 이것보다 아예 point 변수를 여기다 선언하는 게 낫다. 
	public String getPoint() {
		return Guide.point;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		
	}

}
