package Quit;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/*
Vector �÷����� �̿��Ͽ� �������� ����� ���� �����ϴ� ���α׷��� �ۼ��ϼ���.
�������� �Է��ϸ� ���Ϳ� �߰��ϰ� ���� �Էµ� ��� �������� ����� ����Ѵ�.
���� ���� :
	������ �Է� (0 �Է½� ����)>>	5
	5
	���� ��� 5
	������ �Է� (0 �Է½� ����)>>	80
	5 80
	���� ��� 42
	������ �Է� (0 �Է½� ����)>>	53
	5 80 53
	���� ��� 46
	������ �Է� (0 �Է½� ����)>>	22
	5 80 53 22
	���� ��� 40
	������ �Է� (0 �Է½� ����)>>	0
	���α׷� ����!
*/
public class CollectionEx06 {
	public static void main(String[] args) {

		Vector <Integer> v = new Vector <Integer>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>>");
			int num = Integer.parseInt(sc.nextLine());
			if(num == 0 ) {
				break;
			}else {
			v.add(num);
			int total = 0;
			Iterator<Integer> it = v.iterator();
			while(it.hasNext()) {				// it�� ���� ����ų ��Ұ� �ִ��� Ȯ���Ͽ�
														// ������ ������ �ݺ�
				int n = it.next();			 		// it�� ����Ű�� ��� ����
				System.out.println(n+" ");
				total += n;
				}
			System.out.println(total/v.size());
			
//			for(int i = 0 ; i < v.size() ; i++) {
//				System.out.print(v.get(i)+" ");
//			}
			}
		}	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		while(true) {
//			System.out.print("������ �Է� (0 �Է½� ����)>>");
//			
//			int num = Integer.parseInt(sc.nextLine());
//			if(num == 0 ) {
//				break;
//			}else {
//			v.add(num);
//			for(int i = 0 ; i < v.size() ; i++) {
//				System.out.print(v.get(i)+" ");
//			}
//			int total = 0;
//			for(int i = 0 ; i < v.size() ; i++) {
//				total += v.get(i);
//			}System.out.println();
//			System.out.println("���� ��� "+total/v.size());
//		}
//		}sc.close();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		public class IterEx01 {
//
//			public static void main(String[] args) {
//			
//				Vector<Integer> v = new Vector<Integer>();
//				
//				// ������ iterator() �ż��带 ȣ���Ͽ�,
//				// v�� �� ��Ҹ� ���������� �˻��� �� �ִ�
//				// Iterator��ü(�ݺ���)�� ��´�.
//				Iterator<Integer> it = v.iterator();
//				
//				while(it.hasNext()) {		// it�� ���� ����ų ��Ұ� �ִ��� Ȯ���Ͽ�
//													// ������ ������ �ݺ�
//					int n = it.next();			 // it�� ����Ű�� ��� ����
//					//....
//				}
	}
}
