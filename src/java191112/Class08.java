package java191112;

import java.util.Scanner;

public class Class08 {
	
	static int money = 20000;
	static int total = 0;

////////////////////////////////////////////////////////////////////	
	
	static void menu1() {
		total = total + 2500;
		if((money-total)<=0){
			total = total - 2500;
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	static void menu2() {
		total = total + 3000;
		if((money-total)<=0){
			total = total - 3000;
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	static void menu3() {
		total = total + 3500;
		if((money-total)<=0){
			total = total - 3500;
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	static void menu4() {
		total = total + 4000;
		if((money-total)<=0){
			total = total - 4000;
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	static void menu5() {
		total = total + 6000;
		if((money-total)<=0){
			total = total - 6000;
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	
	/*	����3. �ֹ����α׷�

	*** �۷ι� ī�� ***
	1. �Ƹ޸�ī��	: 2500��
	2. ī���		: 3000��
	3. īǪġ��		: 3500��
	4. ī��Ḷ����	: 4000��
	5. ������ġ		: 6000��
	6. ����			

	1�ܰ�:
	�޴��� ����ϰ�, ����ڰ� ���ϴ� ��ŭ �ֹ��� �ް�, ���Ḧ �����ϸ�, �ֹ� �����ϰ�
	�ֹ��� �� �ݾ� ����ϰ� ���α׷� ����ǰ� ������.
	
	2�ܰ�:
	int money = 20000;
	�ֹ��� �������� �ֹ��ݾ� ����.
	���� �����ϸ� �ֹ� ���ϰ� �ϰ�, �Ѿ� ��½� �ܾ� �� ���.
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("=========================");
		String a = "1. �Ƹ޸�ī��	: 2500��";
		String b = "2. ī���	: 3000��";
		String c = "3. īǪġ��	: 3500��";
		String d = "4. ī��Ḷ����	: 4000��";
		String e = "5. ������ġ	: 6000��";
		String f = "6. ����		";
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);
		System.out.println("=========================");
		
	
		

		while(true)
		{
			int i = sc.nextInt();

			if(i == 6){
			System.out.println("�ֹ� �� �ݾ��� "+total+"�� �Դϴ�.");
			break;

			}else if(i == 1){
				total = total + 2500;
				if((money-total)<=0){
					total = total - 2500;
					System.out.println("�ܾ��� �����մϴ�.");
				}
			}else if(i == 2){
				total = total + 3000;
				if((money-total)<=0){
					total = total - 3000;
					System.out.println("�ܾ��� �����մϴ�.");
				}
			}else if(i == 3){
				total = total + 3500;
				if((money-total)<=0){
					total = total - 3500;
					System.out.println("�ܾ��� �����մϴ�.");
				}
			}else if(i == 4){
				total = total + 4000;
				if((money-total)<=0){
					total = total - 4000;
					System.out.println("�ܾ��� �����մϴ�.");
				}
			}else if(i == 5){
				total = total + 6000;
				if((money-total)<=0){
					total = total - 6000;
					System.out.println("�ܾ��� �����մϴ�.");
				}
			}
			else{System.out.println("�� �� �Է��߽��ϴ�.");
			}
			System.out.println("���� �ݾ���" + (money-total) + "�� �Դϴ�.");
		}
		
	}

}
