package java191129;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyTestEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src\\java191129\\MyTestEx02.java");
			fos = new FileOutputStream("MyTestFast3.txt");
			
			int readData = -1;
			byte [] buffer = new byte [512];
			while((readData = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, (int)fis.read(buffer));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);

	}

}
