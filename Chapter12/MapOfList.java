import java.util.*;

class MapOfList {
	public static final Map<Person, List< ? extends Pet>> petPeople = new HashMap<>();
	static {
		petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spt")));
		petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"),
								new Cat("Elsie May"), new Dog("Margrett")));
		petPeople.put(new Person("Marilyn"), Arrays.asList(new Pug("Louie"),
								new Cat("Stanford"), new Cat("Pinkola")));
		petPeople.put(new Person("Luke"), Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
	}

	public static void main(String[] args) {
		/*System.out.println("People: " + petPeople.keySet());
		System.out.println("Pets: " + petPeople.values());
		for(Person person : petPeople.keySet()) {
			System.out.println(person + " has : ");
			for (Pet pet : petPeople.get(person)) {
				System.out.println("	" + pet);
			}
		}*/
		Map<Person, List< ? extends Pet>> hoster = new HashMap<>();
		List<Pet> list = new ArrayList<>();
		Collections.addAll(list,new Cymric("Molly"), new Mutt("Spt"));
		hoster.put(new Person("Sean"), list);
		for (Person person : hoster.keySet()) {
			System.out.println(person + " has :");
			for (Pet pet: hoster.get(person)) {
				System.out.println("	" + pet);
			}
		}
	}
}