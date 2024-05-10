package chapter19.TreeMap;

// Comparable<Member> 물론 클래스를 따로 만들 수는 있다. 

public class Member implements Comparable<Member>{
	
	private int id;
	private String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Member o) { // 정렬할 때 필요 
		// id 기준 정렬 
		// return (this.id - o.id);
		
		// 이름 순으로 정렬 - String이어서 - 는 못씀 
		return (this.name.compareTo(o.name));
	}

}
