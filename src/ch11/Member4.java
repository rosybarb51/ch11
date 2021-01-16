package ch11;

public class Member4 implements Comparable<Member4>{
	String name;
	
	Member4(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member4 o) {
		return name.compareTo(o.name);
	}
}
