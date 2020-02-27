package java191129;

import java.net.InetAddress;

public class NetEx01 {
	public static void main(String[] args) throws Exception {

		InetAddress addr1 = InetAddress.getByName("google.com");	//호스트 IP 주소를 가져옴
		System.out.println(addr1);
		InetAddress addr2 = InetAddress.getLocalHost();					//내 PC IP 주소를 가져옴
		System.out.println(addr2);
		InetAddress addr3 = InetAddress.getByName("naver.com");
		System.out.println(addr3);
		
	}

}