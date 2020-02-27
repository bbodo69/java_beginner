package java191128;

import java.io.File;

public class FileEx02 {
	
	public static void listDirectory(File dir) {
		System.out.println("========="+dir.getPath()+"==========");
		
		File[] subFiles = dir.listFiles();
		
		for(int i = 0 ; i <subFiles.length ; i++) {
			System.out.println(subFiles[i].getName());
			System.out.println("파일크기" + subFiles[i].length());
		}
		
	}

	public static void main(String[] args) {

		// 디렉토리 만들기
		File f1 = new File("c:\\Temp\\java_sample");
		if(!f1.exists()) {
			f1.mkdir();
		}
		
		listDirectory(new File("c:\\Temp"));
		
	}

}
