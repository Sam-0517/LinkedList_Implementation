package com.bridgelabz.linkedlist_practice;

public class Example {

	public static void main(String[] args) {
		
		LinkedListImplementation obj = new LinkedListImplementation();
		obj.insertFirst(45);
		obj.insertFirst(88);
		obj.insertFirst(100);
		obj.insertLast(11);
		obj.insertAtIndex(66, 1);
		obj.insertFirst(99);
			
		//System.out.println(obj);
		obj.display();
		System.out.println("Removed first element "+obj.deleteFirst());
		obj.display();
		System.out.println("Removed Last element "+obj.deleteLast());
		obj.display();
		System.out.println("Deleted At index number "+obj.deleteAtIndex(2));
		obj.display();
//		System.out.println(obj.find(66));
//		System.out.println(obj.find(100));
	}
}
