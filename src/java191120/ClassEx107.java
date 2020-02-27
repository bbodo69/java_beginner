package java191120;

import java.util.Scanner;

//�������̽� (��ȭ)
/*
	Stack �������̽��� ��ӹ޾� ���ڿ��� �����ϴ� StringStack Ŭ������ �����ϼ���. 
	�Ʒ��� ���� �������� �������� main()�� �����Ͽ� �ۼ��ϼ���. 
	������:
		�� ���� ���� ������ ũ�� �Է� >>  3 (����ڰ� �Է�)
		���ڿ� �Է� >> hello
		���ڿ� �Է� >> sunny
		���ڿ� �Է� >> smile
		���ڿ� �Է� >> happy
		������ �� ���� Ǫ�� �Ұ�!
		���ڿ� �Է� >> �׸�
		���ÿ� ����� ��� ���ڿ� �� : smile sunny hello
*/
interface Stack {
	int length();					// ���� ���ÿ� ����� ���� ����
	int capacity();					// ������ ��ü ���� ������ ���� ����
	String pop();					// ������ ��(top)�� ����� ���ڿ� �����ϰ� ����ҿ��� ���ڿ� ����
	boolean push(String val);		// ������ ��(top)�� ����ҿ� ���ڿ� �ְ� ���� ��� boolean Ÿ������ ����
}

class StringStack implements Stack {
	
	Scanner sc = new Scanner(System.in);
	String [] arr ;
	
	StringStack(){
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public int length() {
		
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == null) {
				count++;
			}
		}
		return count;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	public int capacity() {
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == null) {
				
				count++;
			}
			if(arr[i] != null) {
				System.out.print(arr[i]+"  ");
			}
		}
		return arr.length-count;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	public String pop() {
		int a = 0;
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[arr.length-1] != null) {
				a = arr.length;
			}else if(arr[i] == null) {
				a = i;
				break;
			}
				
		}if(a != 0 ) {
			System.out.println(arr[a-1]);
		}
		return arr[a-1] = null;
		
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean push(String val) {
		return false;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	void run() {
		
		System.out.println("�迭 ���� �Է�");
		arr = new String [Integer.parseInt(sc.nextLine())];
		
	while(true) {
		String s = "stop";
		System.out.println("1. ���ڿ� ����, 2.���� ������ ����, 3. ���� �� ����, 4.�� ����, ���ڿ� ����, 5. ���ÿ� ����� ��� ���ڿ� ��� ");
		int j = Integer.parseInt(sc.nextLine());
		if(j == 1) {
	
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i] == null) {
					System.out.println(i+"��° �迭 ���� �Է�, ���߷��� stop �Է�");
					String str = sc.nextLine();
					if(str.equals(s)) {
						System.out.println("�׸� ����");
						break;
						}
					if(i ==0) {
						arr[0] = str;
						}
					if(i<arr.length && i > 0) {
						arr[i] = str;
					}
				}
						
			}
		}
			
			if(j == 2) {
				System.out.println("��� >> " + length());
				}
			if(j==3) {
				System.out.println("ä���� ��>>" + capacity());
						
			 	}
		if(j==4) {
			pop();
		}
		
	}
	}
}


public class ClassEx107 {
	public static void main(String[] args) {

		StringStack s = new StringStack();
		s.run();	// ���α׷� ���� ����
		System.out.println(s.length());
		System.out.println(s.capacity());
	}
}
