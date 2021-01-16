package ch11;

public class Member2 implements Cloneable {
	public String id; // String : 참조 타입이지만 기본 타입처럼 사용됨, 특수한 경우
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public String[] test; // 배열 : 참조 타입.
	
	public Member2(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		
		test = new String[3];
	}
	
	public Member2 getMember() {
//		Member2 타입으로 변수 하나 선언하고, 
		Member2 cloned = null;
		
		try {
//			Member2 타입으로 clone()을 실행함. 
//			여기서 clone()은 Object 클래스의 멤버 메서드임
//			clone() 메서드는 반환타입이 원래 Object 타입이기 때문에 Member2 클래스 타입으로 강제 타입 변환함
//			그래서 위에서 선언한 변수에 넣어줌
			cloned = (Member2)clone();
		}
//		위에서 복사가 잘 안되면 아래와 같이 경고메시지 띄움
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
//		위 과정 성공하면 결과값 리턴해주기
		return cloned;
	}
}



















