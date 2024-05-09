// 봤음
package chapter18.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return (o1.compareTo(o2)) * -1; // -1: 내림차순 (역순)으로 정렬 
	}
}

public class TreeSetTest3 {

	public static void main(String[] args) {
		
		/* 
		 * 넣은 순서가 아니라 오름차순으로 정렬 
		 * 원리: 레드블랙트리 (원리는 몰라도 됨) - 정처기, 코테에서 본 적 없고, 7급 공무원 시험지 에서 봤음 
		 */
		
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare()); // 넣는 건 이렇게 
		
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}

	}

}
