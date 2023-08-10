class Solution {
    public int solution(int[] num_list) {
        String a = "";
		String b = "";
		for(int c:num_list) {
			if(c%2==0) {
				a += Integer.toString(c);
			} else {
				b += Integer.toString(c);
			}
		}
        return Integer.parseInt(b)+Integer.parseInt(a);
    }
}