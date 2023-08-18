import java.util.Arrays;
class Solution {
    public String[] solution(String[] names) {
        int length = names.length%5==0? names.length/5:names.length/5+1;
		String[] answer = new String[length];
		for(int i = 0; i<length; i++) {
			answer[i] = names[5*i];
		}
        return answer;
    }
}