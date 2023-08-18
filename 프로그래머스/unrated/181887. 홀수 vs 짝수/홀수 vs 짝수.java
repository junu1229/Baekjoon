import java.util.stream.IntStream;
class Solution {
    public int solution(int[] num_list) {
        int a = IntStream.range(0, num_list.length).map(i -> i%2==0? num_list[i]: 0).sum();
		int b = IntStream.range(0, num_list.length).map(i -> i%2==1? num_list[i]: 0).sum();
        return a>b? a:b;
    }
}