
public class BinaryTree {
int data;
BinaryTree left;
BinaryTree right;//成员变量

public BinaryTree(int data,BinaryTree left,BinaryTree right){
	this.data=data;//定义满二叉树的结点的构造方法和初始化值
	this.left=left;
	this.right=right;
}
public BinaryTree(int data){
	this.data=data;//定义叶结点的构造方法和初始化值
	this.left=null;
	this.right=null;
}


public boolean isleaf() {//判断是否为叶结点
	if(this.left==null&&this.right==null) {
		return true;}
		else {
			return false;
	}
}
public BinaryTree insert(int data,BinaryTree node) {
	if(node==null) {
		return new BinaryTree(data,null,null);//递归终止的条件
	}
	else if(data<node.data) {//如果要插入的值小于根节点的值
    	node.left=insert(data,node.left);////就以根节点的
    } 
    else if(data>node.data) {
    	node.right=insert(data,node.right);
    }else {
    ;} 
    return node;
	
	}

	public static void main(String[] args) {
		BinaryTree a=new BinaryTree(7);
		BinaryTree b=new BinaryTree(2);
		BinaryTree c=new BinaryTree(9);
		BinaryTree d=new BinaryTree(1);
		BinaryTree e=new BinaryTree(5);
		BinaryTree f=new BinaryTree(8);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
		//System.out.println(d.isleaf());

        a.insert(12,a);
		System.out.println(c.right.data);





	}
	
}

