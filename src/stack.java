public class stack {

	Node top;//指针
  public class Node{
	  int data;//内部类
	  Node next;
	  Node(int data){
		  this.data=data;
	  }
  }
  public void push(int data) {
	  Node a =new Node(data);
	  a.next=top;//谁加进来谁的下一个就是当前top的地址值
	  top=a;//谁加进来top就是谁
  }
  public int pop() {
	  int x=top.data;
	  top=top.next;//当前top是谁就返回谁然后指向top的下一个数
	  return x;
  }
  
public static void main(String[] args) {
	stack a=new stack();
	for (int i=0;i<4;i++) {
		a.push(i);
	}
	
	/*a.push(1);
	a.push(2);
	a.push(3);
	a.push(4);*/
	System.out.println(a.pop());
	System.out.println(a.pop());
	System.out.println(a.pop());
	System.out.println(a.pop());
}


	
	


}

