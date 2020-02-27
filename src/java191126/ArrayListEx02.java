package java191126;

import java.util.*; //util 패키지내의 모든 클래스 사용하겠다.

//이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을 출력
public class ArrayListEx02 {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>(); 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i <4 ; i++) {
			System.out.println("이름을 입력");
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
