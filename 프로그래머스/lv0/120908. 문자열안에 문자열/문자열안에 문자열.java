class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        String a = str1.replaceAll(str2, "");
		if(str1.equals(a)) {
			answer = 2;
		} else {
			answer = 1;
		}
        return answer;
    }
}