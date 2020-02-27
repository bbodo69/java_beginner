package java191128;

import java.io.FileInputStream;

public class FileInEx01 {
	public static void main(String[] args) {
		
		byte [] b = new byte[7];

		try{
			// #1. 입력스트림 객체 생성
			FileInputStream fin = new FileInputStream("c:\\Temp\\text.txt");
			
			// #2. 파일 읽기
			// 1. 한바이트씩 읽기
			int n = 0;		// 배열의 idex 처럼 사용할 변수
			int c;				// 읽은 파일 임시 저장 변수
			while((c = fin.read()) != -1) { //EOF을 만나면 -1을 리턴, c저장.
				// -> 파일의 끝까지 반복해서 읽기
				b[n] = (byte)c;
				n++;
			}
			// 2. 한번에 배열 크기만큼 읽기
			//fin.read(b);
			
			//byte [] b = {1, 46, 8, 4, 53, -2, 1};
					
			// #3. 화면에 출력해서 확인
			for(int i = 0 ; i < b.length ; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			
			// #4. 파일 닫기
			fin.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
