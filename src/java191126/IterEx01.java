package java191126;

import java.util.Iterator;
import java.util.Vector;

public class IterEx01 {

	public static void main(String[] args) {
	
		Vector<Integer> v = new Vector<Integer>();
		
		// 백터의 iterator() 매서드를 호출하여,
		// v의 각 요소를 순차적으로 검색할 수 있는
		// Iterator객체(반복자)를 얻는다.
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {		// it가 다음 가르킬 요소가 있는지 확인하여
											// 백터의 끝까지 반복
			int n = it.next();			 // it가 가르키는 요소 리턴
			//....
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
