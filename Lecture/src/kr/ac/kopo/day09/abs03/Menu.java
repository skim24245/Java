package kr.ac.kopo.day09.abs03;

import java.util.Scanner;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	
	public String select() {
		System.out.print("프린터를 선택하세요(1.LG  2.SAMSUNG  3.HP) => ");
		String type = sc.nextLine();
		return type;
	}
	
	public void print(String type) {
		switch(type) {
		case "1" :
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case "2" : 
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		case "3" : 
			HPPrinter hp = new HPPrinter();
//			hp.print();
			hp.hpPrint();
			break;
		}
	}
	
	public void process() {

		String type = select();
		print(type);
	}

	
}