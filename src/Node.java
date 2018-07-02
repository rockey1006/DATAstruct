
public class Node {
	
		public int data;
		public Node next;
		public Node pre;
		public Node(int a){
			this.data=a;
			}
			public void print(Node head) {/*打印单链表*/
			Node temp=head;
		    while(temp.next!=null) {
			System.out.println(temp.data);
            temp=temp.next;	
		}
		System.out.println(temp.data);
}            		
		public int length(Node head) {/*返回单链表长度*/
			int length=1;/*counter*/
			Node temp=head;/*pointer*/
			while(temp.next!=null) {
				length++;
			temp=temp.next;
			}
			return length;
		}
		public void addNodeEnd(Node head,Node x) {/*在单链表最后插入*/
			Node temp=head;/*pointer*/
			while(temp.next!=null) {
				temp=temp.next;/*find the last node*/
			}
			temp.next=x;/*change the last node's pointer from null to x*/
		}
		public void addNodeHead(Node head,Node x) {/*在单链表最前插入x*/
			
			x.next=head;/*set the new node's next to head*/
				
		}
		public void addNodeByIndex(int index,Node head,Node x) {
			/*在单链表中间指定位置后面插入x*/
			int count=1;
			Node temp=head;
			while(temp.next!=null) {
				if(index==count) {
					x.next=temp.next;
					temp.next=x;				
				}
				count++;
				temp=temp.next;		
				}
			}
		public void deleteHead(Node head) {/*删除单链表头结点*/
			
			Node temp=head;
	    	head=head.next;
	    	head.next=null;
			
		}
		public void deleteEnd(Node head,Node end) {
			/*删除单链表尾结点*/
		    Node temp=head;
		    while(temp.next!=end) {
		    	temp=temp.next;
		    }
		    temp.next=null;
		    
		    }
		public void deleteIndexNode(int index,Node head) {
			/*删除单链表中间指定位置后面结点*/
			int count=1;
			Node temp=head;
			while(temp.next!=null) {
				if(index==count) {
					temp.next=temp.next.next;
				}
				count++;
				temp=temp.next;
			}
			
		}
		public void adddoubleHead(Node head,Node y) {
			y.next=head;/*在双链表前面增加结点*/
			y.pre=null;
			head.pre=y.next;
		}
		public void adddoubleEnd(Node end,Node y) {
			end.next=y;/*在双链表后面增加结点*/
			y.pre=end;
			y.next=null;
		}
		public void adddoubleByindex(int index,Node head,Node y) {
			int count=1;
			Node temp=head;
			while(temp.next!=null) {
				if(index==count) {
					temp.next.pre=y;/*增加双链表中间指定位置后面结点*/
					y.next=temp.next;/*从后面开始往前改指针*/				
					y.pre=temp;
					temp.next=y;
											
				}
				count++;
				temp=temp.next;
			}
		}
	    public void DeleteDoubleHead(Node head) {
	    	Node temp=head;
	    	head.next.pre=null;
	    	temp.next=null;
	    	head=head.next;
	    }
	    
	    
public static void main(String[] args) {
	
     Node a=new Node(1);
     Node b=new Node(2);
     Node c=new Node(3);
     Node x=new Node(4);
     Node y=new Node(5);
     a.pre=null;
     b.pre=a;
     c.pre=b;
     a.next=b;
     b.next=c;
     c.next=null;
 
     System.out.println("The length of the Node is "+a.length(a));
   
     
     a.adddoubleByindex(1, a, y);
     a.DeleteDoubleHead(a);
     a.print(a);
}
}

	




	