package Quit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/*
Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아
ArrayList에 저장하고, ArrayList를 검색하여 학점을 
점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
평균을 출력하는 프로그램을 작성하세요.
실행예시:
	6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>	 A C A B F D
	2.3333333333333335
*/
public class CollectionEx04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		ArrayList<String> al = new ArrayList<String>();
		Vector<Double> v = new Vector<Double>();
		System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>	 A C A B F D");
		
		str = sc.nextLine();
		al.add(str);
		String [] arr = new String [str.length()]; 
				
		for(int i = 0 ; i<str.length() ; i++) {
			arr[i] = str.substring(i, i+1);
		}
		
		double total = 0;
		for(int i = 0 ; i < 6 ; i++) {
			if(arr[i].equals("A")) {
				total += 4.0;
			}else if(arr[i].equals("B")) {
				total += 3.0;			
			}else if(arr[i].equals("C")) {
				total += 2.0;				
			}else if(arr[i].equals("D")) {
				total += 1.0;				
			}else if(arr[i].equals("F")) {
				total += 0.0;				
		}

	}System.out.println(total/6);
	}
}
