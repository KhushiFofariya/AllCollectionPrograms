package AllCollectionPackage;

import java.util.*;
public class QueueProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		
		//adds elements
		for(int i=0;i<5;i++)
		{
			q.add(i);
		}
		//display content of the queue
		System.out.println("Elements of Queue : " + q);
		//to remove the head of the queue
		int removeable = q.remove();
		System.out.println("Removed element :" + removeable);
		//to view the head of queue
		int head = q.peek();
		System.out.println("Head of queue:"+head);
		int size = q.size();
		System.out.println("Size of queue is:"+size);
	}

}
