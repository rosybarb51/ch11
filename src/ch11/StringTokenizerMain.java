package ch11;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		String text = "아이유/유인나/정인선";
		
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		st = new StringTokenizer(text, "/");
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}

}
