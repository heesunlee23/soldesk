package chapter18.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest2 {
	public static void main(String[] args) {
		// HashSet : 중복 방지
		HashSet<Integer> hs = new HashSet<Integer>();
		
		// ArrayList: 중복 허용 (물론 하드코딩하면 중복 안되게 할 수는 있지만 해쉬셋 놔두고 그럴 필요가 있을까?)
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(true) {
			int i = (int) (Math.random()*45 + 1);
			hs.add(i);
			al.add(i);
			
			if(hs.size() >= 6) {
				break;
			}
		}// while
		System.out.println(hs);
		System.out.println(al);
	}
}
