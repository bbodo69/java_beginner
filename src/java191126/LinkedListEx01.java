package java191126;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("해리포터");
		myList.add("어벤저스");
		
		System.out.println(myList);
		
		Collections.sort(myList);
		System.out.println(myList);

		//인덱스 검색
		int index = Collections.binarySearch(myList, "어벤저스");
		System.out.println(index);
		
		
	}

}
