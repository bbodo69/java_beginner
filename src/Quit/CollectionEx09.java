package Quit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
�̸��� ����(4.5����)�� 5�� �Է¹޾� �ؽ��ɿ� �����ϰ�, ���л� ���� ������ �Է¹޾� ���л� ����� ����ϼ���.
���ؿ���:
	�ڹ����бݰ����ý����Դϴ�.
	�̸��� ���� >> ȣũ���� 3.1
	�̸��� ���� >> �������� 3.6
	�̸��� ���� >> �丣 2.9
	�̸��� ���� >> ����Ǯ 3.7
	�̸��� ���� >> ���̾�� 4.3
	���л� ���� ���� ���� �Է� >> 3.2
	���л� ��� : �������� ����Ǯ ���̾��
*/
class Scholarship{
}
public class CollectionEx09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> h = new HashMap<String, Double>();
			System.out.println("�ڹ����бݰ����ý����Դϴ�.");
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("�̸��� ���� >> ");
			String str = sc.nextLine();
			String name = str.substring(0, str.indexOf(" "));
			String score = str.substring(str.indexOf(" ")+1,str.length());
			double score1 = Double.parseDouble(score);
			h.put(name, score1);
			System.out.println();
		}
		
		System.out.println("���л� ���� ���� ���� �Է� >>");
		double i = Double.parseDouble(sc.nextLine());
		//////////////////////////////////////////////////////////////////////////////////////////		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(h.get(key) > i) {
				System.out.print(key+" ");
			}
			
		}
		//Scholarship sship = new Scholarship("�ڹ����б�");
		//sship.read();
		//sship.select();		
	}
}
