package kr.ac.kopo.day01;

public class PrintMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ٴ����� �ּ�ó�� 
		/*
		 *�������
		 *1. ������ ���
		 *2. �Ǽ��� ���
		 *3. ������ ��� ('A', 'b') :�빮��('A'), �ҹ���('m'), Ư������('!'), ���ڹ���,  ���鹮�� = �����̽� ����(' ') ���� ���� '\n', �� ���� ('\t')  , �ѱ��� ���ԉ� 
		 *4. ���ڿ� ���("abc")
		 *5. ���� ��� (true, false)
		 */
		/*
		��� �޼ҵ�
		1.println() : ���๮�� ���� 
		.
		2.printf() : jDK 1.5 �߰� ���๮�� ���� x ��¹������� (%d: ����, %f :�Ǽ�, %c : ����, %s : ���ڿ�, %b :����)
		3.print() : ���๮�� ���� x 
		print f�� ������� �⺻�� ������ ""�ȿ� �ִ� �͸� ���. �׷��� ���ڰ� ���� �� �ְ� ��
		ex) printf("23��"); �� 23������ ��� ��
		�������� ���� ���¿��� �����ϰ� �Ǹ� 
		ó���� ������ ���� ������ main���� �����Ѵ�. main���� ������ ���ϸ� ���� �ȳ���. 
		*/
		
				System.out.println(10);
				System.out.println(12.34);
				System.out.println('A');
				System.out.println("Hello");
				System.out.println(true);
				System.out.println("23��");
				System.out.println(23);
				System.out.println(23 + "��");
				System.out.println(10 + " + " + 20 + " = " + (10 + 20)); //���ڸ� ���ϰ� ������ ��ȣ�� ġ�� ������� ��. 
				System.out.println(10 + " + " + 20 + " = " + 10 + 20); 
				System.out.printf("%d��\n", 23); //%d�� 23���� ��Ī�� ��. 
				System.out.println(); // �� �ؿ� �����. enter�� �ǹ̸� ����. �ٹٲ� 
				System.out.printf("%d + %d = %d\n", 10, 20, 10+20); //
				System.out.printf("[%-7d]\n", 1200); //-7�� 7���� ���ڸ� ���ϰ� -�� ������ [1200     ]�̷��� ǥ�É�. 
				System.out.printf("[%-7d]\n", 950);
				System.out.printf("[%-7d]\n", 15800);
				System.out.printf("[%04d]\n", 35);
				System.out.printf("[%02d]\n", 35);
				System.out.printf("[%.2f]\n", 12.3456); // �Ҽ��� ���� 4�������� ��� ���� �� 
				System.out.printf("[%.1f]\n", 12.3456);
				
		}
}
