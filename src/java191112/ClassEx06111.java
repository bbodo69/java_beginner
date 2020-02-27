package java191112;

import java.util.Scanner;

/*
Tv ��� ����
 1. ä�� = �迭[10] ������ ������ 10�� �޾�, ���������� ����
 2. ä�� Up, Down = �迭�� ������ġ���� ����
 3. ä�ΰ� �Է¹޾� ����(ä�ο� �´� ���� �ƴѰ�� ���� �Ұ�)
 4. ���� Up, Down = ������ 0 ~ 10 ���� ����
 5. ���� ���Ұ� ��� 
 6. Tv������� -  �޼��� ȣ��� Tv���� ���(ä��,����,����)
 7. ������ �����ִ� ��� ��� ��� ���� ����.
*/
class Tv123{ // ���� + �޼���
	// ����
	boolean power = false;
	int [] channel = new int[10]; // ���� ä�ε� �����
	int chIdx = 0;	// channel �迭�� �ε�����ȣ ���� ����
	int vol = 0, ch = 0;
	////////////////////////////////////////////////////////////////////////
	// �޼���
	void setTv() {
		if(power) {
			// ä�� ����
			// ä�� 10�� �������� �ޱ�
			for(int i = 0; i < 10; i++) {
				// ���� �ޱ�
				channel[i] = (int)(Math.random() * 100) + 1;
				// �ߺ� Ȯ��
				for(int j = 0; j < i; j++) {
					if(channel[i] == channel[j]) {
						i--;
						break;
					}
				}
			}
			// ä�� ���Ľ�Ű��
			for(int i = 0; i < channel.length-1; i++) {
				int min = i;
				for(int j = i+1; j < channel.length; j++) {
					if(channel[min] > channel[j]) {
						min = j;
					}
				}
				int tmp = channel[i];
				channel[i] = channel[min];
				channel[min] = tmp;
			}
			System.out.print("ä�� : ");
			for(int i : channel) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			// ä�� ������, ù��° ä���� ��ȣ�� ch�� ���
			ch = channel[0];	
			chIdx = 0;
		}else {
			System.out.println("������ ���ּ���.");
		}
		
	}
	void powerOnOff() {
		// ���� on off ���
		power = !power;
	}
	void chUp() {
		if(power) { // power�� true�϶��� �۵��ض�.
			// ä�� up
			chIdx++;
			if(chIdx == 10) {
				chIdx = 0;
			}
			ch = channel[chIdx];
		}else {
			System.out.println("������ ���ּ���");
		}
	}
	void chDown() {
		if(power) {
			// ä�� down
			chIdx--;
			if(chIdx == -1) {
				chIdx = 9;
			}
			ch = channel[chIdx];
		}else {
			System.out.println("������ ���ּ���");
		}
	}
	/*
	void chChange(int c) {
		if(power) {
			for(int i = 0; i < channel.length; i++) {
				if(channel[i] == c) {
					chIdx = i;
					ch = channel[chIdx];
				}
			}
		}else {
			System.out.println("������ ���ּ���");
		}
	}
	*/
	void chChange() {
		if(power) {
			Scanner sc = new Scanner(System.in);
			System.out.print("ä�� :");
			for(int a : channel) System.out.print(a);
			System.out.println();
			System.out.println("�ٲ� ä�� ��ȣ �Է��ϼ��� : ");
			int input = Integer.parseInt(sc.nextLine());
			
			// �Է¹��� ä���� channel�迭�� �ִ��� �˻�
			for(int i = 0; i < channel.length; i++) {
				if(channel[i] == input) { // ������ 
					chIdx = i;				// �ε�����ȣ �ٲٰ�
					ch = channel[chIdx];	// �ٲ��ε�����ȣ�� ���� ä�ι�ȣ����.
				}
			}
		}else {
			System.out.println("������ ���ּ���.");
		}
	}
	
	void volUp() {
		if(power) {
			// ���� up 0~10
			if(vol < 10) { // vol�� 10���� ������ ������ 1 ������
				vol++;
			}
		}else {
			System.out.println("������ ���ּ���");
		}
	}
	void volDown() {
		if(power) {
			// ���� down
			if(vol > 0) { // vol�� 0 ���� Ŭ���� ������ 1 �ٿ���
				vol--;
			}
		}else {
			System.out.println("������ ���ּ���");
		}
	}
	void mute() {
		if(power) {
			// ���Ұű��
			vol = 0;
		}else {
			System.out.println("������ ���ּ���");
		}
	}
	void showTvInfo() {
		if(power) {
			// tv���� ���(����, ä��, ����)
			System.out.println("���� : " + (power?"ON":"OFF") + " ä�� : " + ch + " ���� : " + vol);
		}else {
			System.out.println("������ ���ּ���");
		}
	}
}
public class ClassEx06111 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);

		Tv123 t = new Tv123(); 	// tv �����
		t.powerOnOff();		// tv Ű��
		t.setTv(); 			// ä�� ����
		t.showTvInfo();
		t.volUp();
		t.volUp();
		t.volUp();
		t.showTvInfo();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		//System.out.println("ä�� �Է�: ");
		//int input = Integer.parseInt(sc.nextLine());
		//t.chChange(input);
		t.chChange();
		t.showTvInfo();
		t.chUp();
		t.showTvInfo(); 
		t.chDown();
		t.chDown();
		t.powerOnOff();
		t.chDown();
		t.showTvInfo();
		
		// ����Ű���
		// ä�� up / down
		// ���Ұ�
		// ���Ұ� Ǯ��
		// �ٸ�ä�� ����
		// �Ҹ� Ű���..
		
	}
}
//���� ������, for, if,while, do-while, switch, ..... ��� �� 
//�޼��� �ȿ� �־���Ѵ�. 









