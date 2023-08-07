class Solution {
    public int solution(String my_string, String is_prefix) {
        if (is_prefix.length()<=my_string.length()) {
        return is_prefix.equals(my_string.substring(0, is_prefix.length())) ? 1:0;
        } 
        return 0;
    }
}