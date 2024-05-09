package chapter19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {
	
	public static void main(String[] args) {
		// Integer - 점수
		// HashMap - 중복 허용 안함 
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		Scanner scan = new Scanner(System.in);
		
		map.put(new Student(1, "김유신"), 95);
		map.put(new Student(2, "계백"), 96);
		map.put(new Student(3, "을지문덕"), 98);
		map.put(new Student(4, "강감찬"), 85);
		map.put(new Student(5, "이순신"), 98); 		// 이름과 학번이 같으면 같은 객체라고 프로그램에 알려주기. 배웠음 
		map.put(new Student(5, "이순신"), 97);		// 이름과 학번이 같으면 같은 객체라고 프로그램에 알려주기. 배웠음 
		
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<Map.Entry<Student, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<Student, Integer> entry = entryIt.next();
			Student key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		// 데이터 넣은 순서대로 안나옴 - 순서 보장 안됨 
		
		System.out.println("--------------------------");
		Student std;
		while(true) {
			System.out.print("학생 번호를 입력하세요 : ");
			int no = Integer.parseInt(scan.nextLine());
			System.out.print("학생 번호를 입력하세요 : ");
			String name = scan.nextLine();
			std = new Student(no, name);
			// hashCode와 equals로 중복 검사는 해놨음
			
			if(map.containsKey(std)) {
				System.out.println(name + " 학생의 점수는 : " + map.get(std));
				break;
			} else {
				System.out.println("해당 학생의 데이터가 존재하지 않습니다.");
			}
		}
		
		
	}

}
