package Quit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
이름과 학점(4.5만점)을 5개 입력받아 해쉬맴에 저장하고, 장학생 선발 기준을 입력받아 장학생 명단을 출력하세요.
실해예시:
	자바장학금관리시스템입니다.
	이름과 학점 >> 호크아이 3.1
	이름과 학점 >> 블랙위도우 3.6
	이름과 학점 >> 토르 2.9
	이름과 학점 >> 데드풀 3.7
	이름과 학점 >> 아이언맨 4.3
	장학생 선발 학점 기준 입력 >> 3.2
	장학생 명단 : 블랙위도우 데드풀 아이언맨
*/
class Scholarship{
}
public class CollectionEx09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> h = new HashMap<String, Double>();
			System.out.println("자바장학금관리시스템입니다.");
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("이름과 학점 >> ");
			String str = sc.nextLine();
			String name = str.substring(0, str.indexOf(" "));
			String score = str.substring(str.indexOf(" ")+1,str.length());
			double score1 = Double.parseDouble(score);
			h.put(name, score1);
			System.out.println();
		}
		
		System.out.println("장학생 선발 학점 기준 입력 >>");
		double i = Double.parseDouble(sc.nextLine());
		//////////////////////////////////////////////////////////////////////////////////////////		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(h.get(key) > i) {
				System.out.print(key+" ");
			}
			
		}
		//Scholarship sship = new Scholarship("자바장학금");
		//sship.read();
		//sship.select();		
	}
}
