import java.util.*;
class Snow{ }
class Powder extends Snow { }
class Light extends Snow { }
class Heavy extends Snow { }
class Crusty extends Snow { }
class Slush extends Snow { }

public class AsListInterface{
	public static void main(String[] args){
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Heavy());
		//snow1.add(new Powder()); // Exception
		List<Snow> snow2 = new ArrayList<>();
		Collections.addAll(snow2,new Light(),new Light(), new Crusty());
		snow2.add(new Heavy());
		List<Snow> snow3 = Arrays.<Snow>asList(new Crusty(),new Light());
		//snow3.add(new Slush()); //Exception
	}
}