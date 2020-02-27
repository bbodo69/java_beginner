package java191111;

import java.util.Scanner;

public class MyPlay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
//		int n = Integer.parseInt(sc.nextLine());
		int n = 55;
		int sum = 0;
		for(int i = 0 ; i <= n ; i ++) {
			if(n%i==0) {
				sum =sum +  i;
			}
			
		}System.out.println(sum);

		sc.close();
		
	
	}

}
