package chapter18.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {
	
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(5);
		set.add(3);
		set.add(8);
		set.add(8);
		
		for(Integer i : set) {
			System.out.println(i);
		}
	}

}
