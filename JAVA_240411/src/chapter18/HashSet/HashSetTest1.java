package chapter18.HashSet;

import java.util.HashSet;

public class HashSetTest1 {
	public static void main(String[] args) {
		/*
		 * (Hash)Set: 중복된 값을 허용 하지 않음 
		 */
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("김씨"));
		hashSet.add(new String("조씨"));
		hashSet.add(new String("정씨"));
		hashSet.add(new String("홍씨"));
		hashSet.add(new String("유씨"));
		hashSet.add(new String("유씨"));
		hashSet.add(new String("유씨"));
		hashSet.add(new String("유씨"));
		
		System.out.println(hashSet);
	}
}
