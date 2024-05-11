package chapter19.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest2 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fail", "12345");
		map.put("Winter", "123456");
		
		while(true) {
			
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디 : ");
			String id = scan.nextLine();
			
			if(map.containsKey(id)) {
				System.out.print("비밀번호 : ");
				String pw = scan.nextLine();
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				}
			}else {
				System.out.println("입력하신 아이디는 존재하지 않습니다.");
			}
		}

	}

}
