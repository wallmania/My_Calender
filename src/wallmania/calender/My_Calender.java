package wallmania.calender;

public class My_Calender {
	// 어떠한 로직이든 함수로 만들어주면 좋다.
	public static int maxDaysofMonth(int month) {

		int day;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
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
	
	// import 자동 생성 단축키 : cmd + shift + m
	// 자동 들여쓰기 정리 단축키 : cmd + shift + f
	// git staging 찾기 : Window -> Show View -> Other -> git staging

	public static void printSampleCalender(int year, int month) {
		System.out.printf("\n  <<%4d년 %3d월>>\n", year, month);
		System.out.println("Su Mo Tu We Th Fr Sa");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
}
