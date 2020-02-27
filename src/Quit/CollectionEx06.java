package Quit;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/*
Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하세요.
강수량을 입력하면 벡터에 추가하고 현재 입력된 모든 강수량과 평균을 출력한다.
실행 예시 :
	강수량 입력 (0 입력시 종료)>>	5
	5
	현재 평균 5
	강수량 입력 (0 입력시 종료)>>	80
	5 80
	현재 평균 42
	강수량 입력 (0 입력시 종료)>>	53
	5 80 53
	현재 평균 46
	강수량 입력 (0 입력시 종료)>>	22
	5 80 53 22
	현재 평균 40
	강수량 입력 (0 입력시 종료)>>	0
	프로그램 종료!
*/
public class CollectionEx06 {
	public static void main(String[] args) {

		Vector <Integer> v = new Vector <Integer>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>>");
			int num = Integer.parseInt(sc.nextLine());
			if(num == 0 ) {
				break;
			}else {
			v.add(num);
			int total = 0;
			Iterator<Integer> it = v.iterator();
			while(it.hasNext()) {				// it가 다음 가르킬 요소가 있는지 확인하여
														// 백터의 끝까지 반복
				int n = it.next();			 		// it가 가르키는 요소 리턴
				System.out.println(n+" ");
				total += n;
				}
			System.out.println(total/v.size());
			
//			for(int i = 0 ; i < v.size() ; i++) {
//				System.out.print(v.get(i)+" ");
//			}
			}
		}	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		while(true) {
//			System.out.print("강수량 입력 (0 입력시 종료)>>");
//			
//			int num = Integer.parseInt(sc.nextLine());
//			if(num == 0 ) {
//				break;
//			}else {
//			v.add(num);
//			for(int i = 0 ; i < v.size() ; i++) {
//				System.out.print(v.get(i)+" ");
//			}
//			int total = 0;
//			for(int i = 0 ; i < v.size() ; i++) {
//				total += v.get(i);
//			}System.out.println();
//			System.out.println("현재 평균 "+total/v.size());
//		}
//		}sc.close();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		public class IterEx01 {
//
//			public static void main(String[] args) {
//			
//				Vector<Integer> v = new Vector<Integer>();
//				
//				// 백터의 iterator() 매서드를 호출하여,
//				// v의 각 요소를 순차적으로 검색할 수 있는
//				// Iterator객체(반복자)를 얻는다.
//				Iterator<Integer> it = v.iterator();
//				
//				while(it.hasNext()) {		// it가 다음 가르킬 요소가 있는지 확인하여
//													// 백터의 끝까지 반복
//					int n = it.next();			 // it가 가르키는 요소 리턴
//					//....
//				}
	}
}
