package ch11;

import java.util.regex.Pattern;

// 정규표현식은 자바, 자바스크립트 아니면 다른 언어에서도 다 비슷함, 그래서 익혀두면 좋다. 보통은 익히기 힘드니까 인터넷 검색해서 사용한다. 전화번호나 주소가 맞는지 확인, 아니면 비밀번호에 특수문자나 뭐 그런거 확인할 때.. 직접 만들어서 쓰는 경우는 많이 못 봤다..
public class PatternMain {

	public static void main(String[] args) {
//		정규식 패턴
//		051 또는 010을 넣으면 맞다, \\는 이스케이프 문자때문에 들어감(문자열 내에서 특수한 기능을 하는 문자를 이스케이프 문자라고 함) - 주로 쓰는 것이 \n 한줄 내리기 \t 한 번 tab \b 백스페이스바 \\는 문자로써의 역슬레쉬. \d는 정규표현식에서 숫자 0부터 9까지임, 중괄호 {n, m} 은 n에서 m까지의 라는 뜻이다. -->결국 \\d{3,4}의 뜻은 0~9 중에서 3개에서 4개까지라는 뜻
//		마지막 \\d{4}는 0에서 9까지 4개가 있어야한다는 뜻이다.
//		-->결국 조합해보면 051-xxx-xxxx, 051-xxxx-xxxx, 010-xxx-xxxx, 010-xxxx-xxxx의 형태에 부합하는지 묻는다. x는 0~ 9까지 가능.
		String regExp = "(051|010)-\\d{3,4}-\\d{4}";

		String data = "010-123-1234"; // 실제 데이터
		boolean result = Pattern.matches(regExp, data);
		
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
//		역슬래쉬 두개는 역슬래쉬 하나를 나타냄
//		그래서 \w는 0~9와 A~Z 중 한 개를 나타낸다.
//		+가 들어가면 1개 이상이 존재한다는 뜻.
//		@는 정규표현식에 없으므로 그냥 말 그대로 @
//		-->다 합치면 영소문자대소문자 1개 이상 @ 영소문자대문자1개이상.영소대문자숫자1개이상
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data ="abc@navercom";
		result = Pattern.matches(regExp, data);
		
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}

}

























