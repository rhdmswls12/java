package day0611;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		Test1();
		Test2();
		Test3();
		Test4();
		Test6();
		Test7();
		Example();
	}
	
	static void Test1() {
		int []su= {1,2,3,4,5};
		int len = su.length;
		for (int i=0; i<len; i++) {
			System.out.print(su[i]+" ");
		}
		System.out.println();
	}
	
	static void Test2() {
		int []su= {1,2,3,4,5};
		int len = su.length;
		for (int i=len-1; i>=0; i--) {
			System.out.print(su[i]+" ");
		}
		System.out.println();
	}
	
	static void Test3() {
		int su2[][] = {{1},{1,2},{1,2,3}};
		for (int i=0; i<su2.length; i++) {
			for (int j=0; j<su2[i].length; j++) {
				System.out.println("su2["+i+"]["+j+"]번지="+(i+1)+"행 "+(j+1)+"열");
			}
		}
		System.out.println();
	}
	
	static void Test4() {
		int []su= {1,2,3,4,5};
		int []su3=Arrays.copyOfRange(su, 0, su.length);
		su3[2] = 33;
		System.out.println("su3[2]번지 데이터 출력"+su3[2]); //33
		System.out.println("su[2]번지 데이터 출력"+su[2]); //3
	}
	
	static void Test6() {
		int []su= {1,2,3,4,5};
		int len = su.length;
		for (int i=0; i<len; i++) {
			if (i%2 == 1) System.out.print(su[i]+" ");
		}
		System.out.println();
	}

	static void Test7() {
		int []su= {1,3,5,7,65};
		int len = su.length;
		for (int i=0; i<len; i++) {
			if (su[i]%2 == 1) System.out.print(su[i]+" ");
		}
		System.out.println();
	}
	static void Example() {
		int []su = {1,2,3,4,5};
		System.out.println(Arrays.toString(su));
	}
}
