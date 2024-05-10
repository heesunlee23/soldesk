
package chapter19.Example;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	
	Map<Student, Integer> map;
	Student student;
	
	public TreeMapTest() {
		map = new TreeMap<Student, Integer>();
	}

	public void addStudent(Student student, int score) {
		map.put(student, score);
	}

//	public void showInfo() {
//		Set<Student> keySet = map.keySet();
//		Iterator<Student> keyIterator = keySet.iterator();
//		
//		while(keyIterator.hasNext()) {
//			Student key = keyIterator.next();
//			Integer value = map.get(key);
//			
//			System.out.println(key + "" + value); 
//		}
//		
//	}
	
	public void showInfo() {
		Set<Map.Entry<Student, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> entryIt = entrySet.iterator();
		
		while(entryIt.hasNext()) {
			// 못 받아 적었음 
		}
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
		
		System.out.println(id + "번 학생이 존재하지 않습니다.");
		return false;
	}

//	public void removeStudent(int id) {
//		Set<Student> keySet = map.keySet();
//		Iterator<Student> keyIterator = keySet.iterator();
//		Student student = null; 
//		
//		while(keyIterator.hasNext()) {
//			Student key = keyIterator.next();
//			
//			if(key.getSno() == id) {
//				student = key;
//				break;
//
//			}
//		}
//		
//		if(student == null) {
//			System.out.println(id + "번 학생이 존재하지 않습니다.");
//		} else {
//			map.remove(student);
//		}
//	}
	
	

}
