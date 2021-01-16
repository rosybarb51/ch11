package ch11;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
//	아래의 부분 없으면 실행했을 때 해시 코드만 나온다.
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
