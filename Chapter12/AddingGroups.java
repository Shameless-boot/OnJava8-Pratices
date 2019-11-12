//adding groups of elements to Collection objects
import java.util.*;
class AddingGroups{
	public static void main(String[] args){
		Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts = {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection,11,12,13,14,15);
		Collections.addAll(collection,moreInts);
		for(int i : collection)
			System.out.println(i);
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		list.set(1,99);
		list.add(20);
		for(int i : list)
			System.out.println(i);
	}
}