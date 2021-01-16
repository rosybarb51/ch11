package ch11;

public class StringBuilderMain {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
//		append : 기존 문자열 뒤에 추가
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
//		해당 index에 글자를 추가
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
//		해당 index의 글자를 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
//		해당 index부터 해당 위치까지의 글자를 3번 째 매개변수로 변경
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
//		해당 index부터 지정한 갯수의 글자 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
//		총 문자 수 출력
		int length = sb.length();
		System.out.println("총 문자 수  : " + length);
	
		String result = sb.toString();
		System.out.println(result);
	}

}
