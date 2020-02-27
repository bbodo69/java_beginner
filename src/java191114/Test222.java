package java191114;

import java.util.Scanner;

class Person22 {
	
	String name;
	String word;
	int a;
	Person22(){
		
	}
	
	
}


public class Test222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Person22 []  p = new Person22[10];
		
		p[0] = new Person22();
		p[1] = new Person22();
		p[2] = new Person22();
		p[3] = new Person22();
		p[4] = new Person22();
		p[5] = new Person22();
		p[6] = new Person22();
		p[7] = new Person22();
		p[8] = new Person22();
		p[9] = new Person22();
		
		
		p[0].word = "자동문문";
		p[1].word = "차고지";
		p[2].word = "지동차";
		
		
		
		
//		for(int i = 0 ; i < 5 ; i++) {
		
//		System.out.println("다음 단어를 입력");
		
//		p[i].word = sc.nextLine();
		System.out.println(p[0].word.charAt(p[0].word.length()-3));
//		if(p[i].word.charAt(0)!=p[i-1].word.charAt(3)) {
		
		
		
		for(int i = 0 ; i < 10 ; i++) {
			
			p[i].a = Integer.parseInt(sc.nextLine());
			System.out.println(i);
			if(p[i].a == 1) {
				break;
			}
			if(p[i].a == 5) {
				i = 0 ;
			}
		}
			
		}
		
		
		
		
	}


