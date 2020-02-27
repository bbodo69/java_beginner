//package java191114;
//
//import java.util.Scanner;
//
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
//class Player{				//������ �̸�, �Է°�, �̸����� �޼ҵ�.
//	Scanner sc = new Scanner(System.in);
//	private String name = "";										//���� name private �� ����
//	private String inputWord = "";								//���� inputWord private �� ����
//	void setName(String name) { this.name = name; }	//�̸� ���� �޼��� ����
//	String getName() { return name; }							//�̸� ȣ���ϴ� �޼ҵ� ����
//	String getWordFromUser() {									//�Է°��� �޴� �޼ҵ�
//		// �ش� �÷��̾� �ܾ� �Է� �ޱ�
//		System.out.print(name + ">>");
//		inputWord = sc.nextLine();
//		return inputWord;
//	}
//	boolean checkSuccess(String lastWord) {				//
//		boolean check = false;
//		int lastIdx = lastWord.length() - 1;	// lastWord�� ������ ���� �ε�����ȣ �ޱ�
//		char lastChar = lastWord.charAt(lastIdx);//lastWord�� ������ ���� ���� ���
//		char firstChar = inputWord.charAt(0);		// ù��° ���� ���� ���
//		if(lastChar == firstChar) {						//ù���ڿ� ������ ���� ����
//			check = true;
//			}
////		System.out.println(check);
//		return check;
//	}
//}
//class WordGameApp{
//	private Player [] p;
//	private String startWord = "�ڵ���";
//	
//	void createPlayers() {	// �÷��̾� ���� �޼���
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ӿ� �����ϴ� �ο�>>");
//		int num = Integer.parseInt(sc.nextLine());
//		p = new Player[num];	// �迭����
//		for(int i = 0; i < num; i++) {
//			// Player ��ü ����
//			p[i] = new Player();
//			System.out.print("������ �̸� �Է�>>");
//			p[i].setName(sc.nextLine());
//		}
//	}
//	void run() {
//		System.out.println("�����ձ� ���� ����!!!");
//		createPlayers(); // �÷��̾� ���� �޼��� ȣ�� -> ���� �Ϸ�
//		String lastWord = startWord;
//		System.out.println("���۴ܾ�� " + lastWord + "�Դϴ�.");
//		int idx = 0;
//		while(true) {
//			
//			String newWord = p[idx].getWordFromUser();
//			System.out.println(p[idx].checkSuccess(lastWord));
//			if(!p[idx].checkSuccess(lastWord)) {
//				System.out.println("���ӿ���!!" + p[idx].getName() + "���� ����!!");
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
