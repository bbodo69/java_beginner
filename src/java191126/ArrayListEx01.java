package java191126;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {

		//��ü ����
		ArrayList<String> a = new ArrayList<String>();
		
		//��� ����
		a.add("hello");
		a.add("java");
		a.add(null);
		a.size();

		a.add(2, "hahaha");
	//	a.add(10, "super");		//������� ����� �ȵ�.
		System.out.println(a);
		
		//��� �˾Ƴ���/������
		String str = a.get(2);
		System.out.println(str);
		
		//��� ���� �˾Ƴ���
		int size = a.size();
		System.out.println(size);
		
		//��� ����
		a.remove(1);
		System.out.println(a);
		
		//��� ����
		String s = new String("hi");
		a.add(s);
		
		//���� ��ü ����
		a.remove(s);
		
		//��ü ����
		a.clear();
		System.out.println(a);
	}

}
