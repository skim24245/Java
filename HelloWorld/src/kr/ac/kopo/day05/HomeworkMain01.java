package kr.ac.kopo.day05;

import java.util.Scanner;
public class HomeworkMain01 {
// continue를 만나는 순간 올바르지 않다면 곧바로 위로 올라가는 것. 하지 않게 될 경우 continue를 많이 쓴다. 
	public static void main(String[] args) {
		int[] nums = new int[10];
		int[] sum = new int[2]; // [0]:짝수총합 ~ [1]:홀수총합
		Scanner sc = new Scanner(System.in);

		int loc = 0;
		while(loc < nums.length) {
			System.out.print(loc+1 + "번째 정수 입력 : ");
			nums[loc] = sc.nextInt(); //입력 값
			if(nums[loc] < 0) // while를 진행하다가 if 일 경우에 밑에를 실행하라.
				continue; //continue를 쓰는 것 보다는 do while를 쓰는게 좋음! 
			sum[nums[loc] % 2] = nums[loc++]; 
			
		}
		
		/*
		for(int i = 0; i < nums.length; ) {
			System.out.print(i + 1 + "번째 정수 입력 : "); //nums.length를 쓸 경우는 1을 더해줘야 한다. 
			nums[i] = sc.nextInt(); // i의 배열 값들을 입력해라. 
			if(nums[i] >= 0) { //만약 i가 0보다 클 경우 
				sum[nums[i] % 2] += nums[i]; 
				i++;
			}
		}
		*/
		/*
		for(int i = 0; i < nums.length; i++) {
			do{
				System.out.print(i + 1 + "번째 정수 입력 : ");
				nums[i] = sc.nextInt();
			}while(nums[i] < 0);
			sum[nums[i] % 2] += nums[i];
		}
		 continue를 쓸 바에는 do while를 쓰는게 좋음 
		*/
		
		String[] title = {"짝수", "홀수"};
		for(int mod = 0; mod <= 1; mod++) {
			System.out.println("< " + title[mod] + ">");
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] % 2 == mod) {
					System.out.print(nums[i] + "  ");
				}
			}
			System.out.println();
			System.out.println(title[mod] + "총합 : " + sum[mod]);
		}
	}
}






