package java191126;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//영한 사전 만들기 : HashMap을 아용하여 10 개의 단어를 영어, 한글로
//저장 하고, 영어로 한글을 검색하는 여한 사전을 만드자.

public class HashMapEx02 {

	public static void main(String[] args) {

		HashMap<String, String> m = new HashMap<String, String>();
		
		m.put("car", "자동차");
		m.put("bus", "버스");
		m.put("human", "인간");
		m.put("boy", "소년");
		m.put("yellow", "노랜");	
		m.put("world", "세계");
		m.put("dagerous", "위험한");
		m.put("speed", "빠름");
		m.put("dragon", "드래곤");
		m.put("new", "새러운");
		
		String ee = m.get("new");
		System.out.println(ee);
		
		Set<String> keys = m.keySet();
		Iterator<String> it = keys.iterator();
		
		
		

	}

}
