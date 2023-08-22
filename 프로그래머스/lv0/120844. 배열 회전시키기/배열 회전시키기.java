import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        return IntStream.range(0, numbers.length).map(i -> direction.equals("right")?(i==0?numbers[numbers.length-1]:numbers[i-1]):(i==numbers.length-1?numbers[0]:numbers[i+1])).toArray();
    }
}