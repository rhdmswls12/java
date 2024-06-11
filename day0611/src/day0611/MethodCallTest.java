package day0611;

public class MethodCallTest {
	static void good() {
		System.out.println("good");
	}
	public static void main(String[] args) {
		System.out.println("안녕");
		A a = new A();
		a.hello();
		good();
		A.uplus();
	}

}
