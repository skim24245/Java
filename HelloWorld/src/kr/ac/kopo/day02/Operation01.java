package kr.ac.kopo.day02;

public class Operation01 {
	public static void main(String[] args) {
		 
		int a = 1, b = 0, c = -1;
		boolean bool = a++ > 0 || b-- >= 0 && c++ <= 0; //a값은 1이 됨. // 오른쪽 문장이 다 끝낸 다음에 움직인다. 
		System.out.println("bool : " + bool);
		System.out.println("a : " + a + ", b: " + b + ", c : " + c);
		
  /*
		int a =1, b = 0, c = -1;
		//boolean bool =(++a > 1) || (++b > 1);
		boolean bool = --a > 1 && ++ b > 1 || ++c > 0;
		System.out.println("bool : " + bool);
		System.out.println("a : " + a + ", b: " + b + ", c : " + c);
		// and와 or 나오면 and가 먼저 수행된다.
		 * 
		 */
		
				
		
	}
}
