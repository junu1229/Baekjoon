import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list) {
        int[] temp = Arrays.stream(num_list).sorted().toArray();
		return IntStream.range(0, 5).map(i -> temp[i]).sorted().toArray();
    }
}