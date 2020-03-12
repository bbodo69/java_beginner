package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cloth {

	    public int solution(int n, int[] lost, int[] reserve) {
			
			int answer = 0;
			int count = 0;
			
			int [] students = new int [n];

			// �� �л� �迭 ����				
			for (int i = 0 ; i < students.length ; i ++) {
				students[i] = i+1;
			}		
			
			// �� �л� �� - �Ȱ����� �л� ��
			for (int i = 0 ; i < students.length ; i ++) {
				for (int j = 0 ; j < lost.length ; j ++) {
					if(students[i] == lost[j]) {
						students[i] = 0;
					}
				}
			}
			
			// ������ �� �л��� + �߰��� ������ �ִ� �л�,   ���� ��
			int [] total = new int[students.length + reserve.length];
			System.arraycopy(students, 0, total, 0, students.length);
			System.arraycopy(reserve, 0, total, students.length, reserve.length);
			
			// ����
			Arrays.sort(total);
			
			List borrowList = new ArrayList(); // ���� �׷�
			int idx = 0;
			// �� ���� �л��鿡�� ������ �� �� �ִ��� �˻� �� ���� ��ȣ �׸� ���� ����� ������ �ֱ�.
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
			
			// ��ܽ����� �����ټ� �ִ��� �˻�
			
			// 2�� ���ӵ� �� ã���ֱ�
			for(int i = 0 ; i < total.length-1 ; i++) {
				if(total[i] == total[i+1]) {
					// �ش� ���ڿ��� ������ ���� ��ȣ ã��
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
			
			// �Ҿ���� �л� ī��Ʈ 
			for (int i = 0 ; i < total.length-1 ; i ++) {
				if(total[i] == 0) {
					count +=1;
				}
			}
	        
			
			// �� �� ������ �ִ� �л��� ī��Ʈ 
			for (int i = 0 ; i < total.length-1 ; i ++) {
				if(total[i] == total[i+1] && total[i] != 0) {
					count +=1;
				}
			}
			
			
			answer = total.length-count+borrowList.size();
			System.out.println(answer + " ��");
			
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
