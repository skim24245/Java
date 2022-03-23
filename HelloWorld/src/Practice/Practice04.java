package Practice;

public class Practice04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num_1 = sc.nextInt();
		System.out.print("나눌 수를 입력하세요 : ");
		int num_2 = sc.nextInt();
		System.out.println("몫 : " +num_1/num_2);
		System.out.println("나머지 :" +num_1 % num_2);	
	
	}
}
}
