package java191126;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//���� ���� ����� : HashMap�� �ƿ��Ͽ� 10 ���� �ܾ ����, �ѱ۷�
//���� �ϰ�, ����� �ѱ��� �˻��ϴ� ���� ������ ������.

public class HashMapEx02 {

	public static void main(String[] args) {

		HashMap<String, String> m = new HashMap<String, String>();
		
		m.put("car", "�ڵ���");
		m.put("bus", "����");
		m.put("human", "�ΰ�");
		m.put("boy", "�ҳ�");
		m.put("yellow", "�뷣");	
		m.put("world", "����");
		m.put("dagerous", "������");
		m.put("speed", "����");
		m.put("dragon", "�巡��");
		m.put("new", "������");
		
		String ee = m.get("new");
		System.out.println(ee);
		
		Set<String> keys = m.keySet();
		Iterator<String> it = keys.iterator();
		
		
		

	}

}
