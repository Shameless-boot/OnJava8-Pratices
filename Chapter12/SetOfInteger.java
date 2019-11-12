import java.util.*;

class SetOfInteger{
	public static void main(String[] args) {
		Random rand = new Random();
		Set<Integer> intset = new HashSet<>();
		for (int i = 1000; i > 0 ; i--) {
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
	}
}