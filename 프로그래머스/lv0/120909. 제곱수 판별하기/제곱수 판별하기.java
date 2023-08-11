import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        return IntStream.range(0, n).map(i->i).filter(i-> i*i==n).sum()==0? 2:1;
    }
}