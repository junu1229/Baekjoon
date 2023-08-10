import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
		Map<Character, Character> map = new HashMap<>();
		map.put('A', 'B');
		map.put('B', 'A');
		for(int i = 0; i<pat.length(); i++) {
			sb.append(map.get(pat.charAt(i)));
		}
        return myString.contains(sb.toString()) ? 1 : 0;
    }
}