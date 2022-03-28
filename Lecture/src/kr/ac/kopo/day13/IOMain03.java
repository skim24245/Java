package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 	Koala.jpg -> Koala2.jpg 복사 
 	외부장치에서 외부장치로 보내려면, 외부장치에서 ram을 가지고 온 후 ram에서 다시 저장해야 한다. 무조건 ram을 거쳐서 가야한다.
	- 입력 : 다른 곳의 데이터를 가져오는 것.  파일 읽기, 이미지&동영상 불러오기
	- 출력 : 다른 곳으로 데이터를 내보내는 것. 파일쓰기, 이미지&동영상 내보내기 
 */

/*
 	Koala.jpg -> Koala2.jpg 복사 
 */

public class IOMain03 {

	public static void main(String[] args) {
	
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");
			
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			fos.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일복사가 완료되었습니다");
	}
}












