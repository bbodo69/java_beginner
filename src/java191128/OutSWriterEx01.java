package java191128;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Scanner;

public class OutSWriterEx01 {

	public static void main(String[] args) {

		// 파일에 저장할 문자열 준비
		Scanner sc= new Scanner(System.in);
		Date date = new Date();
		
		String str = "파일 생성 시간 " + date;
		
		System.out.println("입력 >>>>");
		str += sc.nextLine();

		// 스트링 생성
		FileOutputStream fos = null;
		OutputStreamWriter out = null;
		
		try {
			fos = new FileOutputStream("c:\\Temp\\outSteWr.txt");
			out = new OutputStreamWriter(fos, "UTF-8");
			
			out.write(str);
			
			out.flush();			//스트림 비우기
			
			fos.close();
			out.close();
			sc.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
