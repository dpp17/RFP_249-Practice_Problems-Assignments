package day14javaassignmentsstackandqueue;


class NodeOne{
	int data;
	NodeOne next;
	NodeOne(int data) {
	this.data = data;
	next = null;
	}
}
public class UcOneCreateStack {

	
	static NodeOne top;
//addAtFirst
		void addAtFirst(int data) {
			NodeOne newNode = new NodeOne(data); 
			if(top == null) {
				top = newNode;
			}else {
				newNode.next = top;
				top = newNode;
			}
			printList();
		}

//printList
		private void printList() {
			NodeOne temp = top;
			while(temp != null) {
				System.out.print(" --> " + temp.data);
				temp = temp.next;
			}System.out.println("");
		}
	
public static void main(String[] args) {
		UcOneCreateStack getList = new UcOneCreateStack();
		
		getList.addAtFirst(70);
		getList.addAtFirst(30);
		getList.addAtFirst(56);
		

	}

}
