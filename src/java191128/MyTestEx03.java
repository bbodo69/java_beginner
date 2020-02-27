package java191128;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyTestEx03 {	
	public static void main(String[] args) {
		
		byte [] b = new byte[7];
		
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\text.txt");
			int n = 0;
			int c;
			while((c = fin.read()) !=-1) {
				b[n] = (byte)c;
				n++;
			}
			for(int i = 0 ; i < b.length ; i++) {
				System.out.println(b[i]+"  ");
			}
		if(fin != null) fin.close();}	
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
