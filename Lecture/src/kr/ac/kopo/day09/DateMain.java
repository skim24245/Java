package kr.ac.kopo.day09;


import java.util.Date;

import kr.ac.kopo.day06.homework.Icecream;

public class DateMain {

		public static void main(String[] args) {
			
			Date d = new Date();
			System.out.println(d);
			
			// 오늘은 2022년 3월 23일(수)입니다
			int year = d.getYear() + 1900;
			int month = d.getMonth() + 1;
			int date = d.getDate();
			int day =d.getDay();
			String[] week = {"일", "월", "화", "수", "목", "금", "토"};
			System.out.println("오늘은 " + year + "년 " + month 
						+ "월 " + date + "일(" + week[day] + ")입니다" );
		}
	}

