// 봤음 
package chapter19.Example;

public class Student implements Comparable<Student>{
	
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ID " + sno + " 학생 " + name + " 님의 점수 : ";
	}

	@Override
	public int compareTo(Student o) {
		return (this.sno - o.sno);
		// return (this.sno - o.sno)*-1; // 내림차순
	}
}
