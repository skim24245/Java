package kr.ac.kopo.day01;

/*
 �⺻�ڷ���
  ������: boolean
  ������: char
  ������: byte, short, int(�⺻), long
  �Ǽ���: float, double(�⺻)
  
  
  ���� ����
  �ڷ��� ������;
  
  ���� ����
  ������ = ��;
  ���� �ʱ�ȭ (����� ���ÿ� �� ����)
  �ڷ��� ������ =��;
  ���� �ڷ����� ���� ������ ����
  �ڷ��� ������ 1, ������ 2, ������ 3, ....;
 */


/*������ ��ǻ�� �޸�
�⺻ �ڷ��� (boolean, char, short, long ) : stack = ������ ����� ������ ������ �� �ִ� �̸��� ����. �������� ������. / ������ ���� ������/ ex) ���� �̸� �� ����Ʈ �̸� . ��ǻ�� ���忡�� �������� �߿��Ѱ� �ƴ϶� �������� �߿��Ѱ���! 
��ü������ �ַ� heap =���߿����� heap�� �߿���. : �������� �������� ����. ex) �����̳�, �ּҰ� �� �� ����. ���� ���ú��� �ξ� ������ 
 �޼ҵ�� ������ �޸� 
��ǻ�� ���忡���� �������� ������ �����ϴ� ������ ���� (ex= �ְ�����Ʈ 1�� ������ �ִ� ������
�޸��� ���� �ּ� = ���⼭���� 4byte���� �� ����. ���⼭���� 8byte�� �� ����.

*/
public class VariableMain {
	  char b; //	 * Ŭ���� �ȿ� �����ϸ� ��� ������� ��.  �ڵ��ʱ�ȭ o  �Ǵ� �ʵ��� �θ�.
	 
	public static void main(String[] args) {
	
		char a; //�ʱ�ȭ x . a��� ������ ����� ������ �� ������ ���� �𸣴ϱ� garbage ��� Ī�Ѵ�. �׸��� ������ ��. �޼ҵ� �ȿ��� ����� ���� =���� ������� Ī��, �̰� �ڵ����� �ʱ�ȭ�� �ȉ�
		
		a = 'A';// �޼ҵ� �ȿ� ����� ���� ������ �ʱ�ȭ�� �ȵǴϱ� �ʱ�ȭ�� ���� ����� ��.
		System.out.println(a);
		//���� 123�� �����ϱ� ���� ���� C ����
		int c =123;
		
		/*�Ǽ� 3���� �����ϱ� ���� ���� d1, d2, d3 ����
		double d1;
		double d2;
		double d3;
		*/
		
		
		/* �߰��� �ʱⰪ�� �ְ� �ڿ��� ���� ���
		d1�̶� d3�� �� �տ� �Բ� ������ 
		*/
		
		/*
		 ���ڿ��� �����ϱ� ���� Ŭ���� ��Ʈ��
		 */
		double d1, d2 = 12.34, d3 =0;
		
		System.out.println(a);
		System.out.println(c);
		
	}

}