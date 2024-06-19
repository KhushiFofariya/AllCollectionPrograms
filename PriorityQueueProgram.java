package AllCollectionPackage;
//program to demonstrate a PriorityQueue
import java.util.Queue;
import java.util.*;

public class PriorityQueueProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pq = new PriorityQueue<>();
		pq.add("Core java");
		pq.add("React");
		pq.add("HTML");
		pq.add("Angular");
		
		System.out.println(pq);
		
		pq.remove("Angular");
		System.out.println("After Remove:"+pq);
		
		System.out.println("Poll method Using:"+pq.poll());
		
		System.out.println("Final Queue:"+pq);
		
		Iterator<String> iterator = pq.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()+" ");
		}
		//printing the top element of the pq
		System.out.println(pq.peek());
		//printing the top element and removeing it from the pq
		System.out.println(pq.poll());
		//printing the top element again
		System.out.println(pq.peek());
		
		
		
	}

}
