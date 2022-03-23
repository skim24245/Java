package Practice;
import java.util.Scanner;

public class Practice03 {
	 /*
	  3. 반지름이 10인 원의 면적을 구해서 출력하시오(키보드입력)
	 */
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int radius = sc.nextInt();
			final double pi = 3.141592;
			System.out.println("원의 면적은 " + (radius * radius * pi) + " 입니다");
		}	
	}
