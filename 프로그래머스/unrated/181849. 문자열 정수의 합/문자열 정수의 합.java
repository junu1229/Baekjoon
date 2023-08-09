import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int solution(String num_str) {
        return Arrays.stream(IntStream.range(0, num_str.length()).map(i-> Character.getNumericValue(num_str.charAt(i))).toArray()).sum();
    }
}