package Practice;

public class Practice10 {
	 /*
		a > b > c
		a > c > b
		b > a > c 
		b > c > a
		c > a > b
		c > b > a
		*/
		/*
		 *int max = num1 > num2 ? num1 : num2;
		  int min = num1 > num2 ? num2 : num1;
		 */
		public static void main(String[]args) {
			Random r = new Random();
			int num1 =r.nextInt(30) + 1;
			int num2 =r.nextInt(30) + 1;
			int num3 =r.nextInt(30) + 1;
		 System.out.println(num1 + " : " + num2 + " : " + num3);
		 int max = num1, min = num2;
		 if(num1 < num2) {
			 max = num2;
			 min = num1;
			 
		 }
		 if (num3 > max) {
			 System.out.println("%3d%3d%3d\n", num3, max, min);
		 }else if(num 3 > min) {
			 System.out.println("%3d%3d%3d\n", max, num3, min);
		 }else {
			 System.out.println("%3d%3d%3d\n, max , min, num3);
		 }
		 }
		
		//3개의 정수 값을 랜덤으로 가져옴
}
