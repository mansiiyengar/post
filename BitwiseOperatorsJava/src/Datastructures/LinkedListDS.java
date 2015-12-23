package Datastructures;

public class LinkedListDS {
	//The code below implements a very basic singly linked list.
	class Node {
	Node next = null;
	int data;
	
	public Node(int d) {
	 data = d;
	}
	
	void appendToTail(int d) {
	 Node end = new Node(d);
	 Node n = this;
	 while (n.next != null) {
	 n = n.next;
	 }
	 n.next = end;
	 }
	 }
	//delete a node
/*	Given a node n, we find the
	previous node prev and set prev.next equal to n.next. If the list is doubly linked,
	we must also update n. next to set n. next. prev equal to n. prev. The important
	things to remember are (1) to check for the null pointer and (2) to update the head or
	tail pointer as necessary.*/
	
	
	
	Node deleteNode(Node head, int d) {
		Node n = head;
		
		if (n.data == d) {
		return head.next; /* moved head */
		}
		
		while (n.next== null) {
		 if (n.next.data == d) {
		 n.next = n.next.next;
		 return head; /* head didn't change */
		 }
		 n = n.next;
		 }
		 return head;
		 }
}
