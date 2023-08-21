class Solution {
    public int solution(int hp) {
        int i = hp/5;
        int j = hp%5/3;
        int k = hp%5%3;
        return i+j+k;
    }
}