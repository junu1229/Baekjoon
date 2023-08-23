import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(int age) {
       Map<Character, String> map = new HashMap();
		String a = String.valueOf(age);
		String answer = "";
		map.put('0', "a");
		map.put('1', "b");
		map.put('2', "c");
		map.put('3', "d");
		map.put('4', "e");
		map.put('5', "f");
		map.put('6', "g");
		map.put('7', "h");
		map.put('8', "i");
		map.put('9', "j");
		for(int i =0; i<a.length(); i++) {
			answer += map.get(a.charAt(i));
		}
        return answer;
    }
}