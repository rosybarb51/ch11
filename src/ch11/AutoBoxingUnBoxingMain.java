package ch11;

public class AutoBoxingUnBoxingMain {

	public static void main(String[] args) {
//		자동 Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
//		자동 UnBoxing
		int value = obj;
		System.out.println("value : " + value);
		
//		연산 시 자동 UnBoxing
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
