package Quit;

import java.util.Vector;
import java.util.Collections;
import java.util.Scanner;

/*
Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 벡터에 저장하고,
벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요. 
실행예시:
	정수>> 10 6 22 6 88 77 -1
	가장 큰 수는 88
*/
public class CollectionEx03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		while(true) {
			int i = sc.nextInt();
			v.add(i);
			if(i==-1) {
				break;
			}
		}
		Object obj = Collections.max(v);
		System.out.println(obj);
		
		
		
	}
}
