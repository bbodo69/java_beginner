package java191114;

import java.util.Scanner;

class Info{
	
	private String name;
	private String type;
	private int number;
	
	void setName(String name) {this.name = name;}
	void setType(String type) {this.type = type;}
	void setNumber(int number) {this.number = number;}
	String getName() {return name;}
	String getType() {return type;}
	int getNumber () {return number;}
	
	Info(String type, String name, int number){					//������
		this.name = name;
		this.type = type;
		this.number = number;
	}
	
	Info(){
		
	}
	
}

class Reserve{
	Scanner sc = new Scanner(System.in);
	Info [] s; 
	Info [] a;
	Info [] b;
	
			
	void menu() {
		
	}
	
	void run() {
		
		s = new Info[10];
		a = new Info[10];
		b = new Info[10];
		
		Info s = new Info();
		Info a = new Info();
		Info b = new Info();
		
	}
	
	void seatType() {
		int numType = Integer.parseInt(sc.nextLine());
		System.out.println("�¼�Ÿ��, �������̸�, �¼���ȣ �Է�");
		if(numType == 1) {			
			String seatType = sc.nextLine();
			String seatName = sc.nextLine();
			int seatNumber = Integer.parseInt(sc.nextLine());
			s[i] = 
			
		}
		if(numType == 2) {			
			String seatType = sc.nextLine();
			String seatName = sc.nextLine();
			int seatNumber = Integer.parseInt(sc.nextLine());			
			a[seatNumber-1] = new Info(seatType,seatName,seatNumber);					
		}
		if(numType == 3) {			
			String seatType = sc.nextLine();
			String seatName = sc.nextLine();
			int seatNumber = Integer.parseInt(sc.nextLine());
			b[seatNumber-1] = new Info(seatType,seatName,seatNumber);					
		}
		if(numType != 1 && numType != 2 && numType != 3 ) {
			System.out.println("�߸��Է�");
		}
	}
		
	
	
	void input() {
		Reserve r = new Reserve();
		while(true) {
			System.out.println("����:1, ��ȸ:2, ���:3, ������:4");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				System.out.println("�¼����� S(1), A(2), B(3)");			
				r.seatType();
			}
			if (menu == 2) {
				
			}
			if (menu == 3) {
				
			}
			if (menu == 4) {
				break;
			}
			else {
				return;				
			}
		}
	}
	
}
/*
�ܼ�Ʈ ���� ���α׷�. 
- ������ �Ϸ翡 �ѹ�
- �¼��� S��, A��, B������ ������, ���� 10���� �¼��� �ִ�. 
- ���� �ý����� �޴��� "����", "��ȸ", "���", "������"�� �ִ�. 
- ������ ���ڸ��� �����ϰ�, �¼�Ÿ��, �������̸�, �¼���ȣ�� �Է¹޾� �����Ѵ�.
- ��ȸ�� ��� �¼��� ����Ѵ�.
- ��Ҵ� �������� �̸��� �Է¹޾� ����Ѵ�.
- ���� �̸�, ���� ��ȣ, ���� �޴�, �߸��� ��ҵ ���ؼ�
  ���� �޼����� ����ϰ� ����ڰ� �ٽ� �õ��ϵ��� �Ѵ�.
  
# ���࿹�� #
�ڹ��ܼ�ƮȦ ����ý����Դϴ�.
����:1, ��ȸ:2, ���:3, ������:4 >> 1
�¼����� S(1), A(2), B(3) >> 1
S >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ 
�̸� >> ��ī��
��ȣ >> 1
<<����Ϸ�>>

����:1, ��ȸ:2, ���:3, ������:4 >> 1
�¼����� S(1), A(2), B(3) >> 2
A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
�̸� >> ������
��ȣ >> 5
<<����Ϸ�>>

����:1, ��ȸ:2, ���:3, ������:4 >> 2
S >> ��ī�� ___ ___ ___ ___ ___ ___ ___ ___ ___
A >> ___ ___ ___ ___ ������ ___ ___ ___ ___ ___
B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
<<��ȸ�Ϸ�>>

����:1, ��ȸ:2, ���:3, ������:4 >> 3
�¼����� S(1), A(2), B(3) >> 2
A >> ___ ___ ___ ___ ������ ___ ___ ___ ___ ___
�̸� >> ������
<<��ҿϷ�>>

����:1, ��ȸ:2, ���:3, ������:4 >> 2
S >> ��ī�� ___ ___ ___ ___ ___ ___ ___ ___ ___
A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
<<��ȸ�Ϸ�>>

����:1, ��ȸ:2, ���:3, ������:4 >> 4
<<���α׷� ����>>
*/

public class ClassEx007 {
	public static void main(String[] args) {
			Reserve reserve = new Reserve();
			reserve.run();
			reserve.input();
			
	}
}
