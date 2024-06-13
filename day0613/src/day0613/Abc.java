package day0613;

public class Abc {
	int su; // 0으로 초기화
//	My my; // null로 초기화
	String str; // null로 초기화
	
	Abc() {
		this("ureca"); // Abc(String str) 호출, this.str = str;로 멤버 변수에 할당
		su = 1000;
	}
	
//	Abc(String str) {
//		str = str;
//	}
	
	Abc(String str) {
		this.str = str;
	}
	
	void hello() {
		System.out.println("안녕");
	}
}
