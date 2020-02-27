package codingTest;

class Solution {
	
	long start = System.currentTimeMillis();
	
    public String solution(String[] participant, String[] completion) {   
    	String answer = "";
        
        for(int i = 0 ; i <completion.length ; i++){
            for(int j = 0 ; j <participant.length ; j++){
                if(participant[j].equals(completion[i])){
                	System.out.println(participant[j]);
                	participant[j]="A";
                	completion[i]="B";
                	break;
                }
            }
        }
        for(int i = 0 ; i < participant.length ; i++){
            if(!participant[i].equals("A")){
                answer = participant[i];
            }
        }
        long endTime = System.currentTimeMillis();
        
        System.out.println("시작 시간 : "+start+"        끝시간 : "
        							+endTime+"        걸린 시간 : "+(endTime-start));
        return answer;
        
    }
}

//import java.util.Map;
//import java.util.Set;
//import java.util.Iterator;
//import java.util.HashMap;
//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        Map<String, Integer> partMap = new HashMap<String, Integer>();    
//        Map<String, Integer> compMap = new HashMap<String, Integer>();   
//
//        for (String part : participant) {
//            if (partMap.containsKey(part)) {
//                partMap.put(part, partMap.get(part) + 1);
//            } else {
//                partMap.put(part, 1);
//            }
//        }
//        for (String comp : completion) {
//            if (compMap.containsKey(comp)) {
//                compMap.put(comp, compMap.get(comp) + 1);
//            } else {
//                compMap.put(comp, 1);
//            }
//        }
//        Set<String> partSet = partMap.keySet();
//        Iterator<String> partIt = partSet.iterator();
//
//        while (partIt.hasNext()) {
//            String name = partIt.next();
//            Integer partInt = partMap.get(name);
//            Integer compInt = compMap.get(name);
//
//            if (partInt != compInt) {
//                answer = name;
//            }
//        }
//
//        return answer;
//    }
//}


public class Test01 {
	public static void main(String[] args) {

		Solution s = new Solution();
		
		String[] participant = {"abc", "kiki", "eden", "eden"};
		String[] completion = {"eden", "kiki", "abc"};
		System.out.println(s.solution(participant, completion));

	}
}
	