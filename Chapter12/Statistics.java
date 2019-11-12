import java.util.*;

class Statistics {
	public static void main(String[] args) {
		Random rand = new Random();
		Map<Integer,Integer> hm = new HashMap<>();

		for (int i = 0; i < 10000; i++) {
			int r = rand.nextInt(20);
			hm.put(r, hm.containsKey(r) == false ? 1 : hm.get(r) + 1);
		}
		System.out.println(hm);
	}
}