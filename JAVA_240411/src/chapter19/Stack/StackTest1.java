// 봤음 
package chapter19.Stack;

import java.util.ArrayList;

class MyStack {
	// arrayList는 입력한 순서대로 추가됨 
	// 스택: 후입선출 
	// 스택 활용한거: 메모리 구조 
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비어있습니다");
			return null;
		}
		return (arrayStack.remove(len-1)); // 가장 최근 값이 삭제 됨 
	}
}

public class StackTest1 {
	// 스택을 실무에서 쓸 일은 많지 않음. 스택을 구현하라는 거는 거의 못봤음. 단, 개념은 알아야 함. 면접, 코딩테스트에서 단골
	// 코드 주고 스택이냐 큐냐 파악 가능하는 문제 나올 수도 있음 

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
