// import 자동 생성 단축키 : cmd + shift + m
// 자동 들여쓰기 정리 단축키 : cmd + shift + f
// git staging 찾기 : Window -> Show View -> Other -> git staging

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
	
	public static int getWeekDay(int year, int month, int day) {
		// Standard Year, Month, Day -> syear(1970), smonth(1), sday(1), sweekday(4)
		int syear = 1970, sweekday = 4; // Thursday (1970.01.01)
		
		// Get # of days b/w syear and year
		// Get # of days b/w 1 and month
		// Get # of days b/w 1 and day
		int count = 0;
		for (int i=syear; i < year; i++) {
			int delta = 0;
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
				delta = 366;
			} else {
				delta = 365;
			}
			count += delta;
		}
		for (int j=1; j < month; j++) { int delta = getMaxDayofMonth(j, year); count += delta;}
		count += day - 1;
		
		// Get weekday
		int weekday = (sweekday + count % 7) % 7; 
		
		return weekday;
	}
	
	public static void printCalender(int year, int month) {
		System.out.printf("\n   <<%4d년 %d월>>\n", year, month);
		System.out.println("Su Mo Tu We Th Fr Sa");
		System.out.println("--------------------");
		
		// Get 1st line 
		int weekday = getWeekDay(year, month, 1);
		for (int i=1; i<=weekday; i++) { System.out.print("   "); }
		for (int i=1; i<= 7-weekday; i++) { System.out.printf("%2d ", i); }
		System.out.print("\n");		
		
		// Get 2nd ~ Last line
		int maxDay = getMaxDayofMonth(month, year);
		for (int i=7-weekday+1; i<= maxDay; i++) {
			System.out.printf("%2d ", i);
			if (i % 7 == ((7 - weekday) % 7)) {
				System.out.print("\n");
			}
		}
	}
}
