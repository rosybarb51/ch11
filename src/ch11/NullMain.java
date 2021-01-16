package ch11;

import java.util.Objects;

public class NullMain {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
//		isNull : 매개변수가 null 일 경우 true;
//		nonNull : 매개변수가 null 이 아닐 경우 true;
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.isNull(str2));
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.nonNull(str2));
	}

}
