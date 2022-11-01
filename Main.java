package CircularDoublyLinkedList;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		//add item into first
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(50);
		
		//add item into last
		list.addLast(60);
		list.addLast(70);
		list.addLast(20);
		
		//add item into first
		list.addFirst(5);
		
		//visit item from first
		list.traverse();
		System.out.println();
		
		//visit item from last
		list.reverseView();
		System.out.println();
		
		//remove item from last
		list.removeLast();
		
		//visit item
		list.traverse();
		
		//remove item from last
		list.removeLast();
		System.out.println();
		
		//visit item
		list.traverse();
		System.out.println();
		
		//list to array method
		System.out.println(Arrays.toString(list.toArray()));
		
		//list size
        var size = list.sizeOf();
        System.out.println(size);
        
        //remove element from first
		list.removeFirst();
		list.removeFirst();
		list.removeFirst();
		list.removeFirst();
		list.removeFirst();
		list.removeFirst();
		list.removeFirst();
		
		//visit
		list.traverse();
		
		//list to array method
		System.out.println(Arrays.toString(list.toArray()));
		
		//size of list
		System.out.println(list.sizeOf());
		list.addFirst(3);
		System.out.println(list.sizeOf());
		list.traverse();
		
	}

}
