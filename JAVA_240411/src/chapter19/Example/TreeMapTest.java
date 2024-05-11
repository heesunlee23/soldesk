package chapter19.Example;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	
	Map<Student, Integer> map;
	
	public TreeMapTest() {
		map = new TreeMap<Student, Integer>();
	}
	public void addStudent(Student student, int score) {
		map.put(student, score);
	}
	public boolean removeStudent(int id) {
		
		Iterator<Student> it = map.keySet().iterator();
		while(it.hasNext()) {
			Student key = it.next();
			if(key.getSno() == id) {
				it.remove();
				return true;
			}
		}
		System.out.println(id + "가 존재하지 않습니다");
		return false;
	}
	public void showInfo() {
		Set<Map.Entry<Student, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> entryIt = entrySet.iterator();
		
		while(entryIt.hasNext()) {
			Map.Entry<Student, Integer> entry = entryIt.next();
			Student key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
			
		}
	}
	

}
