package day0612;

public class InheritanceTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.Parent();
		c.Parent("홍길동");
		
		System.out.println(c.su);
		
		c.toString();
		c.print();
	}

}
