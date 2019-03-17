package wallmania.calender;

public class My_Calender {
	
	// 윤년이면 2월 29까지, 평년이면 2월 28일까지  
	public static int getMaxDayofMonth(int month, int year) {

		int day;
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			case 2:
				day = 29;
				break;
			default:
				day = 0;
				break;
			}
		} else {
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
		
		int maxDay = getMaxDayofMonth(month, year);
		for (int i=1; i<= maxDay; i++) {
			System.out.printf("%2d ", i);
			if (i % 7 == 0) {
				System.out.print("\n");
			}
		}
	}
}
