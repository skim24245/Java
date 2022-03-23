package kr.ac.kopo.day01;

/*
 	�������
 	1. ������ ���
 	2. �Ǽ��� ���
 	3. ������ ��� : �빮��('A'), �ҹ���('m'), ���ڹ���('4'),
 	              Ư������('!'), ���鹮��(' ', '\n', '\t'),
 	              �ѱ�('��', '��')
 	4. ���ڿ� ���("abc")
 	5. ���� ���(true, false)
 */

/*
 	 ��¸޼ҵ�
 	 1. println()	: ���๮�� ����
 	 2. print()		: ���๮�� ����X
 	 3. printf()	: JDK1.5 �߰�, ���๮�� ����X, ��¹�������
 	     ��¹���
 	       %d	: ����
 	       %f	: �Ǽ�
 	       %c	: ����
 	       %s	: ���ڿ�
 	       %b	: ����
 */
public class PrintMain {

	public static void main(String[] args) {
		
		System.out.println(10);	
		System.out.println(12.34);
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true);
		System.out.println("23��");
		System.out.print(23);
		System.out.println("��");
		System.out.println(23 + "��");
		
		// 10 + 20 = 30
		System.out.println(10 + " + " + 20 + " = " + 10 + 20);
		System.out.println(10 + " + " + 20 + " = " + (10 + 20));
		
		System.out.printf("%d��\n", 23);
//		System.out.println();     
		System.out.printf("%d + %d = %d\n", 10, 20, 10+20);
		System.out.printf("[%-7d]\n", 1200);
		System.out.printf("[%-7d]\n", 950);
		System.out.printf("[%-7d]\n", 15800);
		System.out.printf("[%04d]\n", 35);
		System.out.printf("[%.1f]\n", 12.3456);
		System.out.printf("%b\n", true);
	}
}













