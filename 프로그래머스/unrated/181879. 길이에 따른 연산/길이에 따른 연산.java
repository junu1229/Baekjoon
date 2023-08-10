import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        for(int num: num_list) {
            answer *=num;
        }
        return num_list.length>10 ? Arrays.stream(num_list).sum() : answer;
    }
}