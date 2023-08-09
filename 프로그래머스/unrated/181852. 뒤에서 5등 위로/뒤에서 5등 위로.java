import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.range(5, num_list.length).map(i -> Arrays.stream(num_list).sorted().toArray()[i]).toArray();
    }
}