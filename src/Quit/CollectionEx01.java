package Quit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

//HashMap�� �̿��Ͽ� �л� �̸��� �ڹ� ������ ����ϴ� ���� ���α׷��� �ۼ��ϼ���. 
// �Ʒ� ���α׷� �޴����� �� ��ȣ�� ���� �����ϰ�, 
// 6���� �Է¹����� ���α׷� ����. 
/*
 	** �ڹ� ���� ���� ���α׷� **
	1. ��ü ��ȸ 
	2. ���
	3. ����
	4. ����
	5. ��ü ���
	6. ���α׷� ����
*/
 class Student5{
	static HashMap<String, Integer> h = new HashMap<String, Integer>();
	static Scanner sc = new Scanner(System.in);
	
	static void List() {
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name+"  "+ h.get(name));
		}	
	}	
	static void put() {
		System.out.println("��� �� �̸�, ���� >> ");
		h.put(sc.nextLine(), Integer.parseInt(sc.nextLine()));
		
	}
	static void set() {
		System.out.println("���� �� �̸�, ���� >> ");
		h.put(sc.nextLine(), Integer.parseInt(sc.nextLine()));
	}
	
	static void remove() {
		System.out.println("���� �� �̸� >> ");
		h.remove(sc.nextLine());
	}
	static void avg() {
		Iterator <String> it = h.keySet().iterator();
		double total = 0;
		while(it.hasNext()) {
			String name = it.next();
			total += h.get(name);
		}System.out.println("��� "+total/h.size());
	}
}

public class CollectionEx01 {
		
	public static void main(String[] args) {
		Student5 st = new Student5();		 
				
		while(true) {
			System.out.println("** �ڹ� ���� ���� ���α׷� **\r\n" + 
					"	1. ��ü ��ȸ \r\n" + 
					"	2. ���\r\n" + 
					"	3. ����\r\n" + 
					"	4. ����\r\n" + 
					"	5. ��ü ���\r\n" + 
					"	6. ���α׷� ����");
			int i = Integer.parseInt(Student5.sc.nextLine());
			if( i == 1) {				
				Student5.List();
			}
			if( i == 2) {
				Student5.put();
			}
			if( i == 3) {
				Student5.set();
			}
			if( i == 4) {
				Student5.remove();
			}
			if( i == 5) {
				Student5.avg();
			}
			if( i == 6) {
				break;
			}
		}
		
	}
}
