import java.util.stream.IntStream;
class Solution {
    public int[] solution(int n, int k) {
        return IntStream.range(1, (n/k)+1).map(i -> i*k).toArray();
    }
}