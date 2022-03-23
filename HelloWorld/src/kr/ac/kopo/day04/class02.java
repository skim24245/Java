package kr.ac.kopo.day04;

import java.util.Scanner;

public class class02 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("숫자를 입력하세요");
	        int num =sc.nextInt();

	        for(int i=0; i<=num; i++){ //입력한 값만큼 밑에 *을 반복하라 
	            for(int j =0; j<i; j++){ //첫번째 행은 별 1개를 출력해라  //2번째 행은 별 2개 출력하라  // 3번째 행은 별 3개 출력해라 // 4번째 행은 별 4개 출력해라 i(첫번째 줄)에서 시작해서 j(첫번째 숫자까지 같은 숫자를 *로 출력하라 
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}

