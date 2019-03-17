package wallmania.calender;

import java.util.Scanner;

public class My_Calender {
	// 어떠한 로직이든 함수로 만들어주면 좋다.
	public static int maxDaysofMonth(int month) {

		int day;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 0;
			break;
		}
		return day;
	}

	public static void printSampleCalender() {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		// import 자동 생성 단축키 : cmd + shift + m
		// 자동 들여쓰기 정리 단축키 : cmd + shift + f
		// git staging 찾기 : Window -> Show View -> Other -> git staging
		//
		// 입력 받은 월의 최대 일수 구하기.

		printSampleCalender();
		String PROMPT = "cal> ";
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
				System.out.print("\n" + "month should be greater than or equal to 1.");
				System.out.print("\n\n");
				continue;
			} else if (month > 12) {
				System.out.print("\n" + "month should be less than or equal to 12");
				System.out.print("\n\n");
				continue;
			} else {
				System.out.printf("\n" + "month(%d), Max_Days(%d)", month, maxDaysofMonth(month));
				System.out.print("\n\n");
			}
		}

		System.out.print("\nThe End");
		scanner.close();
	}
}
