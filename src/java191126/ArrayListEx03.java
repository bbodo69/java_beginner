package java191126;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list1 = new ArrayList(5);
		
		list1.add(5);
		list1.add(1);
		list1.add(4);
		list1.add(11);
		list1.add(20);
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println(list1.get(4));
		
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list2);
		
		Collections.sort(list1);				//오름차순으로 정리해줌., 아식코드기준으로
													//숫자 -> 대문자 -> 소문자 순으로 오름차순 정리
		Collections.sort(list2);
		System.out.println(list1);
		System.out.println(list1.containsAll(list2)); //containsAll 포함되고 있는지 확인
																 //contain 지정된 요소가 모두 포함되어야 true.
		list2.add("B");
		list2.add("C");
		System.out.println(list2);
		list2.add(3, "A");
		System.out.println(list2);
		list2.set(3, "AA");
		System.out.println(list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제 (교집합)
		System.out.println(list1.retainAll(list2));
		System.out.println(list1);
		System.out.println(list2);
		
		for(int i = 0 ; i < list2.size(); i++) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		System.out.println(list1);
		System.out.println(list2);
		}
	}


