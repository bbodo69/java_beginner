package java191112;
/*
 Tv기능 구현
 1. 채널 = 배열[10] 생성후 랜덤값 10개 받아, 낮은값부터 대입
 2. 채널 Up, Down = 배열의 현재위치에서 증감
 3. 채널값 입력받아 변경(채널에 맞는 값이 아닌경우 변경 불가)
 4. 볼륨 Up, Down = 볼륨은 0 ~ 10 까지 증감
 5. 볼륨 음소거 기능
 6. Tv정보기능 - 메서드 호출시 Tv 상태 출력(채널, 볼륨, 전원) - showInfo
 7. 전원이 꺼져있는 경우 모든 기능 동장 안함.
 8. 
 */

import java.util.Scanner;


class Tv3{
	
	Scanner sc = new Scanner(System.in);
	
	
	boolean power = false;
	
		int [] chBasic = new int [10];
		int tmp;
		int chIdx = 0;
		int vol = 0;
		
		void chRandom() {
			for(int i = 0 ; i < 10 ; i++) {
				chBasic[i] = (int)(Math.random()*100+1);
			}
			
			for(int i = 0 ; i < 10 ; i++) {
				for(int j = 0 ; j < 9 ; j++) {
					if(chBasic[j]>chBasic[j+1]) {
						tmp =chBasic[j];
						chBasic[j] = chBasic[j+1];
						chBasic[j+1] = tmp;
					}
				}
			}
			
			System.out.println("현재 채널 = ");
			for(int i = 0 ; i < 10 ; i++) {
				System.out.print(chBasic[i]+" ");
			}System.out.println();
		}
		///		///		///		///		///		///		///		///		///		///
		
		///		///		///		///		///		///		///		///		///		///
		
	
		void logic() {
			while(true) {
				
				String str = sc.nextLine();
									
				if(str.equals("power")) {
					power = !power;
					if(power == true) {
						System.out.println("전원이 켜졌습니다.");
					}else {
						System.out.println("전원이 꺼졌습니다.");
					}
				}
				if(str.equals("stop")) {
					System.out.println("시스템이 꺼졌습니다.");
					break;
				}
				if(str.equals("chUp")) {
					if(chIdx == 9) {
						chIdx = 0;
						System.out.println("채널 : "+chBasic[chIdx]);
					}else {
					chIdx++;
					System.out.println("채널 : "+chBasic[chIdx]);
					}
				}	
				if(str.equals("chDown")) {
					if(chIdx == 0) {
						chIdx = 9;
						System.out.println("채널 : "+chBasic[chIdx]);
					}else {
					chIdx--;
					System.out.println("채널 : "+chBasic[chIdx]);
					}
				}
				
				for(int i = 0; i<chBasic.length ; i++) {
					if(Integer.parseInt(str)==chBasic[i]) {
					if(chBasic[chIdx]==i) {
						System.out.println("현재 채널 "+chBasic[chIdx]);
						for(int j = 0 ; j <chBasic.length ; j++) {
							if(i == chBasic[j]) {
								chIdx = j;
							}
						}
					}	
				}
				}
				
				if(str.equals("volUp")) {
					
				}
				if(str.equals("volDown")) {
					
				}
				if(str.equals("status")) {
					
				}				
				
				
				
				
			}
			
		}
		
}

	

public class ClassEx06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv3 t = new Tv3();
		t.chRandom();
		t.logic();
		
				
	}

}
