package AllCollectionPackage;

import java.util.HashSet;
import java.util.Spliterator;


public class HashSetProgram {
	
	static void addElements(HashSet<Integer> numberHashSet)
	{
		numberHashSet.add(61);
		numberHashSet.add(41);
		numberHashSet.add(91);
		numberHashSet.add(51);
		numberHashSet.add(80);
		numberHashSet.add(11);
		numberHashSet.add(20);
		
		System.out.println(numberHashSet.add(51));
		//returns false - not allow to insert duplicate element
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> numberHashSet = new HashSet<Integer>();
		addElements(numberHashSet);
		
		HashSet<Integer> numberHashSet1 = new HashSet<Integer>();
		numberHashSet1.add(20);
		numberHashSet1.add(80);
		numberHashSet1.add(11);
		numberHashSet1.add(50);
		numberHashSet1.add(60);
		numberHashSet1.add(10);
		numberHashSet1.add(51);
		
		System.out.println("Set 1:"+numberHashSet);
		System.out.println("Set 2:"+numberHashSet1);
		
		HashSet<Integer> numberHashSet2 = new HashSet<Integer>();
		
		addElements(numberHashSet2);
		
		//union of two sets
		
		numberHashSet2.addAll(numberHashSet1);
		System.out.println("Resultant Set : " + numberHashSet2);
		
		numberHashSet1.clear();
		
		addElements(numberHashSet2);
		
		//Intersection of two sets
		
		numberHashSet2.retainAll(numberHashSet1);
		System.out.println("Resultant Set:"+numberHashSet2);
		numberHashSet2.clear();
		
		addElements(numberHashSet2);
		
		//SET Difference
		numberHashSet2.removeAll(numberHashSet1);
		System.out.println("Resultant SEt:"+numberHashSet2);
		
		//Splitlterator
		Spliterator<Integer> spit = numberHashSet.spliterator();
		spit.forEachRemaining(System.out::println);
		
		

		
		
		
	}

}
