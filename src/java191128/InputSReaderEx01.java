package java191128;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputSReaderEx01 {
	public static void main(String[] args) {

		// ����Ʈ��Ʈ�� -> ���� ��Ʈ��
		// �ؽ�Ʈ ������ �б� ���� ����Ʈ ���� �Է� ��Ʈ��
		FileInputStream fin = null;
		InputStreamReader in = null;
		
		try {
			fin = new FileInputStream("c:\\Temp\\fos.txt");
			in = new InputStreamReader(fin);	//window �⺻ ���ڵ� : MS949
			int c;
			
			System.out.println("encoding : " + in.getEncoding());
			
			while((c = in.read()) != -1) {
				System.out.print((char)c);
				
			}
			
			// -> finally �� �̵���Ű��.
			fin.close();
			in.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
