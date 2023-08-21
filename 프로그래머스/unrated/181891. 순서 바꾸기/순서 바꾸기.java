class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int k = 0;
        for(int i = 0; i<num_list.length; i++) {
			if(num_list.length-(n+i)>0) {
				answer[i] = num_list[i+n];
			} else {
				answer[i] = num_list[k];
				k++;
			}
		}
        return answer;
    }
}