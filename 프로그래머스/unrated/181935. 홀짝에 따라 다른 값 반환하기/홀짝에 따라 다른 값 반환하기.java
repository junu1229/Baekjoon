import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        return n%2==0?IntStream.rangeClosed(0, n).filter(i -> i%2==0).map(i -> i*i).sum():IntStream.rangeClosed(0, n).filter(i -> i%2==1).sum();
    }
}