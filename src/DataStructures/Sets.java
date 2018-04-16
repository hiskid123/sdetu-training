package DataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// LinkedHash - in order that they were entered
		//HashSet - complete random order
		// TreeSet - rearranges to natural order
		// 1. Define the collection
		Set<String> animals = new TreeSet<String>();
		
		// 2. Adding animals
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");
		animals.add("goose");
		System.out.println(animals.size() + " " + animals);
		
		// Create a new set that we use for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		System.out.println(farmAnimals);
		// What is the INTERSECTION (Only farm animals and animals)"and"
		
		
		// 1. Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		
		
		// 2. Retain ONLY the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		// What is the UNION (are both animals and farmAnimals) "OR"
		
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		// What is the DIFFERENCE (Animals but NOT farm animals) In 1 but not the other
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is: "+ differenceSet);
	}
	


}
