package wallmania.calender;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n");
		
		int month = 1;
		while (true) {
			System.out.print("원하는 month를 입력하세요.\n");
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
				My_Calender.printSampleCalender(2019, month);
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
