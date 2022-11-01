package CircularDoublyLinkedList;

public class LinkedList<T> {
	
  //Node structure
  private class Node<T>{
	 private T value;
	 private Node<T> next;
	 private Node<T> previous;
	 
	 public Node(T item) {
		 value = item;
	}
  }
  
  //field
  private int size;
  private Node<T> first;
  private Node<T> last;
  
  
  //add item into first
  public void addFirst(T item)
  {
	  Node<T> node = new Node<T>(item);
	  
	  if(isEmpty())
	  {
		  first = last = node;
	  }else {
		  node.next = first;
		  first.previous = node;
		  first = node;
		  first.previous = last;
		  last.next = first;
	  }
	  
	  size++;
  }
  
  //add item into last
  public void addLast(T item)
  {
	  Node<T> node = new Node<T>(item);
	  if(isEmpty())
	  {
		  first = last = node;
	  }else {
		  last.next = node;
		  node.previous = last;
		  last = node;
		  last.next = first;
		  first.previous = last;
	  }
	  
	  size++;
  }
  
  //remove item from last
  public void removeLast()
  {
	  if(isEmpty())
	  {
		  System.out.println("ups! list is empty!");
	  }else if(first == last)
	  {
		  first = last = null;
		  size = 0;
	  }else {
		  var node = last.previous;
		  node.next = first;
		  last = node;
		  first.previous = last;
		  size--;
	  }
  }
  
  //remove item from first
  public void removeFirst()
  {
	  if(isEmpty())
	  {
		  System.out.println("ups! list is empty!");
	  }
	  else if(first == last)
	  {
		  first = last = null;
		  size = 0;
	  }
	  else 
	  {
		  first = first.next;
		  last.next = first;
		  first.previous = last;
		  size--;
	  }
  }
  
  // get list size
  public int sizeOf()
  {
	  return size;
  }
  
  
  // list to array method
  public Object[] toArray()
  {
	if(isEmpty())
		return null;
	
	Object items[] = new Object[size];
	int index = 0;
	
	var current  = first;
	items[index++] = current.value;
	current = current.next;
	
	while(current != first)
	{
		items[index++] = current.value;
		current = current.next;
	}
	
	return items;
  }
  
  //visit all element
  public void traverse()
  {
	  if(isEmpty())
	  {
		  System.out.println("ups! list empty!");
		  return;
	  }
			
	  if(first == last)
	  {
		  System.out.println(first.value);
		  return;
	  }
	  
	  Node<T> current = first;
	  do {
		  System.out.print(current.value+"  ");
		  current = current.next;
	  }while(current != first);
  }
  
  //visit all element from reverse
  public void reverseView()
  {
	  if(isEmpty())
	  {
		  System.out.println("ups! list empty!");
		  return;
	  }
	  
	  if(first == last)
	  {
		  System.out.println(first.value);
		  return;
	  }
		 
	  
	  Node<T> current = last;
	  do {
		  System.out.print(current.value+"  ");
		  current = current.previous;
	  }while(current != last);
  }
  
  
  //check empty or not method
  private boolean isEmpty()
  {
	  if(first == null && last == null)
		  return true;
	  return false;
  }
}
