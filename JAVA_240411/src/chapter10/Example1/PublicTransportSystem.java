package chapter10.Example1;

import java.util.Scanner;

public class PublicTransportSystem {
	
	Scanner scan = new Scanner(System.in);
	Bus bus;
	Subway subway;
	Customer[] customer;
 	int count;
 	
 	public PublicTransportSystem() {
 		bus = new Bus();
 		subway = new Subway();
 		System.out.print("승객 수를 등록하세요 : ");
 		count = Integer.parseInt(scan.nextLine());
 		customer = new Customer[count]; // 배열에 공간 만들기
 		for(int i=0; i < customer.length; i++) {
 			customer[i] = new Customer();
 		}
 		
 	} // 다른 클래스들 + 여기까지 선생님이 해주심 

 	// 선생님 답 - 이름을 검색하는 부분은 중복되니 메서드 만든다. 
 	public void operate() {
 		while(true) {
 			System.out.print("1.승객등록 | 2.대중교통 이용 | 3.승객정보 | 4.대중교통 정보 | 5.종료 >> ");
 			int select = Integer.parseInt(scan.nextLine());
 			if(select == 1) {
 				registCustomer();
 			} 
 			else if(select == 2) {
 				takeTransport();
 			} // else if
 			else if (select == 3) {
 				Customer cs = searchCustomer();
 				if(cs != null) {
 					cs.disp();
 				}
 				else {
 					System.out.println("등록된 회원이 없습니다.");
 				}
 			} else if(select == 4) {
 				PublicTransport pt = selectTransport(); // upcasting 임
 				pt.disp();
 			} else if(select == 5) {
 				System.out.println("프로그램을 종료합니다.");
 				break;
 			} else {
 				System.out.println("잘못된 번호입니다.");
 			}
 		}
 	}
 	
 	public void registCustomer() {
		for(int i=0; i < customer.length;i++) {
				System.out.print("이름을 등록하세요 : ");
				String name = scan.nextLine();
				customer[i].name = name;
				System.out.print("소지금 등록하세요 : ");
				int money = Integer.parseInt(scan.nextLine());
				customer[i].money = money;
			} // 회원등록 메서드 
 		} // 회원등록 메서드 
 	
 	public void takeTransport() {
 		
 		Customer cs = searchCustomer(); // cs에 주소값이 반환 됨 
 		
 			if(cs != null) {
 				
 				PublicTransport pt = selectTransport();
 				cs.ride(pt);
 				
			} // if(등록된 회원이 있을 때)
			else {
				System.out.println("등록된 회원이 없습니다.");
			} // else(등록된 회원이 없을 때)
 	} 
 	
	public Customer searchCustomer() {
		while(true) {
			System.out.print("승객의 이름을 검색하세요 > ");
			String searchName = scan.nextLine();
			for(int i = 0; i < customer.length; i++) {
				if(customer[i].name.equals(searchName)) {
					return customer[i];
				}
			}
			System.out.println("회원 정보가 없습니다.");
			return null;
		}
	}
	
	public PublicTransport selectTransport() {
		System.out.println("버스는 1번, 지하철은 2번을 선택하세요 >>");
		int select = Integer.parseInt(scan.nextLine());
		if(select == 1) {
			return bus;
		} // if(버스 선택) 
		else if(select == 2) {
			return subway;
		} // else if  
		else {
			System.out.println("잘못된 번호를 선택했습니다.");
			return null;
		} // else
	}
 	

 	
 	// 내 답 
//	public void operate() {
//		boolean isRunning = true;
//		
//		while(isRunning) {
//			System.out.print("1.승객등록 | 2.대중교통 이용 | 3.승객정보 | 4.대중교통 정보 | 5.종료 >> ");
//			int choice = scan.nextInt();
//			scan.nextLine(); // 개행문자 제거 
//			
//			if (choice == 1) {
//				for(int i = 0; i < customer.length; i++) {
//					System.out.print("승객의 이름을 등록하세요 : ");
//					String name = scan.nextLine();
//					customer[i].name = name;
//					
//					System.out.print("승객의 소지금을 등록하세요 : ");
//					int money = scan.nextInt();
//					customer[i].money = money;
//					scan.nextLine();
//					// System.out.println(customer[i].name);
//					// System.out.println(customer[i].money);
//				}
//			} else if(choice == 2) {
//				boolean stop = true;
//				
//				while (stop) {
//					System.out.print("승객의 이름을 검색하시오. 메뉴를 보려면 1번을 누르세요: ");
//					String name = scan.nextLine();
//					
//					if(name.equals("1")) {
//						stop = false;
//						break;
//					}
//					
//					boolean nameExist = false;
//					
//					for(int i = 0; i < customer.length; i++) {
//						if(name.equals(customer[i].name)) {
//							nameExist = true;
//							System.out.println("버스는 1번, 지하철은 2번을 선택하세요");
//							int vehicle_choice = scan.nextInt();
//							scan.nextLine();
//							
//							if(vehicle_choice == 1) {
//								customer[i].ride(bus);
//							} else if(vehicle_choice == 2) {
//								customer[i].ride(subway);
//							}
//							break;
//						}
//					}
//				
//					if(nameExist == false) {
//						System.out.println("회원 정보가 없습니다. 다시 시도해주세요");
//					}
//				}
//					
//			} else if(choice == 3) {
//				boolean stop = true;
//				
//				while (stop) {
//					System.out.print("승객의 이름을 검색하시오. 메뉴를 보려면 1번을 누르세요: ");
//					String name = scan.nextLine();
//					
//					if(name.equals("1")) {
//						stop = false;
//						break;
//					}
//					
//					boolean nameExist = false;
//					
//					for(int i = 0; i < customer.length; i++) {
//						if(name.equals(customer[i].name)) {
//							nameExist = true;
//							customer[i].disp();
//							break;
//						}
//					}
//				
//					if(nameExist == false) {
//						System.out.println("회원 정보가 없습니다. 다시 시도해주세요");
//					}
//				}
//			} else if(choice == 4) {
//				System.out.println("버스는 1번, 지하철은 2번을 선택하세요");
//				int vehicle_choice = scan.nextInt();
//				scan.nextLine();
//				
//				if(vehicle_choice == 1) {
//					bus.disp();
//				} else if(vehicle_choice == 2) {
//					subway.disp();
//				}
//				
//			} else if (choice == 5) {
//				isRunning = false;
//				System.out.println("종료합니다");
//			}
//		}
//		
//	}
}
	
