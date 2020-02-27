package java191128;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileOutEx02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		
		
		// �ۼ��� ���ڿ� �����
		String str = "���� �����ð�\n\n" + date + "\n\n";
		
		System.out.println("���� �̸� �Է��ϼ��� >> ");
		String file = sc.nextLine();									// c:\\Temp\\fos.txt
		System.out.println("������ ���ڿ� �Է��ϼ��� >> ");
		str += sc.nextLine();
		
		// �ۼ��� ���ڿ� byte �迭�� ��ȯ (����Ʈ ��Ʈ���̶� ����Ʈ�� �ʿ�)
		byte [] b = str.getBytes();						//���ڿ��� ����Ʈ�� ����
		// ��ü ����
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			fos.write(b);
			//fos.close();									//���� �߻��� catch �� �Ѿ close �� ���� �ʴ´�.
						
		}catch(Exception e) {
			e.printStackTrace(); return;
		}finally{
			// ���࿡ fos ��Ʈ���� ��������ٸ� �ݾ��ֱ�
			if(fos != null)try{fos.close();}catch(Exception e){e.printStackTrace();}
			if(sc != null)try{sc.close();}catch(Exception e){e.printStackTrace();}
		}
	
	}

}
