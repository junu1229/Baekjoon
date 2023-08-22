import java.util.stream.IntStream;
class Solution {
    public int[] solution(String my_string) {
        return IntStream.range(0, my_string.length()).map(i ->  (Integer.valueOf(my_string.charAt(i))-48)).filter(i -> i<10).sorted().toArray();
    }
}