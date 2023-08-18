class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++) {
			int temp = (int)my_string.charAt(i);
			if (temp>90) {
				answer += Character.toUpperCase(my_string.charAt(i));
			} else {
				answer += Character.toLowerCase(my_string.charAt(i));
			}
		}
        return answer;
    }
}