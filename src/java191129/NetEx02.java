package java191129;

import java.net.InetAddress;
import java.util.Scanner;

public class NetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("������Ʈ �ּ� �Է� >>> ");
			url = sc.nextLine();
			InetAddress [] addr = InetAddress.getAllByName(url);
			System.out.println("==========");
			System.out.println(url + "�� " + addr.length + "���� IP�ּҸ� ���� �ֽ��ϴ�.");
			for(int i = 0 ; i < addr.length ; i++) {
				System.out.println("IP �ּ� : " + addr[i].getHostAddress());
			}
			
		}catch (Exception e) {
		e.printStackTrace();

	}

}
}
