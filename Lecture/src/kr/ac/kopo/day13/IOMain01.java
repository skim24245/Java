package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;

public class IOMain01 {

	public static void main(String[] args) {
		// System.in 키보드를 입력 받는다는 뜻
		InputStream is = System.in;
		System.out.println("키보드 입력을 하세요. ctrl + z 입력시 종료"); // ctrl z라는 뜻은 중간에 멈춘다는 뜻. 키보드를 입력받는 행위를 그만두겠다는 뜻. 

		while (true) {
			try {
				int c = is.read(); // is.read는 하나의 문자를 입력받아 아스키코드를 변환해주는 것. 아스키코드랑 유니코드는 다 0보다 크니까, 음수값을 넣어주는 건 실패를 했다는 뜻. 
				if(c == -1) break ;  
				System.out.println((char)c); //abc를 입력했더니 97 98 99 가 찍히게 됌. 따라서 abc를 원하니까 integer값을 character로 형변환 시키면 됌. 
 				System.out.println(c); 
			} catch (IOException e) { // catch 구문에서 e.printStackTrace(); 구문 넣어 어떤 오류가 발생하는지 부터 확인
				e.printStackTrace();

			}
		}
	}
}
