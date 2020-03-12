package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cloth {

	    public int solution(int n, int[] lost, int[] reserve) {
			
			int answer = 0;
			int count = 0;
			
			int [] students = new int [n];

			// 총 학생 배열 생성				
			for (int i = 0 ; i < students.length ; i ++) {
				students[i] = i+1;
			}		
			
			// 총 학생 수 - 안가져온 학생 수
			for (int i = 0 ; i < students.length ; i ++) {
				for (int j = 0 ; j < lost.length ; j ++) {
					if(students[i] == lost[j]) {
						students[i] = 0;
					}
				}
			}
			
			// 가지고 온 학생들 + 추가로 가지고 있는 학생,   본인 옷
			int [] total = new int[students.length + reserve.length];
			System.arraycopy(students, 0, total, 0, students.length);
			System.arraycopy(reserve, 0, total, students.length, reserve.length);
			
			// 정렬
			Arrays.sort(total);
			
			List borrowList = new ArrayList(); // 빌린 그룹
			int idx = 0;
			// 양 옆의 학생들에게 나누어 줄 수 있는지 검사 후 빌린 번호 그릅 새로 만들어 나누어 주기.
			for (int i = 1 ; i < total.length-1 ; i ++) {
				if(total[i]==total[i+1]) {
					if((total[i]-1 != total[i-1]) && total[i] != 0) {
						borrowList.add(idx, total[i]-1);
						System.out.println(borrowList.get(idx));
						total[i] = 0;					
						idx += 1; 
//						total[i] = total[i]-1;					
					}else if((total[i+1]+1 != total[i+2]) && total[i] != 0) {
						borrowList.add(idx, total[i+1]+1);
						total[i+1] = 0;					
						idx += 1;					
//						total[i+1] = total [i+1] +1;				
					}
				}
			}
			
			// 계단식으로 빌려줄수 있는지 검사
			
			// 2개 연속된 수 찾아주기
			for(int i = 0 ; i < total.length-1 ; i++) {
				if(total[i] == total[i+1]) {
					// 해당 숫자에서 밑으로 없는 번호 찾기
					int cnt = i;					
					while(true) {
						if(cnt > 0 && total[cnt]-1 != total[cnt-1]) {
							break;
						}else {
							System.out.println(total[cnt]-1+"dddd");
							break;
						}
					}
				}
			}
			
			
			
			for(int i = 0 ; i < total.length ; i ++) {
				if (total[i] != 0) {
					System.out.print(total[i]+" ");
				}
			}
			
			System.out.println();
			
			for(int i = 0 ; i < borrowList.size() ; i ++) {				
				System.out.print(borrowList.get(i)+" ");
			}
						
			System.out.println();
			
			// 잃어버린 학생 카운트 
			for (int i = 0 ; i < total.length-1 ; i ++) {
				if(total[i] == 0) {
					count +=1;
				}
			}
	        
			
			// 두 개 가지고 있는 학생들 카운트 
			for (int i = 0 ; i < total.length-1 ; i ++) {
				if(total[i] == total[i+1] && total[i] != 0) {
					count +=1;
				}
			}
			
			
			answer = total.length-count+borrowList.size();
			System.out.println(answer + " 개");
			
			return answer;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] lost = {1,2,3,6,5};
		int [] reserve = {3,4,5};
		
		Cloth a = new Cloth();
		
		a.solution(10, lost, reserve);
				
	}

}
