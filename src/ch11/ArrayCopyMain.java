package ch11;

import java.util.Arrays;

public class ArrayCopyMain {

	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
//		copyOf : 원본 배열을 지정한 크기만큼 복사
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
//		copyOfRange : 원본 배열을 지정한 index에서부터 2번 째로 지정한 index 앞까지 복사
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));

//		System.arraycopy : 원본 배열과 시작 index, 사본 배열과 시작 index, 배열의 크기를 가지고 복사
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1,  0, arr4, 0, arr1.length);
		
//		for문 이용해서 직접 값 넣기
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i +"] = " + arr4[i]);
		}
	}

}
