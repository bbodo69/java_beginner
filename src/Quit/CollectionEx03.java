package Quit;

import java.util.Vector;
import java.util.Collections;
import java.util.Scanner;

/*
Scanner Ŭ������ -1�� �Էµɶ����� ���� ������ �Է¹޾� ���Ϳ� �����ϰ�,
���͸� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���. 
���࿹��:
	����>> 10 6 22 6 88 77 -1
	���� ū ���� 88
*/
public class CollectionEx03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		while(true) {
			int i = sc.nextInt();
			v.add(i);
			if(i==-1) {
				break;
			}
		}
		Object obj = Collections.max(v);
		System.out.println(obj);
		
		
		
	}
}
