package Code;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new LinkedList<Integer>();
		list.add(0, 1);
		list.add(1, 2);
		list.add(2, 3);
		
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(0, 4);
		list1.add(1, 5);
		list1.add(2, 6);
		
		//Sum of the Linked List
		LinkedList<Integer> list3 = new LinkedList<Integer>();
		
		list3.add(0, list.get(0)+list1.get(0));
		list3.add(1, list.get(1)+list1.get(1));
		list3.add(2, list.get(2)+list1.get(2));
		
		Iterator<Integer> itr = list3.iterator();
	   System.out.println("The sum of linked lists is :");
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " " );
		}
		
		
	}
}
	
	
	
