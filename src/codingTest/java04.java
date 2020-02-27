package codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class java04 {
	
	void a() {
		
	}
	
	String a = "abc";
	
	static int a(int b, int c) {
		return b+c;
	}
	
	static String run(int speed) {
		return "제한 속도는  "+speed+" km ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(java04.run(100));
		
		

		ArrayList<Integer> lotto = new ArrayList<Integer>();
		Random random;
				
		for(int i = 0; i<6 ; i++) {
			random = new Random();
			lotto.add(random.nextInt(45));
		}		
//		for(int i = 0 ; i < 6 ; i++) {
//			for(int j = 0 ; j < 6 ; j++) {
//				lotto.get(i);
//			}
//		}
		Collections.sort(lotto);
		
		for(int i = 0; i<6 ; i++) {
			System.out.println(lotto.get(i));
		}
		
		
		
		
	}

}
