package chapter16.Example;

import java.util.Scanner;

public class AnonymousTest2 {

	private Scanner scan = new Scanner(System.in);
	private String[] student;
	private String[] professor;
	private int studentCount;
	private int professorCount;
	
	public void execute() {
		
		int select;
		
		while(true) {
			System.out.println("===================");
			System.out.println("1. 등록 | 2. 출력 | 3. 종료");
			System.out.println("===================");
			System.out.println("번호를 선택하세요 >> ");
			select = Integer.parseInt(scan.nextLine());
			
			switch (select) {
			case 1:
				System.out.print("학생 등록은 1번, 교수 등록은 2번을 누르세요 >>");
				select = Integer.parseInt(scan.nextLine());
				initializeManger(select);
				break;
			case 2:
				System.out.print("학생 출력은 1번, 교수 출력은 2번을 누르세요 >>");
				select = Integer.parseInt(scan.nextLine());
				show(select);
			case 3:
				System.out.println("프로그램을 종료합니다.");
			default:
				break;
			}
		} // while
	} // execute()
	
	private void show(int select) {
		// TODO Auto-generated method stub
		
	}

	private void initializeManger(int num) {
		if(num == 1) {
			new Manager() {
				
				@Override
				public void regist() {
					countPeople(num);
					for(int i=0; i < studentCount; i++) {
						System.out.print("학생 " + (i + 1) + "의 이름을 입력하세요 : ");
						student[i] = scan.nextLine();
					}
				}
			}.regist();
		}
		
		else if(num==2) {
			new Manager() {
				@Override
				public void regist() {
					countPeople(num);
					for(int i=0; i < professorCount; i++) {
						
					}
				}
			};
		}
	}
	
	private void countPeople(int num) {
		// 적다가 놓침
	}
}
// 가능하면 인터페이스 써서 
// 람다 - 다음주