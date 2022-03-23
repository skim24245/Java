package kr.ac.kopo.day01;

public class PrintMain02 {

	/*
	 	ASCII CODE(0 ~ 256) : 1byte 
	 	   �빮��, �ҹ���, ���ڹ���, Ư������, ���鹮�ڸ� ���ڷ� �ϴ��� ��Ī��Ų ����ǥ
	 	   
	 	UNICODE(0 ~ 65500) : 2byte
	 	   �ٱ��� ���� ����ǥ(ASCII CODE + �ѱ�, ����, ....)
	 	   �ڹ��� �����ν� 
	 	   
	 	   'A' : 65   0x41
	 	   'a' : 97	  0x61
	 	   '0' : 48   0x30
	 	   
	 */
	public static void main(String[] args) {
		
		System.out.println('A');
		System.out.println('A' + "BCD");
		System.out.println('A' + 'B');	// 65 + 66
		System.out.println('A' + 10);	// 65 + 10
		System.out.println(0x41 + 0x42);
		
	}
}
