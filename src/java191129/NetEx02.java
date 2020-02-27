package java191129;

import java.net.InetAddress;
import java.util.Scanner;

public class NetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("웹사이트 주소 입력 >>> ");
			url = sc.nextLine();
			InetAddress [] addr = InetAddress.getAllByName(url);
			System.out.println("==========");
			System.out.println(url + "는 " + addr.length + "개의 IP주소를 갖고 있습니다.");
			for(int i = 0 ; i < addr.length ; i++) {
				System.out.println("IP 주소 : " + addr[i].getHostAddress());
			}
			
		}catch (Exception e) {
		e.printStackTrace();

	}

}
}
