package ch11;

import java.util.Comparator;
import java.util.Objects;

public class CompareMain {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);
		
//		compare : 2개의 객체를 비교하는 메서드
//		equals 는 정해져 있는 값을 출력하는 데 사용하고, compare는 사용자가 결과값 부분을 변경할 수 있음
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
	}
	
	static class Student {
		int sno;
		Student(int sno) {
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student> {
		@Override
		public int compare(Student a, Student b) {
			if (a.sno < b.sno) {
				return -1;
			}
			else if (a.sno == b.sno) {
				return 0;
			}
			else {
				return 1;
			}
		}
	}
}
