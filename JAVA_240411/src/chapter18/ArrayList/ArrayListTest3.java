package chapter18.ArrayList;

import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		
		Test[] testArr = new Test[3];
		testArr[0] = new Test();
		testArr[1] = new TestChild1();
		testArr[2] = new TestChild2();
		//----------------------------
		testArr[0].fatherMethod();
		testArr[1].fatherMethod();
		testArr[2].fatherMethod();
		//----------------------------
		((TestChild1)testArr[1]).child1Method();
		((TestChild2)testArr[2]).child2Method();
		System.out.println("==========================");
		
		ArrayList<Test> testList = new ArrayList<Test>();
		testList.add(new Test());
		testList.add(new TestChild1());
		testList.add(new TestChild2());
		//----------------------------
		testList.get(0).fatherMethod();
		testList.get(1).fatherMethod();
		testList.get(2).fatherMethod();
		//-----------------------------
		((TestChild1)testList.get(1)).child1Method();
		((TestChild2)testList.get(2)).child2Method();
		
	}
}
