package chapter15.Example;

/*
 * 문제5

파일 이름 : soldesk
도메인 이름 : studesk.com

 */
public class StringTest5 {

	public static void main(String[] args) {
		
		//문자열을 @를 기준으로 나누시오
		String str = "soldesk@studesk.com";
		
		String[] split = str.split("@");
		String fileName = split[0];
		String domainName = split[1];
		System.out.println("파일 이름 : " + fileName);
		System.out.println("도메인 이름 : " + domainName);

	}

}
