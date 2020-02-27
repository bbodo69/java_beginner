package java191114;

import java.util.Scanner;

class Testtest{
	
	int i;
	String str;
	
	Testtest(int i, String str){
		this.i = i;
		this.str = str;
	}
}

public class TestEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int j = Integer.parseInt(sc.nextLine());
		String str1 = sc.nextLine();
		
		Testtest a = new Testtest(j,str1);
		System.out.println(a.i);
		System.out.println(a.str);
		
		
		
	}

}
