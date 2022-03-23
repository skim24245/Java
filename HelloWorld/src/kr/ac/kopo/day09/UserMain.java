package kr.ac.kopo.day09;

/*
 * 프린터를 선택하세요 (1. LG 2. SAMSUNG) => 1 
 * LG프린터에서 출력합니다
 * 
 * 프린터를 선택하세요 (1. LG 2. SAMSUNG) =>2 
 * SAMSUNG 프린터에서 출력합니다 
 */
public class UserMain {
	public static void main(String[]args) {
		Menu menu = new Menu();
		//객체를 먼저 생성한 후 프린터를 선택해서 출력하는 걸 원함
		menu.process(); //혹시나 이전에 menu를 생성하지 않아 에러가 뜰 경우, 클릭하면 자동으로 menu 가서 메소드 생성해준다. 
		//process는 메뉴 타입에 있어야 함. 
	}
}
