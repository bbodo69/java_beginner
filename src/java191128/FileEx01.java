package java191128;

import java.io.File;
import java.io.IOException;

public class FileEx01 {
	public static void main(String[] args) {

		// ��θ� ������ �������� �ΰ� (�̽������� ���ڷ� �ν����� �ʱ� ����) 	
		// System.out.println("c:||n||temp||test.txt");

		// ���� ũ��
		File f = new File("C:\\Windows\\system.ini");
		long size = f.length();
		
		// ���� �̸�
		String fileName = f.getName();
		
		// ���� ���
		String filePath = f.getPath();
		
		// ���� ����
		String parent = f.getParent();
		System.out.println(parent);
		// ���� Ÿ�� �Ǻ�
		if(f.isFile()) 
			System.out.println(f.getAbsolutePath()+"�� �����Դϴ�.");
		else if(f.isDirectory()) 
			System.out.println(f.getAbsolutePath()+"�� ���丮�Դϴ�.");
		
		System.out.println("���� �Ӽ� = " + f.isHidden());
		System.out.println("�б� �Ӽ� = " + f.canRead());
		System.out.println("���� �Ӽ� = " + f.canWrite());
		java.util.Date day = new java.util.Date(f.lastModified());
//		Date day = new Date(f.lastModified());
		System.out.println("������ ���� = "+ day);
		
		// ���� ����Ʈ ���
		File f2 = new File("C:\\Windows\\Temp");
		File[] subFiles = f2.listFiles();
		for(int i = 0 ; i < subFiles.length; i++ ) {
			System.out.println(subFiles[i].getName());
			System.out.println("����ũ�� : " + subFiles[i].length() );
		}
		
		File f3 = new File("C:\\kor.txt");
		try {
			f3.createNewFile();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// API �������� creatNewFile() �޼��� �� Ȯ���ϸ�
		// throws IOException ����Ǿ��ִ�. -> �� �޼��� ���� ����ó�� ����.
		
		
		
		
	}

}
