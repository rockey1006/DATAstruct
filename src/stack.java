public class stack {

	Node top;
  public class Node{
	  int data;
	  Node next;
	  Node(int data){
		  this.data=data;
	  }
  }
  public void push(int data) {
	  Node a =new Node(data);
	  a.next=top;
	  top=a;
  }
  public int pop() {
	  int x=top.data;
	  top=top.next;
	  return x;
  }
  


public static void main(String[] args) {
	stack a=new stack();
	a.push(1);
	a.push(2);
	a.push(3);
	a.push(4);
	System.out.println(a.pop());
	System.out.println(a.pop());
	System.out.println(a.pop());
	System.out.println(a.pop());


	
	

}
}

