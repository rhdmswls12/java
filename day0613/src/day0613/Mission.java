package day0613;

import java.util.Arrays;
import java.util.Comparator;

public class Mission {

	public static void main(String[] args) {
		Mission1();
		Mission2();
		Mission3();
	}
	
	static void Mission1() {
		int[]su= {13, 8, 7, 10, 100, 5};
		Arrays.sort(su);
		System.out.println("<미쳔1출력>");
		System.out.print("=>");
		for (int i=0; i<su.length; i++) {
			System.out.print(" "+su[i]);
		}
		System.out.println();
	}
	
	static void Mission2() {
		char[] ch= {'J','a','v','A'};
		String[] names= {"홍길동","길라임","김주원"};
		
		Arrays.sort(ch);
		Arrays.sort(names);
		
		System.out.println("<미쳔2출력>");
		System.out.print("=>");
		
		for (int i=0; i<ch.length; i++) {
			System.out.print(" "+ch[i]);
		}
		System.out.println();
		System.out.print("=>");
		for (int i=0; i<names.length; i++) {
			System.out.print(" "+names[i]);
		}
		System.out.println();
	}
	
	static void Mission3() {
		Person p = new Person("갓길동",11,"학생",95);

		Person[] persons= {p ,
		new Person("빛길동",19,"학생",80),
		new Person("남길동",14,"학생",100),
		new Person("여길동",17,"학생",99),
		new Person("킹길동",15,"학생",56)};
		
		Arrays.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.name.compareTo(p2.name);
			}
		});
		
		for (Person person:persons) {
			System.out.println("["+person.name+","+person.age+","+person.job+","+person.score+"]");
		}
	}
}
