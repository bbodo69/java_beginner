package java191112;
/*
 Tv��� ����
 1. ä�� = �迭[10] ������ ������ 10�� �޾�, ���������� ����
 2. ä�� Up, Down = �迭�� ������ġ���� ����
 3. ä�ΰ� �Է¹޾� ����(ä�ο� �´� ���� �ƴѰ�� ���� �Ұ�)
 4. ���� Up, Down = ������ 0 ~ 10 ���� ����
 5. ���� ���Ұ� ���
 6. Tv������� - �޼��� ȣ��� Tv ���� ���(ä��, ����, ����) - showInfo
 7. ������ �����ִ� ��� ��� ��� ���� ����.
 8. 
 */

import java.util.Scanner;

class Tv{
	
	Scanner sc = new Scanner(System.in);
	
	boolean power = false;
	int chBasic = 0;
	int volBasic = 0;
	String str = sc.nextLine();
	 
		void OnOff() {
		
		}
		
				
	
	
	//����
	
		void powerOnOff () {
		power = !power;
	}
	
	//ä�� ����
	int [] ch	 = new int [10];
	int tmp;
	int k;
	 
	
	
	void chRandom() {
		
		if(power == true) {
			for(k = 0 ; k < ch.length; k++) {	
				ch[k] = (int)(Math.random()*300+1);
				}
			for(int i = 0 ; i < ch.length; i++) {
				for(int j = 0 ; j < ch.length-1; j++) {
					if(ch[j] > ch[j+1]) {
						tmp = ch[j];
						ch[j] = ch[j+1];
						ch[j+1] = tmp;
					}
				}
			}
		}else{System.out.println("������ ���ּ���");
	}
	}
	
	//ä�� ���
		void chList() {
			if(power == true) {
			System.out.print("���� ������ �ִ� ä���� ");
			for(int i = 0 ; i < ch.length ; i++) {
				System.out.print(ch[i]+" ");
			}
		}else{System.out.println("������ ���ּ���");
		}
	}
	

	//�⺻ ä��
		
	int basic() {
		System.out.println();
		System.out.println("�⺻ä�� = "+ ch[0]+" ��");
		return ch[0];
	}
	
	//ä�� Up, Down
	void chUp() {
		if(power == true) {
		if(chBasic <=9)
		chBasic++;
		if(chBasic == 10) {
			chBasic = 0;
		}System.out.println("���� ä�� = " +ch[chBasic]);
		}else{System.out.println("������ ���ּ���");
		}
	}
		
		
	
	void chDown() {
		if(power == true) {
		if(chBasic>=0) {
		chBasic --;
		}
		if(chBasic == -1) {
			chBasic = 9;
		}System.out.println("���� ä�� = " +ch[chBasic]);
		}else{System.out.println("������ ���ּ���");
		}
	}


//ä�ΰ� �Է¹޾� ����(ä�ο� �´� ���� �ƴѰ�� ���� �Ұ�)

	void chChange(int c) {
		if(power == true) {
		for(int i = 0 ; i < ch.length ; i++) {
			if(c == ch[i]) {
			chBasic = i;					
			System.out.println("����ä�� = "+ch[i]);

			}
		}
	}else{System.out.println("������ ���ּ���");
	}
	}

//���� ����
	void info() {
		if(power == true) {
		System.out.println(" ä�� = " + ch[chBasic] +"   �Ҹ� = "+volBasic);
	}else{System.out.println("������ ���ּ���");
}
}
}

public class ClassEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t = new Tv();
		
		t.powerOnOff();
						
		t.chRandom();
		
		t.chList();
				
		t.basic();
		
		t.chUp();
		
		t.chChange(t.sc.nextInt());
		t.chUp();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		
		t.info();
		
				
	}

}
