package java191122;

import java.util.Scanner;

public class ExceptionEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3�� �Է�");
		int sum = 0 ,n = 0;
		try{for(int i = 0 ; i < 3 ; i ++) {
			System.out.println(i+">>");
			try{
				n = sc.nextInt();
			}catch(Exception e) {
				
			}
		
			sum += n;
		}System.out.println("���� : " + sum);

	}

}
