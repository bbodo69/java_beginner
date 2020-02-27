package codingTest;

import java.lang.reflect.Array;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String answer = " ";
		
		String s = "asdasadasd";
		int [] arr = new int[s.length()];
		String [] arr1 = new String[s.length()];
		int tmp = 0;
		
		for(int i = 0 ; i < s.length() ; i++) {
			arr[i] = (int)s.charAt(i);
		}
				
		
		for(int i = 0 ; i < s.length() ; i++) {
			for(int j = 0 ; j < s.length() ; j++) {
				if(arr[i] < arr[j]) {
					tmp = arr[j];
					arr[j]=arr[i];
					arr[i]=tmp;
				}
			}
		}
		for(int i = 0 ; i < s.length() ; i++) {
			arr1[i] = String.valueOf(arr[i]);
			System.out.print(arr1[i]);
		}
//		String str = arr1[0]
		
		
			
		}
		
		
		
	}


