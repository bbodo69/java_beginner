package java191111;

import java.util.Scanner;

/*Ŭ���� �⺻�� ����		:"Ŭ������, ������" : static int a ;
 * Ŭ���� ������ ����		:"Ŭ������, ������" : static Tv t;
 * 
 * �ν��Ͻ� �⺻�� ����	:��ü����->���۷��� ������, ������ : int, a;
 * �ν��Ͻ� ������ ����	:��ü����->���۷��� ������, ������ : Tv t; String str
 * 
 * ���� �⺻�� ���� 		:"�м���" : �޼���ȿ��� ����, �޼��� ����Ǹ� �ҹ� 
 * ���� ������ ����			:"�м���" : �޼���ȿ��� ����, �޼��� ����Ǹ� �ҹ�:"������"
 * 
 *  Ŭ���� �ż��� : "Ŭ������, �ż����()"
 *  					vod finv)(){/////}
 *  
 *  �ν��Ͻ� �ż� : ��ü���� ->���۷��� ������ , �ⷹ
 *  
 */

class Tv1{
	boolean power = false;
	int vol = 0; 
	int ch = 0;
	
	void powerOnOff() {
		power = !power;	
	}

	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
	
	void chChange(int i) {
		ch = i;
	}
	
	void volUp() {
		vol++;
	}
	
	void volDown() {
		vol--;
	}
	void volChange(int j) {
		vol = j;
	}
	
}	
	public class ClassEx01{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Tv1 t1 = new Tv1();
		System.out.println(t1.power);
		t1.powerOnOff();
		System.out.println(t1.power);
		
	
		System.out.println(t1.ch);
		
		t1.chChange(sc.nextInt());
		System.out.println(t1.ch+"�� ä��");
		
		t1.volChange(sc.nextInt());
		System.out.println("�Ҹ� ũ�� "+t1.vol);
		
		
		
	}

}
