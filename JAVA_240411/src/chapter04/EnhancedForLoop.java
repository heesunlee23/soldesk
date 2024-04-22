package chapter04;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String strArray[] = {"Java", "Oracle", "HTML/CSS/JS/JQ", "JSP", "Spring", "Python"};
		
		for(int i=0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		} // for문
		
		System.out.println("for문");
		
		for(String lang : strArray) { // ****확장된 for문 
			System.out.println(lang);
		} // strArray의 타입과 lang의 타입이 일치해야 함 

	}

}
