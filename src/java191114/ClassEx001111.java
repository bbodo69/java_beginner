//package java191114;
//
//import java.util.Scanner;
//
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
//class Player{				//선수의 이름, 입력값, 이름짓는 메소드.
//	Scanner sc = new Scanner(System.in);
//	private String name = "";										//변수 name private 로 고정
//	private String inputWord = "";								//변수 inputWord private 로 고정
//	void setName(String name) { this.name = name; }	//이름 짓는 메서드 생성
//	String getName() { return name; }							//이름 호출하는 메소드 생성
//	String getWordFromUser() {									//입력값을 받는 메소드
//		// 해당 플레이어 단어 입력 받기
//		System.out.print(name + ">>");
//		inputWord = sc.nextLine();
//		return inputWord;
//	}
//	boolean checkSuccess(String lastWord) {				//
//		boolean check = false;
//		int lastIdx = lastWord.length() - 1;	// lastWord의 마지막 글자 인덱스번호 받기
//		char lastChar = lastWord.charAt(lastIdx);//lastWord의 마지막 글자 떼서 담기
//		char firstChar = inputWord.charAt(0);		// 첫번째 글자 떼서 담기
//		if(lastChar == firstChar) {						//첫글자와 마지막 글자 대조
//			check = true;
//			}
////		System.out.println(check);
//		return check;
//	}
//}
//class WordGameApp{
//	private Player [] p;
//	private String startWord = "자동차";
//	
//	void createPlayers() {	// 플레이어 세팅 메서드
//		Scanner sc = new Scanner(System.in);
//		System.out.print("게임에 참가하는 인원>>");
//		int num = Integer.parseInt(sc.nextLine());
//		p = new Player[num];	// 배열생성
//		for(int i = 0; i < num; i++) {
//			// Player 객체 생성
//			p[i] = new Player();
//			System.out.print("참가자 이름 입력>>");
//			p[i].setName(sc.nextLine());
//		}
//	}
//	void run() {
//		System.out.println("끝말잇기 게임 시작!!!");
//		createPlayers(); // 플레이어 세팅 메서드 호출 -> 세팅 완료
//		String lastWord = startWord;
//		System.out.println("시작단어는 " + lastWord + "입니다.");
//		int idx = 0;
//		while(true) {
//			
//			String newWord = p[idx].getWordFromUser();
//			System.out.println(p[idx].checkSuccess(lastWord));
//			if(!p[idx].checkSuccess(lastWord)) {
//				System.out.println("게임오버!!" + p[idx].getName() + "님이 졌다!!");
//				break;
//			}
//			idx++;
//			idx %= p.length;
//			lastWord = newWord;
//		}
//	}
//	
//}
//public class ClassEx001111 {
//	public static void main(String[] args) {
//		WordGameApp game = new WordGameApp();
//		game.run();
//	}
//}
