class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        double a = num1;
        double b = num2;
        
        if(num1>0&&num1<=100&&num1>0&&num1<=100){
            answer = ((a/b)*1000);
        }
        
        return (int)answer;
    }
}