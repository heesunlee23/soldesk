// 봤음 
package chapter20;

public class IDFormatTest {
	
	private String id;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) throws IDFormatException {
		
		if(id == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if(id.length() < 8 || id.length() > 20) {
			throw new IDFormatException("아이디는 8글자 이상 20자 이하로 쓰세요");
		}
		this.id = id;
	}
	
	public static void main(String[] args) {
		
		IDFormatTest test = new IDFormatTest();
		
		String userId = "1234567891011121111111111111111111111111111111111111111111111111";
		
		try {
			test.setId(userId);
		} catch (IDFormatException e) {
			e.printStackTrace();
		}
		
		// System.out.println(test.getId());
		
	}
}
// throw와 throws의 차이? 
//throw와 throws의 차이
//throw와 throws는 예외 처리와 관련된 키워드로 다음과 같은 차이점이 있다.
//
//throw: 메서드 내에서 예외를 발생시키는 데 사용된다.(예: throw new FoolException())
//throws: 메서드 선언부에서 사용되며, 해당 메서드가 처리하지 않은 예외를 호출자에게 전달함을 나타낸다.(예: public void sayNick(String nick) throws FoolException)
// 출처: 점프투자바(https://wikidocs.net/229)
