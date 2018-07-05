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
	  Node a =new Node(data);//insert data into the stack
	  a.next=top;//谁加进来谁的下一个就是当前top的地址值
	  top=a;//谁加进来top就是谁
  }
  public int pop() {
	  int x=top.data;//返回并且删除最后一个增加的Data
	  top=top.next;//当前top是谁就返回谁然后指向top的下一个数
	  return x;
  }
  public int peek() {
	  return top.data;//返回最后一个增加的data
	  
  }
  public int size() {
	  int length=1;
	  while(top.next!=null) {//返回stack中data的个数
		  top=top.next;
		  length++;
	  }
	  return length;
  }
  public boolean isEmpty() {//判断stack是否为空
	  if (top==null) 
		  return true;
		  else 
	 return false;
	  }
  
  
public static void main(String[] args) {
	stack x=new stack();
	for (int i=0;i<4;i++) {
		x.push(i);
		}
	
	//System.out.println(x.peek());
	//System.out.println(x.size());
	System.out.println(x.isEmpty());


	/*a.push(1);
	a.push(2);
	a.push(3);
	a.push(4);*/
	/*System.out.println(x.pop());
	System.out.println(x.pop());
	System.out.println(x.pop());
	System.out.println(x.pop());*/
}


	
	


}

