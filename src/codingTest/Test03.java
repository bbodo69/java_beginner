package codingTest;

import java.util.Vector;

public class Test03 {
	static int max(int a, int b) {
		return a<b?b:a;
	}

	public static void main(String[] args) {
		
			
				
						
		        int[] answers = {1, 3, 2, 4, 2};
		        
		        int idx = answers.length;
			        
			        int [] st1 = new int [idx];
			        int [] st2 = new int [idx];
			        int [] st3 = new int [idx];
			        
			        
			        for(int i = 0 ; i < idx ; i++){
			            st1[i] = i%5+1;
			            
			            }
			            
			         for(int i = 0 ; i < idx ; i++){
			            if(i%8==1) {
				            	st2[i] = 1;
				            }else if(i%8==3) {
				            	st2[i] = 3;
				            }else if(i%8==5) {
				            	st2[i] = 4;
				            }else if(i%8==7) {
				            	st2[i] = 5;
				            }else if(i%2==0) {
				            	st2[i] = 2; 	
				            }
			        }
			        
			        for(int i = 0 ; i < idx ; i++){
			        	if(i%10==0 || i%10==1) {
			            	st3[i] = 3;
			            }else if(i%10==2 || i%10==3) {
			            	st3[i] = 1;
			            }else if(i%10==4 || i%10==5) {
			            	st3[i] = 2;
			            }else if(i%10==6 || i%10==7) {
			            	st3[i] = 4;
			            }else if(i%10==8 || i%10==9) {
			            	st3[i] = 5;
			            }
			        }
		        int count1 = 0;
			    int count2 = 0;
			    int count3 = 0;			      
			    int idx2 = 0;
			    int [] arr1 = new int [3];
			    
				    
			        for(int i = 0 ; i < idx ; i++){
			        	if(st1[i] == answers[i]) {
			        		count1 += 1;
			        	}if(st2[i] == answers[i]) {
			        		count2 += 1;
			        	}if(st3[i] == answers[i]) {
			        		count3 += 1;
		        	
		                }
		                
		        		
		                
		            }
			        System.out.println(count1);
			        System.out.println(count2);
			        System.out.println(count3);
			        int maxScore = Test03.max(count1, Test03.max(count2, count3));
			        int idx3= 0;
			        
			        
			        System.out.println(maxScore);
			      
			        
			        arr1[0] = count1;
			        arr1[1] = count2;
			        arr1[2] = count3;		
			        
			        for(int i = 0 ; i < arr1.length ; i++) {
			        	if(arr1[i]==maxScore) {
			        		idx3++;			        		
			        	}
			        }
			        Vector<Integer> v = new Vector<Integer>();
			        for(int i = 0 ; i < idx3 ; i++) {
			        	v.add((i+1));
			        }
			        
			        
			        
			        System.out.println(v.get(0));
			        System.out.println(v.get(1));
			        System.out.println(v.get(2));
			       
			        int [] answer = new int [v.size()];
			        			        
			        
			        for(int i = 0 ; i < answer.length ; i++) {
			        	answer[i] = v.get(i);
			        }
			   
///////////////////////////////////////////////////////			        
			  
		}

	}


