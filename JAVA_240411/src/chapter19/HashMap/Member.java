package chapter19.HashMap;

import java.util.Objects;

public class Member {
	
	private Integer id;
	private String name;
	
	public Member(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name + " 회원 님의 아이디는 " + id + "입니다.";
	}
	
	//HashSet 떄문에 추가 
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	//HashSet 떄문에 추가 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return id == other.id;
	}
	
	
	
}
