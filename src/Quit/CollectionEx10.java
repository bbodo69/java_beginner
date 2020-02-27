package Quit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
����� ���� ���߱� ������ ����� ������. (�ڵ� �ϳ��� ���� ����)
1) �����̸�(country)�� ����(capital)�� ������ NationŬ������ �ۼ��ϰ�,
	ArrayList<Nation> �÷����� �̿��Ͽ� �Ʒ� ���� ���ÿ� ���� �۵��ǵ��� ���α׷��� �ۼ��ϼ���.
���࿹��:
	** ���� ���߱� ������ �����մϴ� **
	�Է�:1, ����:2, ����:3 >> 1 (����ڰ� �Է�)
	���� 8���� ����� ������ �ԷµǾ� �ֽ��ϴ�.
	����� ���� �Է�9>> �ѱ� ����
	����� ���� �Է�10>> �׸��� ���׳�
	�׸����� �̹� �ֽ��ϴ�!!
	����� ���� �Է�10>> ȣ�� �õ��
	����� ���� �Է�11>> ��Ż���� �θ�
	����� ���� �Է�10>> �׸�
	�Է�:1, ����:2, ����:3 >> 2
	ȣ���� ������? �õ��
	����!!
	������ ������? �Ͼ��
	�ƴմϴ�!!
	�߽����� ������? �Ͼ��
	�ƴմϴ�!!
	��Ż������ ������? �θ�
	����!!
	�ѱ��� ������? ����
	����!!
	������ ������? �׸�
	�Է�:1, ����:2, ����:3 >> 3
	������ �����մϴ�.
*/
class CapitalGame{

	String country;
	String capital;
	Scanner sc = new Scanner(System.in);
	
	void run() {
		ArrayList<String> nation= new ArrayList<String>();
		nation.add("����Ʈ ī�̷�");
		nation.add("����� ���Ʈ");
		nation.add("�׺�� ����");
		nation.add("���̺����� ��κ��");
		nation.add("�Ҹ����� �𰡵�ÿ�");
		nation.add("���ϴ� ŰĮ��");
		nation.add("���װ� ��ī��");
		nation.add("�ѱ� ����");
		nation.add("�׸��� ���׳�");
		nation.add("ĳ���� ��Ÿ��");
		nation.add("�Ϻ� ����");
		nation.add("������ �ĸ�");
		nation.add("���� ����");
		nation.add("������ ���帮��");
		nation.add("��Ż���� �θ�");
		nation.add("���� ������");
		nation.add("ȣ�� ĵ����");
		nation.add("�̱� ������");
		
		
		while(true) {
		System.out.println("�Է�:1, ����:2, ����:3 >> ");
		System.out.println("����"+nation.size()+"���� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		int i = Integer.parseInt(sc.nextLine());
		if(i == 1) {
			while(true) {
				System.out.println("����� ���� �Է�"+(nation.size()+1));
				String str1 = sc.nextLine();
				if(str1.equals("�׸�")) {
					break;
				}
				else if(nation.contains(str1)==true) {
					System.out.println("�� �̹� �ֽ��ϴ�!!");
				}else{
					nation.add(str1);
//					Iterator <String> it = nation.iterator();
//					while(it.hasNext()) {
//						String str = it.next();
//					}
				}						
			}
		}
		else if(i == 2) {
			while(true) {
							
				int idx = (int)(Math.random()*nation.size()+1);
				String country = nation.get(idx).substring(0,nation.get(idx).indexOf(" "));
				String city = nation.get(idx).substring(nation.get(idx).indexOf(" ")+1, nation.get(idx).length());
				
				System.out.print(country+"�� ������? ");
				String str = sc.nextLine();
				if(str.equals("�׸�")) {
					break;
				}else if(city.equals(str)) {
					System.out.println("����!!");
				}else{
					System.out.println("�ƴմϴ�!! ���� : "+city);
				}
			}
		}
		else if(i == 3) {
			break;
		}
		}
	}
	}

	
public  class CollectionEx10 {
	public static void main(String[] args) {
	
		CapitalGame game = new CapitalGame();
		game.run();
		
	}
}



