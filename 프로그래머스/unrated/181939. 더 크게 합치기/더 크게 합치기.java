class Solution {
    public int solution(int a, int b) {
        int aint = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
		int bint = Integer.parseInt(Integer.toString(b)+Integer.toString(a));
        return aint>=bint? aint : bint;
    }
}