package Lab2;

import java.util.NoSuchElementException;
//singly linked list with reference to first node only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
*/

public class CP3LinkedList<E> {
     private class Node {
		public E data;
		public Node next;
	}
	private Node first;
		
	/** 
    	Constructs an empty linked list.
	*/
	public CP3LinkedList()
	{  
		first = null;
	}
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	public void addFirst(E element)
	{  
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = first;
		first = newLink;
	}

	public E getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}

	public void removeFirst() {
		if (first == null)
			throw new NoSuchElementException();
		first = first.next;
	}
	public void print(){
		Node current = first;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	public int size(){

		Node temp = first;
		int size = 0;
		while(temp != null)
		{
			size += 1;
			temp = temp.next;
		}
		return size;

	}
	public boolean contains(E e){

		Node current = first;
		boolean found = false;
		while(current != null && !found){
			if(current.data == e)
				found = true;
			current = current.next;
		}
		return found;
	}

}
