package ch11;

public class ByteToStringMain {

	public static void main(String[] args) {
//		인터넷 가서 아스키코드표 검색해서 10진에 해당하는 번호 가보면 72번이 H이다.
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
//		byte 타입의 배열을문자열로 변환
		String str1 = new String(bytes);
		System.out.println(str1);
		
//		byte 타입의 배열을 문자열로 변환, 6번 째 index부터 4글자 가져와서 문자열로 변환
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}

}
