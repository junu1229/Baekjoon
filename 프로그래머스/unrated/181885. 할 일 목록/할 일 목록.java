class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
       int length = 0;
		
		for(boolean b:finished) {
			if(!b) {
				length++;
			}
		}
        int j = 0;
		String[] answer = new String[length];
		for(int i = 0; i<todo_list.length; i++) {
		
			if(!finished[i]) {
				answer[j] = todo_list[i];
				j++;
			}
		}
        return answer;
    }
}