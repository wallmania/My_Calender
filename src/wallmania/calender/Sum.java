package wallmania.calender;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a, b;
		
		// 자동으로 import 해주는 단축키 : cmd + shift + m
		// input 은 두 수 (키보드로 받는다)
		System.out.println("두 수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		// System.out.println("두 수의 합은 " + (a+b) + " 입니다.");
		System.out.printf("%d + %d = %d", a, b, a + b);
		// scanner을 열었으면 꼭 닫아주어야 한다. 
		scanner.close();
	}

}
