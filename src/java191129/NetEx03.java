package java191129;

import java.net.URL;
import java.util.Scanner;

public class NetEx03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String urlstr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("URL �Է�>> ");
		urlstr = sc.nextLine();
				
		URL url = new URL(urlstr);
		System.out.println(url);
		System.out.println("�������� : " + url.getProtocol());
		System.out.println("�������� : " + url.getPort());
		System.out.println("ȣ��Ʈ : " + url.getHost());
		System.out.println("ULF ���� : "+url.getContent());
		System.out.println("���� ���" + url.getFile()	);
		System.out.println("URL��ü��� : " + url.toExternalForm());
			

	}

}
