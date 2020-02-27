package java191114;
import java.util.Scanner;
//n명이 참가하는 끝말잇기 게임을 만들어보자.
//처음단어는 "자동차"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면된다.
//끝말잇기에서 틀리면 게임오버 -> 진사람이름 출력, 끝. 
//
//WordGameApp 클래스와 각 선수를 나타내는 Player 클래스 작성.
//WordGameApp : 게임을 전체적으로 진행하는 run(), run()에서 플레이어수 만큼 
//				Player객체 배열 생성
//Player : 플레이어 이름, 단어입력받는 getWordFromUser()메서드, 끝말잇기 성공여부와 
//			게임계속할지 판별하는 checkSuccess() 메소드
//#tip : 문자열 첫번째 문자 알아내는 방법 >>


class Player{	
	
	String name;
	String word;
	
	Player(String name){
		this.name = name;
	}
	
}


class WordGameApp{
	
	Scanner sc = new Scanner(System.in);
	int idx = 0;
	
	
	void run() {
		System.out.println("플레이어 수 입력");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("이름 입력");
		Player [] p = new Player [n];
		
		for(int i = 0 ; i < n ; i++) {
			p[i] = new Player(sc.nextLine());
			System.out.println(p[i]);
			
//			char lastChar;
//			char firstChar;
//			lastChar = p[idx%n].word.charAt(0);
//			firstChar = p[idx%n].word.charAt(p[idx%n].word.length()-1);
		}
		
		
			while(true) {
				
				p[idx%n].word = sc.nextLine();
				
				System.out.println(idx);
				
				if(idx > 0 && idx%n == 0 && idx != 0) {
					if( p[idx%n].word.charAt(0) != p[(idx%n)+n-1].word.charAt(p[(idx%n)+n-1].word.length()-1) ){
						System.out.println(idx);
						break;
					}else {
						System.out.println(idx);
						idx++;
						}
					}
				if(idx > 0) {
					if( p[idx%n].word.charAt(0) != p[(idx%n)-1].word.charAt(p[(idx%n)-1].word.length()-1) ){
						System.out.println(idx);
						break;
					}else {
						System.out.println(idx);
						idx++;
						}
					}
				if(idx == 0) {
					idx++;
				}
				}
			}
		}
			
	


public class ClassEx00001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordGameApp game = new WordGameApp();
		game.run();
	}

}
