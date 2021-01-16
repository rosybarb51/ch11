package ch11;

public class Member2Main {

//	얕은 복사 진행
	public static void main(String[] args) {
		Member2 ori = new Member2("blue", "홍길동", "123456", 25, true);
		ori.test[0] = "00";
		ori.test[1] = "11";
		ori.test[2] = "22";
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id : " + ori.id);
		System.out.println("name : " + ori.name);
		System.out.println("password : " + ori.password);
		System.out.println("age : " + ori.age);
		System.out.println("adult : " + ori.adult);
		System.out.println("test : " + ori.test[0]);
		
		System.out.println();
		
//		얕은 복사를 사용하였기 때문에 멤버 변수 중 배열은 그대로 복사하지 못하고, 배열의 주소만 복사해 감
//		그래서 배열의 주소 하나를 ori와 copy가 같이 공유하는 형태임 지금
		Member2 copy = ori.getMember(); // 복사함
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id : " + copy.id);
		System.out.println("name : " + copy.name);
		System.out.println("password : " + copy.password);
		System.out.println("age : " + copy.age);
		System.out.println("adult : " + copy.adult);
		System.out.println("test : " + copy.test[0]);
		
		System.out.println("----- 변경 후 -----");
		
		copy.password = "67890"; // 복사한 것 내용 변경
		ori.test[0] = "0000"; // 복사한 것 중 참조 타입인 배열 내용 변경
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id : " + ori.id);
		System.out.println("name : " + ori.name);
		System.out.println("password : " + ori.password);
		System.out.println("age : " + ori.age);
		System.out.println("adult : " + ori.adult);
		System.out.println("test : " + ori.test[0]);
		
		System.out.println();
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id : " + copy.id);
		System.out.println("name : " + copy.name);
		System.out.println("password : " + copy.password);
		System.out.println("age : " + copy.age);
		System.out.println("adult : " + copy.adult);
		System.out.println("test : " + copy.test[0]);
	}

}
