package java191128;

import java.io.FileInputStream;
import java.util.Scanner;

public class FileInputEx02 {

	public static void main(String[] args) {
		// ���ϰ�� �Է¹޾� �ش� ���� ���� �ֿܼ� ����ϱ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�о�� ������ �Է��ϼ���.");
		String file = sc.nextLine();
		System.out.println(file + " ������ ����=====");
		
		int i = 0;
		try {
			//�б⸦ ���� ��Ʈ����ü ����
			FileInputStream fis = new FileInputStream(file);
			//���� �ѹ���Ʈ�� ������ ������ �б�
			while((i = fis.read()) != -1 ) {
				System.out.print((char)i);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
