import java.util.ArrayList;
class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
		ArrayList<String> b = new ArrayList<>();
		for(String a:arr) {
			if(!a.isBlank()) {
				b.add(a);
			}
		}
		String[] solution = new String[b.size()];
		for(int i = 0; i<b.size(); i++) {
			solution[i] = b.get(i);
		}
        return solution;
    }
}