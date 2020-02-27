package java191126;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {

		//��ü ����
		Vector<Integer> v = new Vector<Integer>();
		
		//��� ����
		v.add(new Integer(5));
		v.add(new Integer(10));
		v.add(new Integer(-5));
		
		v.add(20); 			//�ڵ� �ڽ� new Integer(20)
		
		v.add(null);
		
		v.add(2, 100);
		System.out.println(v);
		
		//��� ������ : get(index), elementAt(index)
		int i = v.get(1);		//�ڵ� ��ڽ�
		System.out.println(i);
		int ii = v.elementAt(1);		//�� �ڸ��� �ִ� ��Ҹ� �ҷ���
		System.out.println(ii);
		
		//ũ��� �뷮
		int size = v.size();
		System.out.println(size);
		int cap = v.capacity();
		System.out.println(cap);			//������� ũ�� �˷���
		
		//��һ���	:	remove(index), remove(���)
		v.remove(3);
		System.out.println(v);
		
		Integer n = new Integer(100);
		v.remove(n);
		System.out.println(v);
		
		//��ü����
		//v.clear();
		v.removeAllElements();
		System.out.println(v);
		System.out.println(v.size());
		
		
	}

}
