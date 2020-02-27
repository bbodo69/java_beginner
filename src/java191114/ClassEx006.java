package java191114;

import java.util.Scanner;
/*
�Ϸ������� ǥ���ϴ� Ŭ���� Day�� ������ ����. 
�Ѵ��� ������ ǥ���ϴ� MonthSchedule Ŭ������ �ۼ��ϼ���.
MonthSchedule Ŭ�������� Day ��ü �迭�� ������ ����,�޼��带 �ۼ��ϰ�
���� ����ó�� �Է�, ����, ������ ���� 3���� ����� �ۼ��϶�. 
 -> ������, input(), view(), finish(), run() �޼ҵ� �����. 
 
#���࿹��#
�̹��� ������ ���� ���α׷�. 
����(�Է�:1, ����:2, ������:3) >> 1
��¥(1~30)? 1
����? �ڹٰ���

����(�Է�:1, ����:2, ������:3) >> 2
��¥(1~30)? 1
1���� �� ���� �ڹٰ����Դϴ�.

����(�Է�:1, ����:2, ������:3) >> 3
���α׷� ����.
*/

class Day { // �״�γ� �ΰ� ���� Ǫ����
	
	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�
	void set(String work) { this.work = work; }					//private �� work ������ �ٲ��ֱ� ���� �޼ҵ�
	public String get() { return work; }							//work ���� ��� �޼ҵ�
	public void show() {												
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

class MonthSchedule {
	
	Scanner sc = new Scanner(System.in);
	
	Day [] day;

	void run() {

		day = new Day [30];
		for(int i = 0 ; i < 30 ; i++) {
			day[i] = new Day();
		}
		
		
		while(true) {
			System.out.println("����(�Է�:1, ����:2, ������:3");
			
			int num4 = Integer.parseInt(sc.nextLine());
			if(num4 == 1) {
				System.out.println("��¥(1~30)?");
				int num1 = Integer.parseInt(sc.nextLine());		
				System.out.println("����?");
				day[num1-1].set(sc.nextLine());
			}
					
			if(num4 == 2) {
				
				System.out.println("��¥(1~30)?");
				int num5 = Integer.parseInt(sc.nextLine());
				System.out.println(day[num5-1].get());
				}			
			if(num4 == 3) {
				System.out.println("���α׷� ����");
				break;
				}
			if(num4 != 1 && num4 != 2 && num4 != 3) {
				System.out.println("�� �� �Է�");
			}
			
			}
	}
	 	
		
}

public class ClassEx006 {
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(); // 4������ �� ��
		april.run();
		
		
	}
}
