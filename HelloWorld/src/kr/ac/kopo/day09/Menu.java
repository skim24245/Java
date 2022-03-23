package kr.ac.kopo.day09;

import java.util.Scanner;

public class Menu {
//별말하지 않으면 메소드는 public 으로 
	private Scanner sc = new Scanner(System.in); //밑에 select에다가 평상시에 주로 쓰던 scanner sc = new scanner 이거 써도 됌. 우린 오늘 private를 배웠으니 이렇게 쓰는 거임.
	
	public String select() {
		//Scanner sc = new Scanner(System.in);
		System.out.print("프린터를 선택하세요(1. LG 2. SAMSUNG) => ");
		String type = sc.nextLine();
		return type; //밑에 string type를 출력할 거임. 
	}
	public void print(String type) {
		switch(type) {
		case "1" :
			LGprinter lg = new LGprinter();
			lg.lgprint();
			break;
		case "2" :
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrint();
			break;
		}
		
	}
	public void process() { //나중에는 이렇게 public void process()처럼 자동으로 만들어지는 기능을 사용할 수 있음.
		String type = select();
		print(type); //타입에 따라 뭔가를 출력해라. 
		 
	}
}
//print의 목적은 출력하는 것. 
