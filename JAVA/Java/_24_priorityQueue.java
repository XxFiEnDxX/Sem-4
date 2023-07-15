/*package whatever //do not write package name here */

import java.util.*;
import java.io.*;

    public class _24_priorityQueue {

	public static void main(String args[])
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(11);
queue.add(10);
queue.add(22);
queue.add(5);
queue.add(12);
queue.add(2);
		System.out.println(queue);

        while (queue.isEmpty() == false)
System.out.println( queue.poll());



        
	}
}

