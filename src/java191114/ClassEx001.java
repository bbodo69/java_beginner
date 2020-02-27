//package java191114;
//
//import java.util.Scanner;
///*
//	n명이 참가하는 끝말잇기 게임을 만들어보자.
//	처음단어는 "자동차"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면된다.
//	끝말잇기에서 틀리면 게임오버 -> 진사람이름 출력, 끝. 
//	
//	WordGameApp 클래스와 각 선수를 나타내는 Player 클래스 작성.
//	WordGameApp : 게임을 전체적으로 진행하는 run(), run()에서 플레이어수 만큼 
//					Player객체 배열 생성
//	Player : 플레이어 이름, 단어입력받는 getWordFromUser()메서드, 끝말잇기 성공여부와 
//				게임계속할지 판별하는 checkSuccess() 메소드
//	#tip : 문자열 첫번째 문자 알아내는 방법 >>
//	String word = "자동차";
//	char firstChar = word.charAt(0);
//*/
//class Player{
//	String name;
//	String word;
//
//	Player(String name){
//		this.name = name;
//	
//	}
//	Player(){
//		
//	}
//	
//}
//		
//	
//
//class WordGameApp{
//	
//	Scanner sc = new Scanner(System.in);
//	//
//	void basic() {
//		
//		
//	}
//	
//	int n = Integer.parseInt(sc.nextLine());
//	Player [] p = new Player[n];
//	
//
//		void run() {
////			
//			
//			String str = "자동차";										//시작 단어 설정
//			System.out.println("플레이어 이름 입력");
//			for(int i = 0 ; i < n ; i++) {
//				p[i] = new Player(sc.nextLine());
//			}																//객채 배열 주소값, 생성자를 이용한 객채 생성
//			System.out.println("시작 단어는 자동차 ");
//			
//			p[0].word = sc.nextLine();						
//			System.out.println(p[0].name + "이0 입력한 문자 = " + p[0].word);
//			if(p[0].word.charAt(0)==str.charAt(2)) {
//				for(int i = 1 ; i < n ; i++) {
//					p[i].word = sc.nextLine();
//					System.out.println(p[i].name + "이1 입력한 문자 = " + p[i].word);
//					if(p[i].word.charAt(0)!=p[i-1].word.charAt(p[i-1].word.length()-1)) {
//						System.out.println("게임끝");
//						break;						
//					}
//				}
//				for(int i = 0 ; i < n ; i++) {
//					p[i].word = sc.nextLine();
//					if(i == 0) {
//						System.out.println(p[i].name + "이2 입력한 문자 = " + p[i].word);
//						if(p[0].word.charAt(0) != p[n-1].word.charAt(p[n-1].word.length()-1)) {
//							System.out.println("게임끝");
//							break;
//						}
//					}
//					if(i > 0 && i < n-1) {
//						System.out.println(p[i].name + "이3 입력한 문자 = " + p[i].word);
//						if(p[i].word.charAt(0) != p[i-1].word.charAt(p[i-1].word.length()-1)) {
//							System.out.println("게임끝");
//							break;
//						}
//					}
//					if( i == n-1) {
//						System.out.println(p[i].name + "이4 입력한 문자 = " + p[i].word);
//						if(p[i].word.charAt(0) != p[i-1].word.charAt(p[i-1].word.length()-1)) {
//							System.out.println("게임끝");
//							break;
//						}else{
//							i = 0 ;
//						}
//					}
//				}
//			}
//		}
//	}	
//
//	
//
//
//public class ClassEx001 {
//	public static void main(String[] args) {
//		System.out.println("플레이어 수 입력");
//		WordGameApp game = new WordGameApp();
//		game.basic();
//		game.run();
//
//	}
//}
