package kr.ac.kopo.day05;

//참조클래스 //멤버변수 
class Handphone{ //public을 생략할 수도 있음.  
	
	String name;                             //실사용자명 
	String phonenumber;                      //핸드폰번호
	String company;                          //제조사 
	
}

public class HandphoneMain01 { //핸드폰 클래스를 이용해서 instance 객체를 만든다. 
		public static void main(String [] args) {
			Handphone hp = new Handphone();
			hp.name = "홍길동";
			hp.phoneNumber = "010 - 1111- 22222";
			hp.company = "삼성";
			
			Handphone hp2 = new Handphone();
			hp2.name = "강길동";
			hp2.phoneNumber = "010 - 3333 -4444";
			hp2.company  ="애플";
			
			Handphone hp3 = new Handphone();
			hp3.name = "윤길동";
			hp3.phoneNumber = "010 - 5555- 6666";
			hp3.company = "화웨이";
			
			Handphone[] hpArr = {hp, hp2, hp3};
			
			for(Handphone phone : hpArr) { // hpArr가 가지고 있는 원소값은 handphone 임 
				System.out.println("사용자 : "  +phone.name + ", 전화번호 : " + phoneNumber + ", 제조사 : " + phone.company);
				
			}
			
			
			
		}
	}

