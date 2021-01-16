package ch11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SystemTimeMain {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i = 0; i <= 1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다.");

		System.out.println("\n------------------\n");
//		현재 시간 구하기
//		Date 클래스 사용
		Date time = new Date(); // 현재 시간을 기준으로 Date 클래스 객체를 생성
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 날짜 표현 형식을 만들어 주는 클래스
		String currentTime = format.format(time);
		System.out.println(currentTime);
		
		System.out.println("------------------");
//		System 클래스의 currentTimeMillis() 사용
		SimpleDateFormat mFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String mTime = mFormat.format(System.currentTimeMillis());
		System.out.println("mTime");
		
		System.out.println("------------------");
//		Calendar 클래스 이용하기
//		날짜 관련된 건 Calendar 이용하는 게 좋을 듯. Date는 이제 막힘..
		SimpleDateFormat cFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		String cTime = cFormat.format(calendar.getTime());
		System.out.println(cTime);
	}

}






















