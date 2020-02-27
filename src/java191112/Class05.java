package java191112;

import java.util.Scanner;

public class Class05 {
	
	static long factorial(int n) {
		
		if(n == 1) {
			return 1;
		}else {
		return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
			int n = Integer.parseInt(sc.nextLine());
			long result = factorial(n);
			System.out.println(result);
		
	}

}
