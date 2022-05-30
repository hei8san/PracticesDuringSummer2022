import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
		for (int i = 0; i < rocks.length; i++) {
			rocks[i] = capacity[i] - rocks[i]; // assign the capacityOfRocksValue to rocks array
		}
		Arrays.sort(rocks);
		int count = 0;
		for (int val : rocks) {
			if (val == 0) {
				count++;
				continue;
			}
			if (val > additionalRocks)
				break;
			if (val <= additionalRocks) {
				additionalRocks -= val;
				count++;
			}
		}
		return count;
	}

	public int maximumBagsTest(int[] capacity, int[] rocks, int additionalRocks) {
		HashMap<Integer, Integer> map = new HashMap<>(); // index, capacity
		int size = capacity.length;
		for (int i = 0; i < size; i++) {
			map.put(i, capacity[i] - rocks[i]);

		}
		System.out.println(map.toString());

		while (additionalRocks > 0) {
			int tempMinCapacity = 0;
			for (int i = 0; i < size; i++) {
				if (map.get(i) != 0) {
					int tempaR = additionalRocks;
					additionalRocks -= map.get(i);
					if (map.get(i) - tempaR <= 0) {
						map.put(i, 0);
					}

					tempMinCapacity = -1;
				}

			}
			if (tempMinCapacity == 0)
				break;

		}
		System.out.println(map.toString());
		int ans = 0;
		for (int i : map.keySet()) {
			if (map.get(i) == 0)
				ans++;
		}
		return ans;

	}

}
