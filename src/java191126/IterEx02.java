package java191126;

import java.util.Iterator;
import java.util.Vector;

public class IterEx02 {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(2, 40);
		
		Iterator<Integer> it =v.iterator();		//Iterator, �ݺ���, �ݺ�.
		while(it.hasNext()) {						//������ ���� ���� ��� true.
			int n = it.next();
			System.out.println(n);
		}
		
		//��� ������ ���ϱ�
		int sum = 0 ;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println(sum);
		
		int sum1 = 0;
	
		for(int i = 0 ; i < v.size() ; i++) {
			v.get(i);
			sum1 = sum1 + v.get(i);			
		}
		System.out.println(sum1);
		
		
		
		
		
		
		

	}

}
