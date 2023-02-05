package day14javaassignmentsstackandqueue;

class NodeThree{
	int data;
	NodeThree next;
	NodeThree(int data) {
	this.data = data;
	next = null;
	}
}
public class UcThreeQueueEnqueue {
	
	static NodeThree front;
	static int size = 0;
	
//enqueue
	void enqueue(int data) {
		NodeThree newNode = new NodeThree(data);
	
		if(front == null) {
			front = newNode;
		}else {
			NodeThree temp = front;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		size++;
		printList();
	}
	
//printList
		static void printList() {
			NodeThree temp = front;
			while(temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}System.out.println("");
		}


	public static void main(String[] args) {
		UcThreeQueueEnqueue queueThree = new UcThreeQueueEnqueue();

		queueThree.enqueue(56);
		queueThree.enqueue(30);
		queueThree.enqueue(70);
		
	}

}
