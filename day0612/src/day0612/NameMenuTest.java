package day0612;

import java.util.Scanner;

public class NameMenuTest {

	public static void main(String[] args) {
		NameMenu menu = new NameMenu();
		Scanner input = new Scanner(System.in);
		int num;
		do {
			System.out.print("<이름메뉴>\r\n1.추가 2.검색 3.수정 4.삭제 5.종료\r\n번호입력 ==>");
			num = input.nextInt();
			System.out.println();
			
			switch(num) {
			case 1:	{System.out.print("이름입력: ");
					String name = input.next();
					menu.add(name);}
					break;
			case 2: System.out.println("#이름목록");
					String[] names = menu.search();
					for (String name : names) {
						if (name != null) System.out.println(" " + name);
					}
					break;
			case 3:	System.out.print("기존이름입력: ");
					String oldName = input.next();
					System.out.print("변경이름입력: ");
					String newName = input.next();
					menu.update(oldName, newName);
					break;
			case 4: System.out.print("삭제이름입력: ");
					String name = input.next();
					menu.delete(name);
					break;
			}
			System.out.println();
		} while(num != 5);
		System.out.println("-- END --");
		input.close();
	}

}
