package java191128;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputSReaderEx01 {
	public static void main(String[] args) {

		// 바이트스트림 -> 문자 스트림
		// 텍스트 파일을 읽기 위한 바이트 파일 입력 스트림
		FileInputStream fin = null;
		InputStreamReader in = null;
		
		try {
			fin = new FileInputStream("c:\\Temp\\fos.txt");
			in = new InputStreamReader(fin);	//window 기본 인코딩 : MS949
			int c;
			
			System.out.println("encoding : " + in.getEncoding());
			
			while((c = in.read()) != -1) {
				System.out.print((char)c);
				
			}
			
			// -> finally 로 이동시키자.
			fin.close();
			in.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
