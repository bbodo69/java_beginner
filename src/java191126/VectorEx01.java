package java191126;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {

		//객체 생성
		Vector<Integer> v = new Vector<Integer>();
		
		//요소 삽입
		v.add(new Integer(5));
		v.add(new Integer(10));
		v.add(new Integer(-5));
		
		v.add(20); 			//자동 박싱 new Integer(20)
		
		v.add(null);
		
		v.add(2, 100);
		System.out.println(v);
		
		//요소 꺼내기 : get(index), elementAt(index)
		int i = v.get(1);		//자동 언박싱
		System.out.println(i);
		int ii = v.elementAt(1);		//그 자리에 있는 요소를 불러냄
		System.out.println(ii);
		
		//크기와 용량
		int size = v.size();
		System.out.println(size);
		int cap = v.capacity();
		System.out.println(cap);			//저장공간 크기 알려줌
		
		//요소삭제	:	remove(index), remove(요소)
		v.remove(3);
		System.out.println(v);
		
		Integer n = new Integer(100);
		v.remove(n);
		System.out.println(v);
		
		//전체삭제
		//v.clear();
		v.removeAllElements();
		System.out.println(v);
		System.out.println(v.size());
		
		
	}

}
