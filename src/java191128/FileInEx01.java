package java191128;

import java.io.FileInputStream;

public class FileInEx01 {
	public static void main(String[] args) {
		
		byte [] b = new byte[7];

		try{
			// #1. �Է½�Ʈ�� ��ü ����
			FileInputStream fin = new FileInputStream("c:\\Temp\\text.txt");
			
			// #2. ���� �б�
			// 1. �ѹ���Ʈ�� �б�
			int n = 0;		// �迭�� idex ó�� ����� ����
			int c;				// ���� ���� �ӽ� ���� ����
			while((c = fin.read()) != -1) { //EOF�� ������ -1�� ����, c����.
				// -> ������ ������ �ݺ��ؼ� �б�
				b[n] = (byte)c;
				n++;
			}
			// 2. �ѹ��� �迭 ũ�⸸ŭ �б�
			//fin.read(b);
			
			//byte [] b = {1, 46, 8, 4, 53, -2, 1};
					
			// #3. ȭ�鿡 ����ؼ� Ȯ��
			for(int i = 0 ; i < b.length ; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			
			// #4. ���� �ݱ�
			fin.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
