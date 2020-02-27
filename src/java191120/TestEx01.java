package java191120;

import java.util.Scanner;

public class TestEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 수 입력 >>");
		
		int b = sc.nextInt();
		
		String [] arr = new String [b];
		sc.nextLine();
		
		System.out.println("배열 수는 "+ arr.length + "입니다.");
		String str;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
	
			str = sc.nextLine();
			System.out.print("내용 입력 >>");
System.out.println(i);
//			System.out.println(arr[0]);
//			System.out.println(i+arr[i]);
			}
			
			
		}
		
		
	}


