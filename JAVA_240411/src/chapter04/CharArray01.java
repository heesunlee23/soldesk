// 다시 안봐도 됨
package chapter04;

public class CharArray01 {
	public static void main(String[] args) {
		
		String str[] = {"김유신", "강감찬", "을지문덕", "이순신"};
		String res = "";
		
		for(int i = 0; i < str.length; i++) {
			res += str[i] + "\n"; // 김유신\n강감찬\n
		}
		System.out.println(res);
	}
}
