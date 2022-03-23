package kr.ac.kopo.day08_Assignment;

import java.util.Scanner;

import kr.ac.kopo.day08.Icecream;

	public class Assignment01 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.print("아이스크림 몇개 구입할래? => ");
			int num = sc.nextInt();
			System.out.println();

			Icecream[] icecreams = new Icecream[num];
			for (int i = 0; i < num; i++) {
				System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i + 1);
				icecreams[i] = new Icecream();

				System.out.print("아이스크림명 : ");
				icecreams[i].name = sc.next();
				System.out.print("아이스크림가격 : ");
				icecreams[i].price = sc.nextInt();

				System.out.println();
			}
			System.out.println();

			// 출력
			System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", num);
			System.out.println("번호\t아이스크림명\t가격");
			int sum = 0;
			for (int i = 0; i < icecreams.length; i++) {
				System.out.printf("%d\t%s\t\t%d\n", i + 1, icecreams[i].name, icecreams[i].price);
				sum += icecreams[i].price;
			}
			System.out.println("총 판매액 : " + sum + "원");

			sc.close();
		}
	}
