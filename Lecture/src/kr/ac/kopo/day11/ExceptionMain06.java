package kr.ac.kopo.day11;

import java.util.Random;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain06 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		try {
			
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					if(j == 3) {
						return;
					}
				}
			}
			
			FileReader fr = new FileReader("a.txt");	// checked Exception
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
		System.out.println("main end...");
		
	}
}



