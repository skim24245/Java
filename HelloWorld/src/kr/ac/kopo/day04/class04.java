package kr.ac.kopo.day04;

import java.util.Scanner;

public class class04 {
	  public static void main(String[] args) {
		  int step = 3;
		  for (int dan =2; dan <= 9 ; dan += step) { //큰 아웃라인 
			  for (int j =dan ; j <= 9; i++) { // 한 행 
				  for(int j =dan; j <=9 && j <dan + step; j++) {
					  if(i == 0)
						  System.out.printf("*** %단 *** \t", j);
					  else
					  System.out.printf("%d * %d = %d\t", j, i, j * i);
				  }
				  System.out.println();
				  
			  }
			  System.out.println();
		  }
