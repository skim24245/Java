package kr.ac.kopo.day01;

import java.util.Scanner; // java.util.�� �ִ� ��Ű������ scanner Ŭ������ ������ ���̱� ������ import��� ����. 
public class ScannerMain {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in); // ��°�� �ܿ�.
	System.out.println("������ �ϳ� �Է��ϼ��� : "); // ~~�� �Է����� ������ ����� ��. 
	int a =sc.nextInt(); //next string�� ����. ���� �Է¹޴� �ڵ�� ����. �������̳� �Ǽ����� �ִµ� ���ڸ� �Է¹��� �� �ִ� ���´� ����. 
	System.out.println("a : " +a);
	
	//����, �Ǽ�, ����, 
	System.out.print("���ڸ� �Է� : "); // �ѱ۵� ���� 
	char ch = sc.nextLine().charAt(0);
	System.out.println("ch : " + ch);
	System.out.print("���ڿ��� �Է� :");
	String str =sc.next(); //���ڴ� next���� nextLine�� �ν� ���� ��. 
	System.out.println("str : " +str);
	
	
	//�� �ؿ� ���� �׸� �ִٴ� ���� ���� �� ����Ʈ�� ������� �ʾҴٴ� ��. 
	}
}
