//package java191114;
//
//import java.util.Scanner;
///*
//	n���� �����ϴ� �����ձ� ������ ������.
//	ó���ܾ�� "�ڵ���"�̴�. n���� �����ڵ��� ������� �ڽ��� �ܾ �Է��ϸ�ȴ�.
//	�����ձ⿡�� Ʋ���� ���ӿ��� -> ������̸� ���, ��. 
//	
//	WordGameApp Ŭ������ �� ������ ��Ÿ���� Player Ŭ���� �ۼ�.
//	WordGameApp : ������ ��ü������ �����ϴ� run(), run()���� �÷��̾�� ��ŭ 
//					Player��ü �迭 ����
//	Player : �÷��̾� �̸�, �ܾ��Է¹޴� getWordFromUser()�޼���, �����ձ� �������ο� 
//				���Ӱ������ �Ǻ��ϴ� checkSuccess() �޼ҵ�
//	#tip : ���ڿ� ù��° ���� �˾Ƴ��� ��� >>
//	String word = "�ڵ���";
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
//			String str = "�ڵ���";										//���� �ܾ� ����
//			System.out.println("�÷��̾� �̸� �Է�");
//			for(int i = 0 ; i < n ; i++) {
//				p[i] = new Player(sc.nextLine());
//			}																//��ä �迭 �ּҰ�, �����ڸ� �̿��� ��ä ����
//			System.out.println("���� �ܾ�� �ڵ��� ");
//			
//			p[0].word = sc.nextLine();						
//			System.out.println(p[0].name + "��0 �Է��� ���� = " + p[0].word);
//			if(p[0].word.charAt(0)==str.charAt(2)) {
//				for(int i = 1 ; i < n ; i++) {
//					p[i].word = sc.nextLine();
//					System.out.println(p[i].name + "��1 �Է��� ���� = " + p[i].word);
//					if(p[i].word.charAt(0)!=p[i-1].word.charAt(p[i-1].word.length()-1)) {
//						System.out.println("���ӳ�");
//						break;						
//					}
//				}
//				for(int i = 0 ; i < n ; i++) {
//					p[i].word = sc.nextLine();
//					if(i == 0) {
//						System.out.println(p[i].name + "��2 �Է��� ���� = " + p[i].word);
//						if(p[0].word.charAt(0) != p[n-1].word.charAt(p[n-1].word.length()-1)) {
//							System.out.println("���ӳ�");
//							break;
//						}
//					}
//					if(i > 0 && i < n-1) {
//						System.out.println(p[i].name + "��3 �Է��� ���� = " + p[i].word);
//						if(p[i].word.charAt(0) != p[i-1].word.charAt(p[i-1].word.length()-1)) {
//							System.out.println("���ӳ�");
//							break;
//						}
//					}
//					if( i == n-1) {
//						System.out.println(p[i].name + "��4 �Է��� ���� = " + p[i].word);
//						if(p[i].word.charAt(0) != p[i-1].word.charAt(p[i-1].word.length()-1)) {
//							System.out.println("���ӳ�");
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
//		System.out.println("�÷��̾� �� �Է�");
//		WordGameApp game = new WordGameApp();
//		game.basic();
//		game.run();
//
//	}
//}
