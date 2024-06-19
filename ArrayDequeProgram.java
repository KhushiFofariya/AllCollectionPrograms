package AllCollectionPackage;

import java.util.*;

//program to demonstrate ArrayDeque
public class ArrayDequeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> arrayDqeue = new ArrayDeque<String>();
		
		arrayDqeue.add("A");
		arrayDqeue.add("B");
		arrayDqeue.add("C");
		
		//offerFirst-adds elements at the front of the arrayDeque
		arrayDqeue.offer("F");
		
		//arrayDqeue.add(null);
		
		arrayDqeue.offerFirst("D");
		
		//offerlast inserts the element at the last of ArrayDeque
		arrayDqeue.offerLast("E");
		
		Iterator<String> itr = arrayDqeue.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("After Poll");
		String s = arrayDqeue.poll();
		System.out.println("Poll item is:"+s);
		for(String item : arrayDqeue)
		{
			System.out.println(item);
		}
	}

}
