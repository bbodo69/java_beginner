package java191126;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx01 {
	public static void main(String[] args) {

		// #1. 생성
		HashMap<String, String> h = new HashMap<String, String>();
		
		// #2. 요소 삽입
		h.put("apple", "사과");
		h.put("strawberry", "딸기");
		h.put("watermelon", "수박");
		h.put("peach", "복숭아");
		
		// #3. 값 꺼내기
		String str = h.get("apple");		//a.get(0);
		System.out.println(str);
		String str1 = h.get("melon");	//없는 값은 null 로 출력
		System.out.println(str1);
		
		h.put("apple", "대구사과");		//데이터 값 수정
		String str2 = h.get("apple");
		System.out.println(str2);
		
		System.out.println(h);
		
		// #4. 키로 삭제
		h.remove("apple");
		String str3 = h.get("apple");
		System.out.println(str3);
		System.out.println(h);
		
		// #5. 용소의 개수 알아내기
		int size = h.size();
		System.out.println(size);
		
		// #6. 헤쉬맵 전체 검색 : keySet() 이용 
		//모든 키를 알아낸 후, 각 키에 대한 가밧을 가져오는 방식
		
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {				//Set 은 순서가 없기 때문에 get 을 받을 인덱스가 없다.
			String key = it.next();			
			String value = h.get(key);
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
