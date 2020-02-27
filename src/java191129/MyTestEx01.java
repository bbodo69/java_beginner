package java191129;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyTestEx01 {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src\\java191129\\MyTestEx01.java");
			fos = new FileOutputStream("MyTestExSample6.txt");
			
			int readData = -1 ;
			
			while((readData = fis.read()) != -1) {
				fos.write(readData);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}

}
