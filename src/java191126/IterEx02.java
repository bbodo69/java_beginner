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
		
		Iterator<Integer> it =v.iterator();		//Iterator, 반복자, 반복.
		while(it.hasNext()) {						//다음의 값이 있을 경우 true.
			int n = it.next();
			System.out.println(n);
		}
		
		//모든 정수를 더하기
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
