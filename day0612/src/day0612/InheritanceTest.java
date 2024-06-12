package day0612;

public class InheritanceTest {

	public static void main(String[] args) {
//		Parent p = new Parent();
		Parent p2 = new Child();
//		Child c = new Child();
		Child c3 = (Child)p2;
		
//		System.out.println(p.su);
//		System.out.println(c.sum);
		System.out.println(p2.su);
		System.out.println(c3.sum);
		
//		p.hello();
//		p.print(); // 부모
//		p.goodBye(); // child의 메소드->에러
		p2.hello();
		p2.print();
//		p2.goodBye()
		
//		c.goodBye();
//		c.print(); // 자식
//		c.hello(); // 안녕
		c3.hello();
		c3.print();
		c3.goodBye();
	}

}
