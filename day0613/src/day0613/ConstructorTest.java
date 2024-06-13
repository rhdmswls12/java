package day0613;

public class ConstructorTest {

	public static void main(String[] args) {
		Abc a = new Abc();
		Abc a2 = new Abc("java");
		System.out.println(a.su);
		
		a.hello();
		
		System.out.println(a.str);
		System.out.println(a2.str);
	}

}
