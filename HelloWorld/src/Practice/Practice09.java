package Practice;

public class Practice09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("보유하고 있는 책권수 : ");
		int one = sc.nextInt();
		if(one < 0) {
			System.out.println("잘못입력했습니다");
		} else if(one == 0) {
			System.out.println("보유하고 있는 책 없음");
		} else if(one == 1) {
			System.out.println(one + " book");
		} else {
			System.out.println(one + " books");
		}
		System.out.println();
}
