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
				System.out.println("전원이 켜졌습니다.");
					}else {System.out.println("전원이 꺼졌습니다.");
				}
			}
		}
		

	}

}
