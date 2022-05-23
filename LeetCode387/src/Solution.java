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
	
	public int firstUniqCharTest(String s) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i =0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, -1);
			}else {
				map.put(c, i);
			}
			
		}
		
		int min = Integer.MAX_VALUE;
		
		for(char c : map.keySet()) {
			if(map.get(c) != -1) {
				min = Math.min(map.get(c), min);
			}
		}
		if(min != Integer.MAX_VALUE) {
			return min;
		}else {
			return -1;
		}
		
		
		
	}
}










