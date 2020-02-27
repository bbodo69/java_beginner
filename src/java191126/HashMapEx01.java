package java191126;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx01 {
	public static void main(String[] args) {

		// #1. ����
		HashMap<String, String> h = new HashMap<String, String>();
		
		// #2. ��� ����
		h.put("apple", "���");
		h.put("strawberry", "����");
		h.put("watermelon", "����");
		h.put("peach", "������");
		
		// #3. �� ������
		String str = h.get("apple");		//a.get(0);
		System.out.println(str);
		String str1 = h.get("melon");	//���� ���� null �� ���
		System.out.println(str1);
		
		h.put("apple", "�뱸���");		//������ �� ����
		String str2 = h.get("apple");
		System.out.println(str2);
		
		System.out.println(h);
		
		// #4. Ű�� ����
		h.remove("apple");
		String str3 = h.get("apple");
		System.out.println(str3);
		System.out.println(h);
		
		// #5. ����� ���� �˾Ƴ���
		int size = h.size();
		System.out.println(size);
		
		// #6. �콬�� ��ü �˻� : keySet() �̿� 
		//��� Ű�� �˾Ƴ� ��, �� Ű�� ���� ������ �������� ���
		
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {				//Set �� ������ ���� ������ get �� ���� �ε����� ����.
			String key = it.next();			
			String value = h.get(key);
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
