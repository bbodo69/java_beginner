package java191114;
import java.util.Scanner;
//n���� �����ϴ� �����ձ� ������ ������.
//ó���ܾ�� "�ڵ���"�̴�. n���� �����ڵ��� ������� �ڽ��� �ܾ �Է��ϸ�ȴ�.
//�����ձ⿡�� Ʋ���� ���ӿ��� -> ������̸� ���, ��. 
//
//WordGameApp Ŭ������ �� ������ ��Ÿ���� Player Ŭ���� �ۼ�.
//WordGameApp : ������ ��ü������ �����ϴ� run(), run()���� �÷��̾�� ��ŭ 
//				Player��ü �迭 ����
//Player : �÷��̾� �̸�, �ܾ��Է¹޴� getWordFromUser()�޼���, �����ձ� �������ο� 
//			���Ӱ������ �Ǻ��ϴ� checkSuccess() �޼ҵ�
//#tip : ���ڿ� ù��° ���� �˾Ƴ��� ��� >>


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
		System.out.println("�÷��̾� �� �Է�");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("�̸� �Է�");
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
