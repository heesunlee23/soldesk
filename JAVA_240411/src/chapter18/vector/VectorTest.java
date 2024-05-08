package chapter18.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Object obj;
		Vector<Object> vec = new Vector<Object>(1);
		
		obj = 20240508;
		vec.addElement(obj);
		System.out.println("#1 용량 : " + vec.capacity());
		System.out.println("#1 크기 : " + vec.size());
		System.out.println();
		
		obj = "자바";
		vec.addElement(obj);
		System.out.println("#2 용량 : " + vec.capacity());
		System.out.println("#2 크기 : " + vec.size());
		System.out.println();
		
		obj = "오라클";
		vec.addElement(obj);
		System.out.println("#3 용량 : " + vec.capacity());
		System.out.println("#3 크기 : " + vec.size());
		System.out.println();
		
		obj = "HTML/CSS/JS";
		vec.addElement(obj);
		System.out.println("#4 용량 : " + vec.capacity());
		System.out.println("#4 크기 : " + vec.size());
		System.out.println();
		
		obj = "JSP";
		vec.addElement(obj);
		System.out.println("#5 용량 : " + vec.capacity());
		System.out.println("#5 크기 : " + vec.size());
		System.out.println();

	}

}

// List가 상위
// 그 다음 ArrayList, Vector, LinkedinList 
// Vector 는 초반에 나온 건데 거의 안쓴다. 
// 속도 느림. 단 멀티쓰레드 환경 구현할 때 씀.