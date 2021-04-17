 package linkedList;

public class LinkedList {
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		
		//System.out.print(" "+node.data);
	}

	public void insertAtStart(int data) {
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;		
		//System.out.print(" "+node.data);
	}

	
	

	public void insertAt(int index, int data) {

		 Node node=new Node();
		 node.data=data;
		 node.next=null;
		 Node n=head;
		 
		 if(index==0){//if we r adding on 0th positiion
			  
			  insertAtStart(data);
			  } 
		 else {
		 for(int i=0;i<index-1;i++) {
			n= n.next;	 
		 }
		 node.next=n.next;
		 n.next=node;
		 }
	}
	
	
	public void show() {	
		Node n = head;
		while (n.next != null) {
			System.out.print(" "+n.data);

			n = n.next;
		}
		
		System.out.print(" "+n.data);
	}

	public void deleteAt(int index) {
		// TODO Auto-generated method stub
		Node n=head;
		Node n1=null; //temporary node
		if(index==0) {
			head=head.next;
		}
		else {
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
		}
	}
}
