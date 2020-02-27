package java191128;

import java.io.File;

public class FileEx02 {
	
	public static void listDirectory(File dir) {
		System.out.println("========="+dir.getPath()+"==========");
		
		File[] subFiles = dir.listFiles();
		
		for(int i = 0 ; i <subFiles.length ; i++) {
			System.out.println(subFiles[i].getName());
			System.out.println("����ũ��" + subFiles[i].length());
		}
		
	}

	public static void main(String[] args) {

		// ���丮 �����
		File f1 = new File("c:\\Temp\\java_sample");
		if(!f1.exists()) {
			f1.mkdir();
		}
		
		listDirectory(new File("c:\\Temp"));
		
	}

}
