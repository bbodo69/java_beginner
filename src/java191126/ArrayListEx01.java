package java191126;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {

		//객체 생성
		ArrayList<String> a = new ArrayList<String>();
		
		//요소 삽입
		a.add("hello");
		a.add("java");
		a.add(null);
		a.size();

		a.add(2, "hahaha");
	//	a.add(10, "super");		//빈공간이 생기면 안됨.
		System.out.println(a);
		
		//요소 알아내기/꺼내기
		String str = a.get(2);
		System.out.println(str);
		
		//요소 개수 알아내기
		int size = a.size();
		System.out.println(size);
		
		//요소 삭제
		a.remove(1);
		System.out.println(a);
		
		//요소 삽입
		String s = new String("hi");
		a.add(s);
		
		//동일 객체 삭제
		a.remove(s);
		
		//전체 삭제
		a.clear();
		System.out.println(a);
	}

}
