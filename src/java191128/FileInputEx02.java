package java191128;

import java.io.FileInputStream;
import java.util.Scanner;

public class FileInputEx02 {

	public static void main(String[] args) {
		// 파일경로 입력받아 해당 파일 내용 콘솔에 출력하기.
		Scanner sc = new Scanner(System.in);
		System.out.println("읽어올 파일을 입력하세요.");
		String file = sc.nextLine();
		System.out.println(file + " 문서의 내용=====");
		
		int i = 0;
		try {
			//읽기를 위한 스트림객체 생성
			FileInputStream fis = new FileInputStream(file);
			//파일 한바이트씩 파일의 끝까지 읽기
			while((i = fis.read()) != -1 ) {
				System.out.print((char)i);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
