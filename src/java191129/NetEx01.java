package java191129;

import java.net.InetAddress;

public class NetEx01 {
	public static void main(String[] args) throws Exception {

		InetAddress addr1 = InetAddress.getByName("google.com");	//ȣ��Ʈ IP �ּҸ� ������
		System.out.println(addr1);
		InetAddress addr2 = InetAddress.getLocalHost();					//�� PC IP �ּҸ� ������
		System.out.println(addr2);
		InetAddress addr3 = InetAddress.getByName("naver.com");
		System.out.println(addr3);
		
	}

}