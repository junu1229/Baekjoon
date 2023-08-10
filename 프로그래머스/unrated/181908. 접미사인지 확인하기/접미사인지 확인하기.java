class Solution {
    public int solution(String my_string, String is_suffix) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
		my_string = sb.append(my_string).reverse().toString();
        is_suffix = sb1.append(is_suffix).reverse().toString();
        
        return my_string.startsWith(is_suffix)? 1 : 0;
    }
}