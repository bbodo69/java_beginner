package java191128;

import java.io.FileOutputStream;

public class MyTestEx01 {
	public static void main(String[] args) {

		byte [] b = {1,2,3,4,5,6,7,8,10};
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\MyTestEx01.txt");
			for(int i = 0 ; i < b.length ; i++) {
				fout.write(b[i]);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
