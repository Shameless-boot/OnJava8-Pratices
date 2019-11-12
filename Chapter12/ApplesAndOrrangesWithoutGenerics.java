import java.util.*;
class Apple{
	private static long counter;
	private final long id = counter++;
	public long id(){ return id; }
}

class Orrange{ }

public class ApplesAndOrrangesWithoutGenerics{
	public static void main(String[] args){
		ArrayList<Apple> apples = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		//apples.add(new Orrange());
		for (Object apple :apples) {
			((Apple)apple).id();
		}
	}
}