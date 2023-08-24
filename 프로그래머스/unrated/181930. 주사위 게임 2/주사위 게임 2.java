class Solution {
    public int solution(int a, int b, int c) {
        int caseA = a+b+c;
		int caseB = (a+b+c)*((a*a)+(b*b)+(c*c));
		int caseC = (a+b+c)*((a*a)+(b*b)+(c*c))*((a*a*a)+(b*b*b)+(c*c*c));
		if(a==b) {
			if(a==c) {
				return caseC;
			} else {
				return caseB;
			}
		} else {
			if (b==c) {
				return caseB;
			} else if(c==a){
				return caseB;
			} else {
                return caseA;
            }
		}
        
    }
}