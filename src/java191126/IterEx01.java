package java191126;

import java.util.Iterator;
import java.util.Vector;

public class IterEx01 {

	public static void main(String[] args) {
	
		Vector<Integer> v = new Vector<Integer>();
		
		// ������ iterator() �ż��带 ȣ���Ͽ�,
		// v�� �� ��Ҹ� ���������� �˻��� �� �ִ�
		// Iterator��ü(�ݺ���)�� ��´�.
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {		// it�� ���� ����ų ��Ұ� �ִ��� Ȯ���Ͽ�
											// ������ ������ �ݺ�
			int n = it.next();			 // it�� ����Ű�� ��� ����
			//....
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
