package Quit;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


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
public class CollectionEx01_1 {
	
	static Scanner sc = new Scanner(System.in);
	public static HashMap<String, Integer> h = new HashMap<String, Integer>();
	
	public static void list() {
			System.out.println("���� ����Ʈ");
		System.out.println(h.entrySet());
	}
	public static void put() {
		System.out.println("�̸��� ���� �Է�");
		h.put(sc.nextLine(), Integer.parseInt(sc.nextLine()));
//		h.put("�質����", 22);
//		h.put("�質����1", 33);
//		h.put("�質����2", 66);
	}
	public static void set() {
		System.out.println("������ �̸��� ���� �Է�");
		h.replace(sc.nextLine(), Integer.parseInt(sc.nextLine()));
		
	}
	public static void remove() {
		System.out.println("������ �̸� �Է�");
		h.remove(sc.nextLine());
	}
	public static void avg() {
		int total = 0;
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();		//Iterator �� 
		while(it.hasNext()) {
			
			String key = it.next();
			int value = h.get(key);
			System.out.println(value);
			 total += value; 
			 System.out.println((float)total/h.size());
		
			
		}
	}
		
	
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("** �ڹ� ���� ���� ���α׷� **\r\n" + 
					"	1. ��ü ��ȸ \r\n" + 
					"	2. ���\r\n" + 
					"	3. ����\r\n" + 
					"	4. ����\r\n" + 
					"	5. ��ü ���\r\n" + 
					"	6. ���α׷� ����");
			int i = Integer.parseInt(sc.nextLine());
			
			if(i == 1) {
				CollectionEx01_1.list();
				
			}
			else if(i == 2) {
				CollectionEx01_1.put();
				
			}
			else if(i == 3) {
				CollectionEx01_1.set();
				
			}
			else if(i == 4) {
				CollectionEx01_1.remove();
			}
			else if(Integer.parseInt(sc.nextLine()) == 5) {
				CollectionEx01_1.avg();
			}
			else if(i == 6) {
				
				break;
			}
		}
		  			 
	}
}
