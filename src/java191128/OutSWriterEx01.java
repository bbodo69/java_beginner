package java191128;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Scanner;

public class OutSWriterEx01 {

	public static void main(String[] args) {

		// ���Ͽ� ������ ���ڿ� �غ�
		Scanner sc= new Scanner(System.in);
		Date date = new Date();
		
		String str = "���� ���� �ð� " + date;
		
		System.out.println("�Է� >>>>");
		str += sc.nextLine();

		// ��Ʈ�� ����
		FileOutputStream fos = null;
		OutputStreamWriter out = null;
		
		try {
			fos = new FileOutputStream("c:\\Temp\\outSteWr.txt");
			out = new OutputStreamWriter(fos, "UTF-8");
			
			out.write(str);
			
			out.flush();			//��Ʈ�� ����
			
			fos.close();
			out.close();
			sc.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
