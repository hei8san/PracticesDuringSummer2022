
public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] capacity = {2,3,4,5};
		int[] rocks = {1,2,4,4};
		int additionalRocks = 2;
		
		System.out.println(s.maximumBags(capacity, rocks, additionalRocks));

	}

}
