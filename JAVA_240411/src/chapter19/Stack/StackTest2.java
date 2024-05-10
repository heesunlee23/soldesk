package chapter19.Stack;

import java.util.Stack;

public class StackTest2 {
	
	public static void main(String[] args) {
		Object obj;
		
		Stack<Object> st = new Stack<Object>();
		
		if(st.empty()) { // null 이면 true를 반환, 그렇지 않으면 false를 반환
			for(int i=1; i<=5; i++) {
				st.push(new String(i + "Hi")); // push: 스택에 데이터 저장 
				System.out.println("입력" + i + "번째 : " + st.peek()); // peek: 스택의 top 데이터 반환 
			}
		}
		System.out.println(st);
		
		System.out.println(st.pop() + " : 추출"); // pop: 스택의 top 데이터 추출 
		System.out.println("현재 Top의 위치 : " + st.peek());
		System.out.println(st.pop() + " : 추출");
		System.out.println(st.pop() + " : 추출");
		System.out.println(st.pop() + " : 추출");
		System.out.println(st.pop() + " : 추출");
	}
}
