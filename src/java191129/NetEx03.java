package java191129;

import java.net.URL;
import java.util.Scanner;

public class NetEx03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String urlstr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("URL 입력>> ");
		urlstr = sc.nextLine();
				
		URL url = new URL(urlstr);
		System.out.println(url);
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("프로토콜 : " + url.getPort());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("ULF 내용 : "+url.getContent());
		System.out.println("파일 경로" + url.getFile()	);
		System.out.println("URL전체경로 : " + url.toExternalForm());
			

	}

}
