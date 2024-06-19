package AllCollectionPackage;

import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.addFirst(5);
		ll.add(2,60);
		ll.addLast(25);
		ll.add(30);
		
		System.out.println("Number list is:"+ll);
		
		System.out.println("First element is:"+ll.getFirst());
		System.out.println("Last element is:"+ll.getLast());
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Number List after removeing first and last element is:"+ll);
		
		ListIterator<Integer> li = ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		li = ll.listIterator(ll.size());
		
		while(li.hasPrevious())
		{
			int n = li.previous();
			System.out.println(n + "\t");
			if(n==20)
				li.add(9999999);
			if(n==60)
				li.set(5000);
		}
		System.out.println("Number List is : " + ll);
		Collections.sort(ll);
		
		System.out.println("Number List in Ascending order is : " + ll);

		Collections.reverse(ll);
		System.out.println("Number List in Descending order is : " + ll);
		
	}

}
