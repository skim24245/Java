package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


//System.in 키보드를 입력 받는다는 뜻
// ctrl z라는 뜻은 중간에 멈춘다는 뜻. 키보드를 입력받는 행위를 그만두겠다는 뜻. 
//InputStreamReader isr = new InputStreamReader(is); // byte형태를 문자 형태로 바꿔주라는 뜻. 키보드 입력을 받을 땐 다 byte형태로 들어오지만, inputstream 을 집어넣으면 byte형태를 2개씩 묶어서 character 형태로 뽑아주는 것. =  inputstreareader
//입력에서는 read 출력에서는 write 메소드와 flush 메소드
//출력에 남아있는 데이터가 buffer에 쌓일 수 있으니 이걸 다 내보내주려면 flush 를 사용하는것.  내보내줌. 
//다 하고 나서 flush를 써줘서 데이터를 다 보내는걸 해야함. flush를 쓰는 걸 습관화하자. 
//파일에 입력하고 싶으면 fileInputstream
//파일 객체를 저장하고 싶으면 fileOutputstream
//파일을 읽어오겠다는 것은 파일이 하드디스크에 무조건 있어야 함. 하드디스크에 만약 파일이 없다면 새로운 bin 파일에 a.txt 파일을 새로 자동으로 만들게 된다. 그래서 file exception이 발생할 수 없음. 
public class IOMain02 {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("키보드 입력을 하세요. ctrl+z 입력시 종료됩니다");
		
		while(true) {
			try {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
