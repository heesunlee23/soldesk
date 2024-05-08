package chapter18.Example;

import java.util.ArrayList;

public class ArrayListTest1 {

	ArrayList<Animal> aList = new ArrayList<Animal>();
	
	// 업캐스팅
	public void addAnimal() {

		aList.add(new Human());
		aList.add(new Tiger());
		aList.add(new Eagle());
		
		for(Animal ani : aList) {
			ani.move();
		}
	}// addAnimal()

	// 다운 캐스팅
	public void testCasting() { // 중요
		
		for(int i = 0; i < aList.size(); i++) {
			Animal a = aList.get(i);
			if(a instanceof Human) {
				Human human = (Human)a;
				human.readBook(); // 다운 캐스팅 하면 고유의 메서드 쓸 수 있다. 
			} else if(a instanceof Tiger) {
				Tiger tiger = (Tiger)a;
				tiger.hunting();
			} else if(a instanceof Eagle) {
				Eagle eagle = (Eagle)a;
				eagle.flying();
			}
		}
	} // testCasting()
	
}
