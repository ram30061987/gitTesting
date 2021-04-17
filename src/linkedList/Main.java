package linkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls=new LinkedList();		
		ls.insert(5);
		ls.insert(12);
		ls.insertAtStart(18);
		ls.insertAt(2,50); //when it index 0th position then condition apply on the linked list 
		ls.deleteAt(2);
       ls.show();
	}

}
