package java191128;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutEx01 {
	public static void main(String[] args) {

		byte[] b = {1,46,8,4,53,-2,1}; //-128 ~ 127
		
 
		try {
			// #1. ���� ��� ��Ʈ�� ���� :
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\text1.txt");
			
			// #2. ���� ����
			for(int i = 0 ; i < b.length ; i++) {
				fout.write(b[i]);
			}
			// #3. ��Ʈ�� �ݱ�
			fout.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
