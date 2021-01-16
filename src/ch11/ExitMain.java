package ch11;

public class ExitMain {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if (status != 5) {
//					throw : 예외 던지기
//					throw했으니까 catch부분으로 다시 던짐
					throw new SecurityException();
				}
			}
		});
		
//		for가 0 ~ 4까지 아래의 내용 실행하고, exit(i) 실행해서 checkExit도 실행한다. throw로 다시 catch 갔따가 아무 내용 없으니까 끝내서 다시 for문으로 올라가서 0에서 i가 다시 1이 되고 위의 과정 반복... 반복하다가 i가 5와 같으면 throw에서 i가 5가 아닐 때만 throw 했으므로, 5가 되면 프로그램이 종료됨
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				System.exit(i);
			}
			catch (SecurityException e) {
				
			}
		}
		
//		return : return 키워드를 만나면 메서드가 즉시 종료
//		exit : exit 키워드를 만나면 프로그램이 즉시 종료
//		위의 것 간단하게 작성한 것
//		위의 코드가 안전하다, 복잡하지만. 하지만 아래와ㅏ 같이 간단하게 해도 되긴 된다
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//			if (i == 5) {
//				System.exit(0);
//			}
//		}
	}

}
