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
			
			System.out.println("���� ä�� = ");
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
						System.out.println("������ �������ϴ�.");
					}else {
						System.out.println("������ �������ϴ�.");
					}
				}
				if(str.equals("stop")) {
					System.out.println("�ý����� �������ϴ�.");
					break;
				}
				if(str.equals("chUp")) {
					if(chIdx == 9) {
						chIdx = 0;
						System.out.println("ä�� : "+chBasic[chIdx]);
					}else {
					chIdx++;
					System.out.println("ä�� : "+chBasic[chIdx]);
					}
				}	
				if(str.equals("chDown")) {
					if(chIdx == 0) {
						chIdx = 9;
						System.out.println("ä�� : "+chBasic[chIdx]);
					}else {
					chIdx--;
					System.out.println("ä�� : "+chBasic[chIdx]);
					}
				}
				
				for(int i = 0; i<chBasic.length ; i++) {
					if(Integer.parseInt(str)==chBasic[i]) {
					if(chBasic[chIdx]==i) {
						System.out.println("���� ä�� "+chBasic[chIdx]);
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
