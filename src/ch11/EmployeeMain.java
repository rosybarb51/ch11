package ch11;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp; // Employee 클래스의 변수 (스택메모리에 생성됨)
		
//		힙 메모리 영역에 객체를 생성
		emp = new Employee(1);
		emp = null; // 기존에 만들어진 Employee 객체의 주소를 잃어버림, Employee 객체는 메모리에 그대로 살아있음.
		emp = new Employee(2);
//		힙 메모리 영역에 객체를 생성, 기존의 생성된 객체의 주소를 삭제하고, 새 객체의 주소를 저장
		emp = new Employee(3);
		
//		Employee 1, Employee 2 객체가 메모리에 살아있지만 사용할 수 없음 - 메모리 주소를 모르니까 --> 메모리 용량만 사용하는 쓰레기 객체가 됨
		
		System.out.println("emp가 최종적으로 참조하는 사원번호 : ");
		System.out.println(emp.eno);
//		쓰레기 수집가를 실행 요청하여 쓰레기 객체를 메모리에서 삭제
		System.gc();
	}

}
