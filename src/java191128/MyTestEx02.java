package java191128;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Scanner;

public class MyTestEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		
		
		System.out.println("저장할 위치와 파일 이름 >>> ");
		String file = sc.nextLine();
		
		System.out.println("저장할 문자열 입력. byte 형식으로 >>> ");
		String str = sc.nextLine();
		
		byte [] b = str.getBytes();
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(file);
			fout.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fout != null)try{fout.close();}catch(Exception e) {e.printStackTrace();}
			if(sc != null)sc.close();
		}
		
		
		
	}

}
