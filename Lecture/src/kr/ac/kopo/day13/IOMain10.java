package kr.ac.kopo.day13;


import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
public class IOMain10 {
//네이버 파일을 가지고 오고 싶은데,c가 -1 이면 멈추고, 아니면 char c 
//byte stream을 한글로 바꿔주려면 inputstreamReader를 써준다. 
	




		public static void main(String[] args) {
			
			try {
				URL urlObj = new URL("https://www.naver.com");
				
				FileWriter fw = new FileWriter("iotest/naver.html");
				PrintWriter pw = new PrintWriter(fw);
				
				InputStream is = urlObj.openStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				while(true) {
					int c = isr.read();
					if(c == -1) break;
					System.out.print((char)c);
					pw.print((char)c);
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
}
		
	

