package Practice;

public class Practice05 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("달러를 입력하세요 : ");
			int dollar = sc.nextInt();
			double won = 1092.50 * dollar;
			System.out.printf("원화 : %.2f원", won * 1092.50);
			
			
		}
	}

