package Quit;

import java.util.HashMap;

/*
id�� tel(��ȭ��ȣ)�� �����Ǵ� StudentŬ������ �����, 
�̸��� key�� �ϰ� Student��ü�� ������ �ϴ� �ؽ����� �ۼ��غ�����.
�̸��� �˻��ϸ� id�� ��ȭ��ȣ ��µǰ�, exit �Է��ϸ� ���α׷� ����. 
*/

class Student {
	static String id;
	static int tel;
	Student(String id, int tel){this.id=id; this.tel=tel;}	
	
	String getValues() {
		return "id : "+id +"    tel : "+tel;
	}	
}




public class CollectionEx02 {
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("s1",0000);
		Student s2 = new Student("s2",1111);
		Student s3 = new Student("s3",2222);
		Student s4 = new Student("s4",3333);
		Student s5 = new Student("s5",4444);

		s1.getValues();
		
		HashMap<String, Student> h = new HashMap<String, Student>();
		h.put("s1", s1);
		h.put("s1", s2);
		
		//Student ss = h.get(s1);
		System.out.println(h.get("s1"));
	
	}
}
