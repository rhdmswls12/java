package day0613;

class A {
	public void happy() {
		System.out.println("happy");
	}
}

class Child extends A {
	public void happy() {
		System.out.println("happy!!");
	}
}

interface Ureca {
	void good();
}

class My {
	public static void go(Ureca u) {
		u.good();
	}
}
// 자식 클래스 추가
class UrecaJunior implements Ureca {

	@Override
	public void good() {
		System.out.println("good");
	}
	
}
public class AnonymousInnerClassTest { 
	
	public static void main(String[] args) {
//		A a = new Child();
//		a.happy(); // 오버라이딩
		
//		My.go(new Ureca()); // 인터페이스, 추상화 클래스는 객체화 불가 -> 자식 클래스 UrecaJunior 추가
//		My.go(new UrecaJunior());
		My.go(new Ureca() {

			@Override
			public void good() {
				System.out.println("good good");
				
			}
			
		});
		
		A a = new Child() {
			public void happy() {
				System.out.println("new");
			}
		};
		a.happy(); // 오버라이딩
	}

}
