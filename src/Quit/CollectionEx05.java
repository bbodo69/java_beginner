package Quit;

import java.util.HashMap;
import java.util.Scanner;

/*
"그만"이 입력될 때까지 나라이름과 인구를 입력받아 저장하고, 
다시 나라이름을 입력받아 인구를 출력하는 프로그램을 작성하세요. 
아래 해쉬맵을 이용하세요.
HashMap<String, Integer> nations = new HashMap<String, Integer>();
실행예시 :
	나라 이름과 인구를 입력하세요.(예: Korea 5000)
	나라 이름, 인구 >>  Korea 5000
	나라 이름, 인구 >>  USA 1000000
	나라 이름, 인구 >>  Swiss 2000
	나라 이름, 인구 >>  France 3000
	나라 이름, 인구 >>  그만
	인구 검색 >> France
	France의 인구는 3000
	인구 검색 >> 스위스
	스위스 나라는 없습니다.
	인구 검색 >> 그만
	프로그램 종료!
*/
public class CollectionEx05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, String> nations = new HashMap<String, String>();
		
		while(true) {
			System.out.println("1. 나라, 인구 등록   2. 인구 검색   3.프로그램 종료");
			int i = Integer.parseInt(sc.nextLine());
			if(i == 1) {
				while(true) {
					System.out.println("나라, 인구 입력");
					String str = sc.nextLine();
					int idx = str.indexOf(" ");		//스페이스 의 인덱스 번호를 알려줌
					if(str.equals("그만")) {
						break;				
					}else {
					String name = str.substring(0, idx);
					String population = str.substring(idx+1, str.length());
					nations.put(name, population);
				}
			}
		}else if(i == 2) {
			while(true) {
				System.out.println("나라이름 입력");
				String str = sc.nextLine();
				if(str.equals("그만")) {
					break;
				}else {
					System.out.println(nations.get(str));
				}
			}
		}else if(i==3) {
			System.out.println("프로그램 종료");
			break;
		}
		
	}
	}
}


