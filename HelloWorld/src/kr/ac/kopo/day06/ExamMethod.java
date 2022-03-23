package kr.ac.kopo.day06;

//합구하는 메소드! 

class ExamMethod { 
	int getsum(int a, int b) { //getsome의 메소드를 이용해서 값을 구하고 싶음. 그러려면 getsome을 이용해서 instace 객체를 만들어줘야 함.  return 타입의 자료형은 int이기 때문에 앞에 int를 써줘야 한다.  
		return a + b; // a와 b를 더한 값을 넘겨주는 것 
	}
}
int getTotal(int a, int b) {
	int s = 0;
	while (a <= b) {
		s += a++;
	}
	return s;
}

public class MethodMain03{
	public static void main(String[] args) {
		ExamMethod exam = new ExamMethod ();
		int sum = exam.getsum(10 , 20);
		System.out.println("10 + 20 = " + sum);
		System.out.println("1 ~ 10 총합 : " + exam.getTotal(1, 10));
	} 
}