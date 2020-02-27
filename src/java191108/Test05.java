package java191108;

import java.util.Scanner;

public class Test05 {
	
	Scanner sc = new Scanner(System.in);
	
	static int a = 5;
	int b = 10;

	
	void sum(int c, int d) {
		System.out.println(c+d);
		
	}
	
	void avg(double c, double d) {
		System.out.println((c+d)/2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Test05 test = new Test05();
		
		test.sum(5, 10);
		test.avg(4, 9);
		
	}

}
