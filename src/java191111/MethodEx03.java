package java191111;

import java.util.Scanner;



class Tv{
	
	
	boolean turnOnOff = false;
	int ch = 0;
	int vol = 0;
	int chChange = 0;
//	int chChange =
	
	void chUp() {
		ch++;
	}
	
	void chDown() {
		ch--;
	}
	void chChange(int i) {
		ch = i;
	}
	
	
}

public class MethodEx03 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		Tv t = new Tv();
		
		t.chChange(sc.nextInt());
		System.out.println( t.ch+" ¹ø");
	
		
	}

}
