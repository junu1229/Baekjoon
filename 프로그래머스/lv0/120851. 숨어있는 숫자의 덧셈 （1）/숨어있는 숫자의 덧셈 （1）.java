class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[a-zA-Z]", "");
        for(int i = 0; i<str.length(); i++) {
            answer += Character.getNumericValue(str.charAt(i));
        }
        return answer;
    }
}