package Quit;

import java.util.HashMap;
import java.util.Scanner;

/*
"�׸�"�� �Էµ� ������ �����̸��� �α��� �Է¹޾� �����ϰ�, 
�ٽ� �����̸��� �Է¹޾� �α��� ����ϴ� ���α׷��� �ۼ��ϼ���. 
�Ʒ� �ؽ����� �̿��ϼ���.
HashMap<String, Integer> nations = new HashMap<String, Integer>();
���࿹�� :
	���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)
	���� �̸�, �α� >>  Korea 5000
	���� �̸�, �α� >>  USA 1000000
	���� �̸�, �α� >>  Swiss 2000
	���� �̸�, �α� >>  France 3000
	���� �̸�, �α� >>  �׸�
	�α� �˻� >> France
	France�� �α��� 3000
	�α� �˻� >> ������
	������ ����� �����ϴ�.
	�α� �˻� >> �׸�
	���α׷� ����!
*/
public class CollectionEx05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, String> nations = new HashMap<String, String>();
		
		while(true) {
			System.out.println("1. ����, �α� ���   2. �α� �˻�   3.���α׷� ����");
			int i = Integer.parseInt(sc.nextLine());
			if(i == 1) {
				while(true) {
					System.out.println("����, �α� �Է�");
					String str = sc.nextLine();
					int idx = str.indexOf(" ");		//�����̽� �� �ε��� ��ȣ�� �˷���
					if(str.equals("�׸�")) {
						break;				
					}else {
					String name = str.substring(0, idx);
					String population = str.substring(idx+1, str.length());
					nations.put(name, population);
				}
			}
		}else if(i == 2) {
			while(true) {
				System.out.println("�����̸� �Է�");
				String str = sc.nextLine();
				if(str.equals("�׸�")) {
					break;
				}else {
					System.out.println(nations.get(str));
				}
			}
		}else if(i==3) {
			System.out.println("���α׷� ����");
			break;
		}
		
	}
	}
}


