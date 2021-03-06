package kr.ac.kopo.day11;


import java.util.Scanner;

	public class CalendarView { // 사용자가 무엇을 원하는지에 따라 계속 바꿀 수 있음 

		private Scanner sc = new Scanner(System.in);
		
		private int getInt(String msg) {
			System.out.print(msg);
			return Integer.parseInt(sc.nextLine());
		}
		
		public void process() {
			CalendarUtil util = new CalendarUtil();
			while(true) {
				int type = getInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료) : ");
				int year = 0, month = 0;
				switch (type) {
				case 1:
					year = getInt("년도를 입력하세요 : ");
					util.showByYear(year);
					break;
				case 2:
					year = getInt("년도를 입력하세요 : ");
					month = getInt("월을 입력하세요 : ");
					util.showByMonth(year, month);
					break;
				case 3:
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
				}
			}
		}
	}


