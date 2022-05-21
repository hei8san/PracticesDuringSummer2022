import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int firstUniqChar(String s) {
		Map<Character, Integer> input = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (!input.containsKey(current)) {
				input.put(current, i);
			} else {
				input.put(current, -1);
			}
		}

		int min = Integer.MAX_VALUE;
		for (char c : input.keySet()) {
			if (input.get(c) != -1) {
				min = Math.min(input.get(c), min);
			}
		}
		
		return min == Integer.MAX_VALUE ? -1 : min;
		

	}
}
