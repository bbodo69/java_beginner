package java191126;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("�ظ�����");
		myList.add("�����");
		
		System.out.println(myList);
		
		Collections.sort(myList);
		System.out.println(myList);

		//�ε��� �˻�
		int index = Collections.binarySearch(myList, "�����");
		System.out.println(index);
		
		
	}

}
