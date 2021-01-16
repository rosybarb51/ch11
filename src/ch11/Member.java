package ch11;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
//	실제로는 해시코드를 사용하여 비교하기 때문에 서로 다른 객체로 인식
//	현재 여기에서는 저장된 데이터만 같으면 같다라고 출력하기 위해서 오버라이딩을 진행함
	@Override
	public boolean equals(Object obj) {
//		매개변수 obj가 Member 클래스 타입인지 확인
		if (obj instanceof Member) {
//			ture 인 거 확인하고 강제 타입 변환함. Member 클래스 타입으로
			Member member = (Member)obj;

			
			if (id.equals(member.id)) {
				return true;
			}	
		}
		return false;
	}
}
