package chapter18.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import chapter18.Example.Person;
import chapter18.Example.Professor;
import chapter18.Example.Student;

public class HashSetTest3 {

	HashSet<Person> pSet;

	Scanner scan = new Scanner(System.in);
	Person person;
	
	public HashSetTest3() {
		pSet = new HashSet<Person>();
	}
	public void run() {
		
		while(true) {
			System.out.println("==========");
			System.out.println("1. 회원추가");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보");
			System.out.println("4. 종료");
			System.out.println("==========");
			System.out.print("항목 선택 : ");
			
			int select = Integer.parseInt(scan.nextLine());
			
			switch (select) {
			case 1:{
				System.out.print("학생은 1번, 교수는 2번을 누르세요 : ");
				select = Integer.parseInt(scan.nextLine());
				addPerson(select);
				break;
			}
			case 2:{
				System.out.println("-----정보삭제-----");
				System.out.print("삭제할 이름 : ");
				String deleteName = scan.nextLine();
				removePerson(deleteName);
				break;
			}
			case 3:{
				System.out.println("-----정보확인-----");
				System.out.println("현재 등록인원 : " + pSet.size() + "명");
				
				for(Person p : pSet) {
					p.showInfo();
					System.out.println("=============================");
				}
				break;
			}
			case 4:{
				System.out.println("-----종료-----");
				return;
			}
			default:
				System.out.println("유효한 번호가 아닙니다.");
				break;
			}
			
		}
	}//run()
	private void addPerson(int select) {
		if(select == 1) {
			person = new Student();
			selectPerson(person, select);
			pSet.add(person);
		}else if(select == 2) {
			person = new Professor();
			selectPerson(person, select);
			pSet.add(person);
		}
	}//addPerson()
	private void selectPerson(Person person, int select) {
		System.out.println("-------정보추가------");
		System.out.print("이름 : ");
		person.setName(scan.nextLine());
		System.out.print("나이 : ");
		person.setAge(Integer.parseInt(scan.nextLine()));
		System.out.print("전화 : ");
		person.setTel(scan.nextLine());
		
		if(select == 1) {
			System.out.print("학년 : ");
			((Student)person).setGrade(scan.nextLine());
		}else if(select == 2) {
			System.out.print("담당과목 : ");
			((Professor)person).setSubject(scan.nextLine());
		}
		
	}//selectPerson()
	private void removePerson(String deleteName) {
		Iterator<Person> it = pSet.iterator();
		
		while(it.hasNext()) {
			Person person = it.next();
			if(deleteName.equals(person.getName())) {
				it.remove();
				System.out.println(deleteName + "님의 정보를 삭제했습니다.");
				return;
			}
		}
		System.out.println(deleteName + "가 존재하지 않습니다.");
		
	}//removePerson()
	
}
