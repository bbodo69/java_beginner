package java191128;

import java.io.File;
import java.io.IOException;

public class FileEx01 {
	public static void main(String[] args) {

		// 경로를 적을때 역슬래쉬 두개 (이스케이프 문자로 인식하지 않기 위해) 	
		// System.out.println("c:||n||temp||test.txt");

		// 파일 크기
		File f = new File("C:\\Windows\\system.ini");
		long size = f.length();
		
		// 파일 이름
		String fileName = f.getName();
		
		// 파일 경로
		String filePath = f.getPath();
		
		// 상위 폴더
		String parent = f.getParent();
		System.out.println(parent);
		// 파일 타입 판별
		if(f.isFile()) 
			System.out.println(f.getAbsolutePath()+"는 파일입니다.");
		else if(f.isDirectory()) 
			System.out.println(f.getAbsolutePath()+"는 디렉토리입니다.");
		
		System.out.println("숨김 속성 = " + f.isHidden());
		System.out.println("읽기 속성 = " + f.canRead());
		System.out.println("쓰기 속성 = " + f.canWrite());
		java.util.Date day = new java.util.Date(f.lastModified());
//		Date day = new Date(f.lastModified());
		System.out.println("마지막 수정 = "+ day);
		
		// 파일 리스트 얻기
		File f2 = new File("C:\\Windows\\Temp");
		File[] subFiles = f2.listFiles();
		for(int i = 0 ; i < subFiles.length; i++ ) {
			System.out.println(subFiles[i].getName());
			System.out.println("파일크기 : " + subFiles[i].length() );
		}
		
		File f3 = new File("C:\\kor.txt");
		try {
			f3.createNewFile();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// API 문서에서 creatNewFile() 메서드 들어가 확인하면
		// throws IOException 기술되어있다. -> 이 메서드 사용시 예외처리 강제.
		
		
		
		
	}

}
