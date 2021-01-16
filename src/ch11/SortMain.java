package ch11;

import java.util.Arrays;

public class SortMain {

	public static void main(String[] args) {
		int[] scores = {99, 97, 98, 94, 91};
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		
		System.out.println("------------");
		
		String[] names = {"홍길동", "박동수", "김민수"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("scores[" + i + "] = " + names[i]);
		}
		
		System.out.println("------------");
		
		Arrays.sort(names);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		
		System.out.println("------------");
		
		Member4 m1 = new Member4("홍길동");
		Member4 m2 = new Member4("박동수");
		Member4 m3 = new Member4("김민수");
		
		Member4[] members = {m1, m2, m3};
		
		for (int i = 0; i < members.length; i++) {
			System.out.println("scores[" + i + "].name = " + members[i].name);
		}
		
		Arrays.sort(members);
		for (int i = 0; i < members.length; i++) {
			System.out.println("scores[" + i + "].name = " + members[i].name);
		}
	}

}














