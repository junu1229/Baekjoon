import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int a = 1;
		for (int i = 0; i<num_list.length; i++) {
			a *= num_list[i];
		}
		int b = Arrays.stream(num_list).sum();
        return a > b*b ? 0 : 1;
    }
}