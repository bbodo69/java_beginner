package java191112;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean power = false;
		
		
		while(true) {
			
			String str = sc.nextLine();
			
			if(str.equals("power")) {
				power =! power;
				if(power == true) {
				System.out.println("������ �������ϴ�.");
					}else {System.out.println("������ �������ϴ�.");
				}
			}
		}
		

	}

}
