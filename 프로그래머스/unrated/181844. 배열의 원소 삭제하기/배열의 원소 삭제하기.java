import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer;
        List list = new ArrayList();
        int k = 1;
        for(int i = 0; i < arr.length; i++) {
        	k = 0;
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                	k = 1;
                    break;
                }
            }
            if(k==0) {
            	list.add(arr[i]);
            }
        }

        answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)list.get(i);
        }
        return answer;
    }
}