package java191126;

import java.util.*; //util ��Ű������ ��� Ŭ���� ����ϰڴ�.

//�̸��� 4�� �Է¹޾� ArrayList�� �����ϰ� ��� ����� �� ���� �� �̸��� ���
public class ArrayListEx02 {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>(); 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i <4 ; i++) {
			System.out.println("�̸��� �Է�");
			String s = sc.nextLine();
			a.add(s);
		}
		
		for(int i = 0 ; i <4 ; i++) {
			System.out.println(a.get(i));
		}

		int longestIdx = 0;
		for(int i = 0 ; i < a.size(); i++) {
			if(a.get(longestIdx).length() < a.get(i).length())
				longestIdx = i;
		}
	}
	

}
