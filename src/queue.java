
public class queue {
Node first;
Node last;
public class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

public void enqueue(int data) {
	if(first==null) {
		first=new Node(data);
		last=first;
	}
		else {
			last.next=new Node(data);
			last=last.next;
			
	}
}
public int dequeue() {
	int x=first.data;
	first=first.next;
	return x;
}
	public static void main(String[] args) {
       queue a=new queue();
       for (int i=0;i<4;i++) {
   		a.enqueue(i);
   	}
   	System.out.println(a.dequeue());
   	System.out.println(a.dequeue());
   	System.out.println(a.dequeue());
   	System.out.println(a.dequeue());


       

       
	}

}
