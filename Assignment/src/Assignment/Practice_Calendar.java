package Assignment;

public class Practice_Calendar {


import java.util.Calendar;

	// 캘린더와 관련된 기능만 모아둔 클래스


		
		public void ShowYear(int year) {
			for(int month = 1; month <= 12; month++) { //
				ShowMonth(year,month);
			}
		}
		
		public void ShowMonth(int year, int month) {
			// 인스턴스 공유
			Calendar c = Calendar.getInstance();
			
			// setter
			c.set(year, month-1, 1);
			int day = c.get(Calendar.DAY_OF_WEEK);
			// 마지막 날의 수
			int lastday = c.getActualMaximum(Calendar.DATE);
			System.out.println("< "+year+"년"+month+"월"+" >");
			ShowDay(day, lastday);
		}
		
		public void ShowDay(int day, int lastday) {
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			// 열 뛰기
			int Cnt = 0;
			
			for(int i = 1; i < day; i++) {
				System.out.print("\t");
				Cnt++;
			}
			
			for(int j = 1; j <= lastday; j++) {
	            System.out.printf("%2d\t", j);
				Cnt++;
				if(Cnt % 7 ==0 || j == lastday)
					System.out.println();
			}
		}
	}

