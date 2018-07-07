
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
		public void addNodeEnd(Node head,Node x) {/*在单链表最后插入x*/
			Node temp=head;/*pointer*/
			while(temp.next!=null) {
				temp=temp.next;/*find the last node*/
			}
			temp.next=x;/*change the last node's pointer from null to x*/
			x.next=null;
			head.print(head);
		}
		public void addNodeHead(Node head,Node x) {/*在单链表最前插入x*/
			Node temp=head;/*指针，用于暂时改head地址*/
			x.next=temp;/**/
			head=x;/*set the new node's next to head*/
			head.print(head);	
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
			
			Node temp=head;/*指针*/
	    	head=temp.next;/*删除单链表头结点从栈内存指向推内存的下一个结点*/
	    	temp.next=null;	/*删除指针指的头节点*/
            head.print(head);
            
		}
		public void deleteEnd(Node head,Node end) {
			/*删除单链表尾结点*/
		    Node temp=head;
		    Node tail=end;/*两个指针，一个指头一个指尾*/
		    while(temp.next!=tail) {
		    	temp=temp.next;/*找到尾节点的前一个结点*/
		    }
		    temp.next=null;   /*尾节点的前一个结点的next设置为null*/      
		   
            head.print(head);

		    
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
				head.print(head);
			}
			
		}
		public void adddoubleHead(Node head,Node y) {
			Node temp=head;
			y.next=temp;/*在双链表前面增加结点y*/
			y.pre=null;
			temp.pre=y.next;
			head=y;/*更新头节点*/
			head.print(head);
		}
		public void adddoubleEnd(Node head,Node y) {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=y;/*在双链表后面增加结点*/
			y.pre=temp;
			y.next=null;
			head.print(head);
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
	    	Node temp=head;/*删除双链表头结点*/
	    	temp.next.pre=null;
	    	head=temp.next;
	    	temp.next=null;
	    	head.print(head);
	    }
	    public void DeleteDoubleEnd(Node head,Node end) {
	    	Node temp=head;/*删除双链表尾结点*/
	    	Node tail=end;
	    	while(temp.next!=tail) {
	    		temp=temp.next;
	    	}
	    	temp.next=null;
	    	tail.pre=null;
	    	end=temp;
	    	head.print(head);
	    }
	    public void DeleteDoubleByIndex(int index,Node head) {
	    	int count=1;/*删除双链表中间标号后的结点*/
	    	Node temp=head;
	    	while(temp.next!=null) {
	    		if(index==count) {
	    			temp.next=temp.next.next;
	    			temp.next.next.pre=temp;
	    		}
	    		count++;
	    		temp=temp.next;
	    	}
	    	head.print(head);
	    }
	    
	    public int LenthCir(Node head) {/*数循环链表的结点数*/
	    	int length=1;
	    	Node temp=head;
	    	while(temp.next!=head) {
	    		temp=temp.next;
	    		length++;
	    	}
	    	
	    	return length;
	    }
	    public void printCir(Node head) {/*打印循环链表的结点*/
	    	Node temp=head;
	    	while(temp.next!=head) {
	    		System.out.println(temp.data);
	    		temp=temp.next;
	    	}
	    	System.out.println(temp.data);
	    }
	    public void addHeadCir(Node head,Node end,Node x) {
	    	Node temp=head;/*在循环链表的前面增加结点*/
	    	Node tail=end;
	    	tail.next=x;
	    	x.next=temp;
	    	head=x;
	    	head.printCir(head);  	
	    	
	    }
	    public void addEndCir(Node head,Node end,Node x) {
	    	Node temp=head;/*在循环链表的最后增加结点*/
	    	Node tail=end;
	    	tail.next=x;
	    	x.next=temp;
	    	head.printCir(head);
	    }
	    
	    public void addByIndexCir(int index,Node head,Node x) {
	    	Node temp=head;
	    	int count=1;
	    	while(temp.next!=head) {
	    	    if(index==count) {
	    	    	x.next=temp.next;/*在循环链表的中间增加结点，记住一定要从后往前改变指针*/
	    	    	temp.next=x;
	    	    	
	    	    }
	    	    temp=temp.next;
	    	    count++;
	    	   	}
	    	  head.printCir(head);
	    }
	    
	    public void deleteHeadCir(Node head,Node end) {
	    	Node temp=head;/*删除循环链表的头结点*/
	    	Node tail=end;
	    	tail.next=temp.next;
	    	head=temp.next;
	    	temp.next=null;
	    	head.printCir(head);
	    	
	    }
	    public void deleteEndCir(Node head,Node end) {
	    	Node temp=head;/*删除循环链表的尾结点*/
	    	Node tail=end;
	    	
	    	while(temp.next!=tail) {
	    		temp=temp.next;
	    	}
	    	temp.next=head;
	    	head.printCir(head);
	    }
	    public void deleteByIndex(int index,Node head) {
	    	Node temp=head;/*删除循环链表中间的结点*/
	    	int count=1;
	    	while(temp.next!=head) {
	    		if (index==count) {
	    			temp.next=temp.next.next;
	    		}
	    		count++;
	    		temp=temp.next;
	    	}
	    	head.printCir(head);

	    }
	    
public static void main(String[] args) {
	
     /*Node a=new Node(1);
     Node b=new Node(2);
     Node c=new Node(3);
     Node x=new Node(4);
     Node y=new Node(5);
     a.pre=null;
     b.pre=a;
     //c.pre=b;
     a.next=b;//
     //b.next=c;
     //c.next=a;*/
 
     //System.out.println("The length of the Node is "+ a.LenthCir(a));
    //a.printCir(a);//
 /*    a.addHeadCir(a, c, x);*/
     /*a.addEndCir(a, c, x);*/
   //  a.addByIndexCir(1, a, x);//
    // a.deleteEndCir(a, c);//
    // a.deleteByIndex(1, a);
	stack a=new stack(1);
}
}

	




	