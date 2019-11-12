import java.util.*;

class CollectionSequence extends AbstractCollection<Pet>{
	private Pet[] pets = Pets.array(8);

	@Override
	public int size() {
		return pets.length;
	}

	@Override 
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>() {
			private int index = 0;

			 @Override
		     public boolean hasNext() {
		       return index < pets.length;
		     }
		     @Override
		     public Pet next() { return pets[index++]; }
		     @Override
		     public void remove() { // Not implemented
		       throw new UnsupportedOperationException();
		     }

		};
	}

	public static void main(String[] args) {
		CollectionSequence cs = new CollectionSequence();
		InterfaceVsIterator.display(cs);
		InterfaceVsIterator.display(cs.iterator());
	}
}	