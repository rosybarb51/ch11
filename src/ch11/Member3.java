package ch11;

import java.util.Arrays;

public class Member3 implements Cloneable {
	public String name; // 문자열 타입의 멤버 변수
	public int age; // 정수형 타입의 멤버 변수
	public int[] scores; // 정수형 타입의 배열
	public Car car; // Car 클래스 타입의 멤버 변수
	
	public Member3(String name, int age, int[] scores, Car car) {
//		생성자에서 다 초기화
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
//	복사하기 위한 메서드
//	반환값이 Member3 클래스 타입의 객체 
	public Member3 getMember() {
//		클래스 Member3의 변수 cloned을 생성
		Member3 cloned = null;
		
		try {
//			Object 클래스의 멤버 메서드인 clone()을 상속받아서 사용함
//			clone() 메서드의 반환값이 Object 타입이라서 Member3 클래스 타입으로 강제형변환 해줌. 다시 변환
			cloned = (Member3) clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	
//	깊은 복사, 참조 타입도 완벽하게 복사함
	@Override
	protected Object clone() throws CloneNotSupportedException {
//		부모 클래스가 물려준 clone() 메서드 사용
//		얕은 복사를 해옴, 얕은 복사이기 때문에 배열인 scores와 클래스의 변수인 car가 해당 객체의 주소만 가져옴
//		Member3 클래스 타입으로 강제 타입 변환
		Member3 cloned = (Member3) super.clone();
//		Arrays.copyOf : Arrays 클래스가 지원하는 배열을 복사하는 명령어
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
//		Car 클래스의 객체를 새로 생성하면서 현재 객체의 Car 클래스의 모델명을 사용함
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
}





















