package wallmania.calender;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {
		
		// 사용하지 못한 이유를 알아야 한다. 
		// My_Calender cal = new My_Calender();
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n");
		
		int month = 1;
		int year = 1950;
		while (true) {
			System.out.print("year 입력하세요.\n");
			System.out.print(PROMPT);
			year = Integer.parseInt(scanner.next());
			System.out.print("month 입력하세요.\n");
			System.out.print(PROMPT);
			month = Integer.parseInt(scanner.next());
			if (month == -1) {
				break;
			} else if (month < 1) {
				System.out.print("\n" + "month should be greater than or equal to 1.\n\n");
				continue;
			} else if (month > 12) {
				System.out.print("\n" + "month should be less than or equal to 12\n\n");
				continue;
			} else {
				My_Calender.printCalender(year, month);
				System.out.print("\n\n");
			}
		}

		System.out.print("\nThe End");
		scanner.close();
	}
	
	public static void main (String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
