public class queue {
Node first;
Node last;
public class Node{//内部类
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

public void enqueue(int data) {//入队列
	if(first==null) {
		first=new Node(data);
		last=first;
	}
		else {
			last.next=new Node(data);//谁进来谁在last的后面
			last=last.next;//然后last就指向谁
			
	}
}
public int dequeue() {//出队列
	int x=first.data;//返回first的data
	first=first.next;//first指针更新
	return x;
	
}
public int Front() {
	return first.data;//返回队列的第一个数
}
public int Size() {
	int length=1;//返回队列的长度
	while(first.next!=null) {
		first=first.next;
		length++;
	}
	return length;
	
}
public boolean isEmpty() {//判断队列是否为空
	if (first==null)
		return true;
	else
		return false;
}
	public static void main(String[] args) {
       queue a=new queue();
      /* for (int i=0;i<4;i++) {
   		a.enqueue(i);
   	}*/
      	//System.out.println(a.Size());
      	//System.out.println(a.Front());
      	System.out.println(a.isEmpty());


   /*System.out.println(a.dequeue());
   	System.out.println(a.dequeue());
   	System.out.println(a.dequeue());
   	System.out.println(a.dequeue());*/


       

       
	}

}
