package java191128;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileOutEx02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		
		
		// 작성할 문자열 만들기
		String str = "파일 생성시간\n\n" + date + "\n\n";
		
		System.out.println("파일 이름 입력하세요 >> ");
		String file = sc.nextLine();									// c:\\Temp\\fos.txt
		System.out.println("저장할 문자열 입력하세요 >> ");
		str += sc.nextLine();
		
		// 작성할 문자열 byte 배열로 변환 (바이트 스트림이라 바이트로 필요)
		byte [] b = str.getBytes();						//문자열을 바이트로 리턴
		// 객체 선언
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			fos.write(b);
			//fos.close();									//예외 발생시 catch 로 넘어가 close 가 되지 않는다.
						
		}catch(Exception e) {
			e.printStackTrace(); return;
		}finally{
			// 만약에 fos 스트림이 만들어졌다면 닫아주기
			if(fos != null)try{fos.close();}catch(Exception e){e.printStackTrace();}
			if(sc != null)try{sc.close();}catch(Exception e){e.printStackTrace();}
		}
	
	}

}
