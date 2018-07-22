import java.util.Arrays;

public class BinaryHeap {
	
	int size;//用于找到二叉堆最后一个元素
	int[]array;//二叉堆是基于数组的数据结构
	int DEFAULT_SIZE=100;//数组大小
	public BinaryHeap() {
		array=new int[DEFAULT_SIZE];//初始化数组，把数组大小添加进去。格式：数组名=new int[数组大小];
	}
	
public int parent(int i) {//找到索引为i的结点的父节点的索引
	return (i-1)/2;
}
public int leftChild (int i) {//找到索引为i的结点的左孩子的索引
	return 2*i+1;
}
public int rightChild(int i) {//找到索引为i结点的右孩子的索引
	return 2*i+2;
}
public boolean hasParent(int i) {//判断是否有父节点
	return i>0;//如果i=0就没有父节点
}
public boolean hasLeftChild(int i) {//判断是否有左孩子
	return leftChild(i)<size;//size=length
}
public boolean hasRightChild(int i) {//判断是否有右孩子
	return rightChild(i)<size;
}
public void add(int data) {
	if(size==array.length) {//必须扩容，否则出错
		array=resize();
		
	}
	int i=size;//最后一个结点的索引
	int p=i;
	while(hasParent(p)) {//如果当前结点有父节点
		p=parent(p);//获取父节点的索引
		int x=array[p];//获得父节点的值
		if(data>x) {//判断当前结点和父节点的大小
			break;//如果当前的值大于父节点的值就结束循环
		}
		else {
			array[i]=x;//否则当前结点的值变成父节点的值
			array[p]=data;//交换位置
			i=p;//当前结点更新为父节点
		}
		
	}
}
    public int [] resize() {//数组扩容
    return Arrays.copyOf(array, array.length*2);
}
   
    public void print() {
    	int i=0;
         for(i=0;i<array.length;i++) {
        	 
      	   System.out.println(array[i]);}
         }
    public int pop() {
    	/**
         * 将根节点从堆中移出
         * 将最后一个元素放到根节点，然后比较孩子节点：
         * ①如果存在孩子节点比新的节点小，将新节点和最小的孩子节点替换位置
         * ②重复步骤①直到到达叶子节点，或者孩子节点都比最后一个元素要大
         * @return
         */
    	int i=0;
    	int e=array[0];//要删除的顶点
    	int x=array[size-1];//最后一个数
    	while(hasLeftChild(i)) {{//如果有左节点，就是还未达到叶子节点,完全二叉树性质
    		
    		int child=leftChild(i);//声明所以要加int,子节点就为左结点
    	
    	if(hasRightChild(i)&&array[child]>array[rightChild(i)]) {
    		child=rightChild(i);//如果有右孩子节点且小于左孩子节点，子节点就为右结点
        
    	}
    	if(x<array[child]) {//开始比较新的头节点的值和最小的子节点的值，如果小于子节点就结束循环
    		break;
    		 	}
    	else {
    		array[i]=array[child];//否则换位置
    		i=child;//新的父节点更新为当前结点最小的子节点
    		
    	}
    	array[i]=x;//把最后一个数和当前的结点交换位置
    	array[size-1]=0;//记得把最后一个数清零

    	}
    	}
    	return e;//返回删除的头节点
    	
    }
	public static void main(String[] args) {
       BinaryHeap a=new BinaryHeap();
       a.array=new int[]{1,4,8,7,5,10,9,11,9,6};//给数组赋值
       a.size=10;
      /* System.out.println(a.array[a.parent(3)]);
       System.out.println(a.array[a.leftChild(3)]);
       System.out.println(a.array[a.rightChild(3)]);
       System.out.println(a.hasRightChild(5));
       System.out.println(a.hasParent(0));*/
       //a.add(2);
       //System.out.println(a.array[1]);
       //System.out.println(a.pop());
       //System.out.println(a.pop());
//a.pop();
a.add(2);
a.print();
       }       
	}
