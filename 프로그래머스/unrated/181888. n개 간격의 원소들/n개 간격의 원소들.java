import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length%n==0? num_list.length/n : (num_list.length/n)+1).map(i -> num_list[i*n]).toArray();
    }
}