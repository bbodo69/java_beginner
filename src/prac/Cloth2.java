package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cloth2 {
	

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
			
			// 계단식으로 빌려줄수 있는지 검사
				
			// 2개 연속된 수 찾아주기
			for(int i = 0 ; i < total.length-1 ; i++) {
				if(total[i] > 0 && total[i] == total[i+1]) {
					// 해당 숫자에서 밑으로 없는 번호 찾기
					int cnt = i;					
					while(true) {
						System.out.println("1111");
						if(total[cnt]-1 == total[cnt-1]) {
							cnt -= 1;
						}else if(total[cnt]-1 != total[cnt-1]) {		// 1차이가 아니라면
							
							int num = total[i];
							int num2 = total[cnt];														
							for(int j = 0 ; j < num-num2 ; j++) {	
								System.out.println(total[i] + " = total[i] || " +total[cnt] + " = total[cnt]");
								borrowList.add(num-(j+1));
							}
							total[num] = 0;					
							break;							
						}else if(cnt == 1){
							while(true) {
								System.out.println("2222");
								if(total[cnt+1]+1 != total[cnt+2]) {		// 1차이가 아니라면		
									int num = (total[cnt+1]+1)-total[i+1] ;
									int num2 = total[cnt+1]+1;														
									for(int j = 0 ; j < num ; j++) {								
										borrowList.add(num+j-1+num2);
										total[i+1+j] = 0;
									}
									break;
								}else if(cnt+2 == total.length) {
									break;
								}										
							}
						}				
					}
				}
			}
			
			
			
			for(int i = 0 ; i < total.length ; i ++) {
				if (total[i] != 0) {
					System.out.print(total[i]+" ");
					System.out.println(" 있는 친구들");
				}
			}
			
			System.out.println();
			
			for(int i = 0 ; i < borrowList.size() ; i ++) {				
				System.out.print(borrowList.get(i)+" ");
				System.out.println(" 빌린 친구들");
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

		int [] lost = {1,3,5};
		int [] reserve = {2,3,4};
		
		Cloth2 a = new Cloth2();
		
		a.solution(6, lost, reserve);
				
	}

}
