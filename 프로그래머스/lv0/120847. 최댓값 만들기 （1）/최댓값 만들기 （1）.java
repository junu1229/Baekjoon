class Solution {
    public int solution(int[] numbers) {
        int a = 0;
        int b = 0;
        for(int number:numbers) {
            if(number>a) {
                a = number;
            }
        }
        for(int number:numbers) {
            if(number>b && number!=a) {
                b = number;
            }
        }
        if(a==0||b==0){
            if(a>b){
                b = a;
            } else {
                a = b;
            }
        }
        return (a*b);
    }
}