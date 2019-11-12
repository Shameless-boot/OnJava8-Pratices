import java.util.*;
class SimpleCollection{
	public static void main(String[] args){
		Collection<Integer> c = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			c.add(i);
		}
		for(int i : c)
			System.out.println(i);
	}
}