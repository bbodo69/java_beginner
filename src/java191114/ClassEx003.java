package java191114;

import java.util.Scanner;


/*
Grade Ŭ������ �ۼ��غ�����. 
3������ ������ �Է¹޾� Grade ��ü�� �����ϰ� 
���� ����� ����ϴ� main()�� ���� ���ô� �Ʒ��� �����ϴ�. 

�ܼ���¿� )
	����, ����, ���������� �Է��ϼ���. 
	����>> 90  (<- ���Ƿ� ����ڰ� �Է��� ����)
	����>> 88
	����>> 96
	����� 91
*/
class Grade{
	int math;
	int science;
	int english;
	int avg;
	
	Grade(int math, int science,  int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	void average() {
		System.out.println("����>> "+math+"\n"+"����>> "+science+"\n"+"����>> "+english
									+"\n"+"����� "+(math+science+english)/3);
	}
}

public class ClassEx003 {
	public static void main(String[] args) {
		
		System.out.println("���� ���� ���� ������ �Է��ϼ���.");	
		Scanner sc = new Scanner(System.in);
		Grade me = new Grade(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		me.average();
		
		
		
	}
}
