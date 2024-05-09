// 봤음
package chapter18.TreeSet;

import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		
		/* 
		 * 넣은 순서가 아니라 오름차순으로 정렬 
		 * 원리: 레드블랙트리 (원리는 몰라도 됨) - 정처기, 코테에서 본 적 없고, 7급 공무원 시험지 에서 봤음 
		 */
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}

	}

}
