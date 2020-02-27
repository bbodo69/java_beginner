package java191126;

import java.util.Stack;

//���ͳ� �������� �ڷ�/������ ���� ��ɸ� ����

public class StackEx02 {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	//���� ������ ���� ���
	public static void status() {
		System.out.println("back : " + back);
		System.out.println("���������� : " + back.peek());
		System.out.println("forward : " + forward);
	}
	
	//�� ������ �̵�
	public static void goURL(String url) {
		back.push(url);	//back�� peek�� ������������ �ɰ� -> �̵��ϸ� back�� �ױ�
		if(!forward.empty()) {
			forward.clear(); 												//�� �ּҷ� �̵��� ������ ���� forward ��� ����.
		}
	}
	//�ڷΰ���
	public static void goBack() {
		if(!back.empty()) {							//������ ���� �������� ������� ������ pop.
		forward.push(back.pop());
		}		
	}
	//������ ����
	public static void goForward() {
		if(!forward.empty()) {
		back.push(forward.pop());
		}
	}
	
	
	
	public static void main(String[] args) {

		goURL("1. ����");								//�ּ�â : www.google.com
		goURL("2. ���̹�");
		goURL("3. ����");
		goURL("4. StackoverFlow");
		
		

	}

}
