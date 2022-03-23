package kr.ac.kopo.day04;

public class class05 {
	public static void main(String[]args) {
		int snail = 0, hour = 0;
		while(snail < 100 ) {
			snail += (snail < 50 ? 5-1 : 5-2);
			System.out.println("[" + ++hour + "시간후] 달팽이가 올라간 총높이 : " + snail + "M"); //여기서 ++는 hour가 증가된 것을 말함 
		}
	}
	
}
