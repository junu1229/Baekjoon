class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char[] arr = new char[my_string.length()*n];
        for(int i = 0; i<my_string.length(); i++) {
            for(int j = 0; j<n; j++) {
                arr[n*i+j] = my_string.charAt(i);
            }
        }
        answer = String.valueOf(arr);
        return answer;
    }
}