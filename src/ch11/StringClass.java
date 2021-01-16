package ch11;

import java.io.UnsupportedEncodingException;

public class StringClass {
//	지정한 index의 글자 가져오기
	public void stringCharAt() {
		String ssn = "010624-1234123";
		char gender = ssn.charAt(7);
		
		switch (gender) {
//		if ( gender = 1 || gender = 3) 과 같다. || 는 or
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
			
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}
	}
	
	public void stringEquals() {
//		new가 들어가면 힙 메모리 영역에 새로 등록
//		new Stirng을 사용하면 동일한 문자열을 사용했더라도 메모리 주소를 따로 사용함 !! 기억해주기
		String strVal1 = new String("아이유");
		String strVal2 = "아이유";
//		String strVal3 = "아이유";
//		strVal2와 strVals3은 동일한 메모리 주소를 공유함.
		
		if (strVal1 == strVal2) {
			System.out.println("같은 String 객체 참조");
		}
		else {
			System.out.println("다른 String 객체 참조");
		}
		
//		equls는 문자열 비교, ==는 참조주소 비교
		if (strVal1.equals(strVal2)) {
			System.out.println("같은 문자열을 가짐");
		}
		else {
			System.out.println("다른 문자열을 가짐");
		}
	}
	
	public void stringGetBytes() {
		String str = "안녕하세요";
		
//		하나의 문자열을 byte 타입의 배열에 저장
		byte[] bytes1 = str.getBytes();
//		처음에 길이가 15 나오는 것이 지금 우리가 설정한 자바가 UTF-8로 되어 있어서임.
		System.out.println("bytes1.length : " + bytes1.length);
//		String 클래스 타입의 생성자를 이용하여 byte 타입의 배열을 문자열로 변환
		String str1 = new String(bytes1);
		System.out.println("bytes1->String : " + str1);
		
//		글자표현 아스키코드, 영어표현은 1byte, 그러나 1byte는 표현할 문자가 몇 개 안돼서 2byte로 표현하는 멀티바이트문자가 나왔다. 이걸로 영어, 한글, 한자, 일본어 등 다양한 문자를 표현할 수 있었다. 그런데 이걸로 하니까 문자셋 종류가 너무 많아짐, 그래서 바꿔서 나온 것이 UTF 16 (4byte)이 기본임. 그러나 우리가 주로 쓰는 것은 UTF-8(3byte - 다변형이라서 보통 3바이트, 특정 문자시에 4바이트가 되기도 함)
		try {
//			getBytes를 이용하여 문자셋 변경
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->Stirng : " + str2 );
//			getBytes를 이용하여 문자셋 변경
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String : " + str3);
		}
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
//	indexOf : 지정한 문자열의 index 번호를 알려줌, 없을 경우 -1
	public void stringIndexOf() {
		String subject = "자바 프로그래밍";
		
		int location =subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}
		else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}
	
	public void stringLength() {
		String ssn = "7309241230123";
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println("주민번호 자릿수가 맞습니다.");
		}
		else {
			System.out.println("주민번호 자릿수가 틀립니다.");
		}
	}
	
	public void stringReplace() {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
	
	public void stringSubstring() {
		String ssn = "880815-1234567";
		
//		substring : 지정한 문자열에서 문자를 지정한 만큼 잘라내서 반환, 매개변수가 1개일 경우 지정한 index에서 끝까지, 2개일 경우 첫 번째 매개변수는 index, 두 번째 매개변수는 가져올 글자 갯수
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
	
	public void stringToLowerToUpper() {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
//		toLower : 영문 소문자로 변경
//		toUpper : 영문 대문자로 변경 .. DB에서 많이 쓴다.
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.toUpperCase());
	}
	
	public void stringTrim() {
		String tel1 = "   010";
		String tel2 = "1234   ";
		String tel3 = "   5678   ";
	
//		tirm : 문자열 앞, 뒤의 공백 문자를 제거
		String tel  = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
	
	public void stringValueOf() {
//		valueOf : 다른 데이터 타입에서 문자열로 변경
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}













