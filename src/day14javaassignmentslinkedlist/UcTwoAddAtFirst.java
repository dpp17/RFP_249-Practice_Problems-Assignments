package day14javaassignmentslinkedlist;


class Node{
	int data;
	Node next;
	Node(int data){
		this .data = data;
		next = null;
	}
}
public class UcTwoAddAtFirst {
	
	static Node head;
//addAtFirst
	void addAtFirst(int data) {
		Node newNode = new Node(data); 
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
		printList();
	}

//printList
	private void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}System.out.println("");
	}

	public static void main(String[] args) {
		UcTwoAddAtFirst addList = new UcTwoAddAtFirst();

		addList.addAtFirst(70);
		addList.addAtFirst(30);
		addList.addAtFirst(56);
		
	}

}
