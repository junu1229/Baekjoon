class Solution {
    public int[] solution(int[] array) {
        int k = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[k]<array[i]) {
				k = i;
			}
		}
		int[] answer = {array[k], k};
        return answer;
    }
}