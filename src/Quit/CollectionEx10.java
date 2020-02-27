package Quit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
나라와 수도 맞추기 게임을 만들어 보세요. (코드 하나도 없는 문제)
1) 나라이름(country)과 수도(capital)로 구성된 Nation클래스를 작성하고,
	ArrayList<Nation> 컬렉션을 이용하여 아래 실행 예시와 같이 작동되도록 프로그램을 작성하세요.
실행예시:
	** 수도 맞추기 게임을 시작합니다 **
	입력:1, 퀴즈:2, 종료:3 >> 1 (사용자가 입력)
	현재 8개의 나라와 수도가 입력되어 있습니다.
	나라와 수도 입력9>> 한국 서울
	나라와 수도 입력10>> 그리스 아테네
	그리스는 이미 있습니다!!
	나라와 수도 입력10>> 호주 시드니
	나라와 수도 입력11>> 이탈리아 로마
	나라와 수도 입력10>> 그만
	입력:1, 퀴즈:2, 종료:3 >> 2
	호수의 수도는? 시드니
	정답!!
	독일의 수도는? 하얼빈
	아닙니다!!
	멕시코의 수도는? 하얼빈
	아닙니다!!
	이탈리아의 수도는? 로마
	정답!!
	한국의 수도는? 서울
	정답!!
	영국의 수도는? 그만
	입력:1, 퀴즈:2, 종료:3 >> 3
	게임을 종료합니다.
*/
class CapitalGame{

	String country;
	String capital;
	Scanner sc = new Scanner(System.in);
	
	void run() {
		ArrayList<String> nation= new ArrayList<String>();
		nation.add("이집트 카이로");
		nation.add("모로코 라바트");
		nation.add("겜비아 반줄");
		nation.add("라이베리아 몬로비아");
		nation.add("소말리아 모가디시오");
		nation.add("르완다 키칼리");
		nation.add("세네갈 다카르");
		nation.add("한국 서울");
		nation.add("그리스 아테네");
		nation.add("캐나다 오타와");
		nation.add("일본 도쿄");
		nation.add("프랑스 파리");
		nation.add("영국 런던");
		nation.add("스페인 마드리드");
		nation.add("이탈리아 로마");
		nation.add("독일 베를린");
		nation.add("호주 캔버라");
		nation.add("미국 워싱턴");
		
		
		while(true) {
		System.out.println("입력:1, 퀴즈:2, 종료:3 >> ");
		System.out.println("현재"+nation.size()+"개의 나라와 수도가 입력되어 있습니다.");
		int i = Integer.parseInt(sc.nextLine());
		if(i == 1) {
			while(true) {
				System.out.println("나라와 수도 입력"+(nation.size()+1));
				String str1 = sc.nextLine();
				if(str1.equals("그만")) {
					break;
				}
				else if(nation.contains(str1)==true) {
					System.out.println("는 이미 있습니다!!");
				}else{
					nation.add(str1);
//					Iterator <String> it = nation.iterator();
//					while(it.hasNext()) {
//						String str = it.next();
//					}
				}						
			}
		}
		else if(i == 2) {
			while(true) {
							
				int idx = (int)(Math.random()*nation.size()+1);
				String country = nation.get(idx).substring(0,nation.get(idx).indexOf(" "));
				String city = nation.get(idx).substring(nation.get(idx).indexOf(" ")+1, nation.get(idx).length());
				
				System.out.print(country+"의 수도는? ");
				String str = sc.nextLine();
				if(str.equals("그만")) {
					break;
				}else if(city.equals(str)) {
					System.out.println("정답!!");
				}else{
					System.out.println("아닙니다!! 정답 : "+city);
				}
			}
		}
		else if(i == 3) {
			break;
		}
		}
	}
	}

	
public  class CollectionEx10 {
	public static void main(String[] args) {
	
		CapitalGame game = new CapitalGame();
		game.run();
		
	}
}



