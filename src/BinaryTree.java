
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

public BinaryTree insert(int data,BinaryTree node) {//1.要插入的数值。2.根结点
	if(node==null) {
		return new BinaryTree(data,null,null);//递归终止的条件
	}
	else if(data<node.data) {//如果要插入的值小于根节点的值
    	node.left=insert(data,node.left);////1，以左子结点为头，
    	//2.然后要插入的结点的值和根节点的左子结点比大小
    } 
    else if(data>node.data) {
    	node.right=insert(data,node.right);//同上
    }else {
    ;} 
    return node;//重要！返回的为当前根结点的地址值
	
	}
public boolean search(int data,BinaryTree node) {//1.要插入的数值。2.根结点
	if(node==null) {//一定是corner case
		return false;//递归终止的条件
	}
	else if(data<node.data) {//如果要插入的值小于根节点的值
    	return search(data,node.left);}////1，以左子结点为头，
    	//2.然后要插入的结点的值和根节点的左子结点比大小
    
    else if(data>node.data) {
    	return search(data,node.right);}//同上
    
    else
             return true;
             
}
	


public BinaryTree preorder(BinaryTree node) {//前序遍历
	if(node==null) {
		return node;
	}
	else {
	System.out.println(node.data);//打印当前头结点
	node.left=preorder(node.left);//以左子结点为头递归
	node.right=preorder(node.right);//同上
	return node;//重要！返回的为当前根结点的地址值
}
}
public BinaryTree inorder(BinaryTree node) {
	if(node==null) {
		return node;
	}
	else {
	node.left=inorder(node.left);//以左子结点为头递归
	System.out.println(node.data);//打印当前头结点
	node.right=inorder(node.right);//同上
	return node;//重要！返回的为当前根结点的地址值
}
}
public BinaryTree postorder(BinaryTree node) {
	if (node==null) {
		return node;
	}
	else {
		node.left=postorder(node.left);
		node.right=postorder(node.right);
		System.out.println(node.data);
		return node;
	}
}
public BinaryTree findMin(BinaryTree node) {//寻找树的最小值
	if(node==null) {//终止条件，当最左边的树的左子树为空

		return null;
	}
	else if(node.left==null) {
		System.out.println(node.data);

		return node;
		
	}
	else {
		node.left=findMin(node.left);
		return node;
	}
}

	

public BinaryTree findMax(BinaryTree node) {//寻找树的最大值
	if(node.right==null) {//终止条件，当最右边的树的右子树为空
		System.out.println(node.data);
		return node;
	}
	else {
		node.right=findMax(node.right);
		return node;
	}
}
public BinaryTree delete(BinaryTree node,int data) {//递归的方法实现删除
	if(node==null) {
		
	return node;
}//
	
	else if(data<node.data) {
		node.left=delete(node.left,data);}
		else if(data>node.data) {
	node.right=delete(node.right,data);
		}
		else if(node.left!=null&&node.right!=null) {
		//System.out.println(node.right.left.data);
		//System.out.println(findMin(node.right).data);
			
		node.data=findMin(node.right).data;//找到该节点的右子树中的最左孩子
		//然后把它的值和要删除的节点的值进行交换
		//System.out.println(node.data);
		node.right=delete(node.right,node.data);//然后删除这个节点即相当于把我们想删除的节点删除了
	}
				else if(node.left!=null){
			node=node.left;
		}
		else if(node.right!=null){//如果要删除的节点只有右孩子，那么就让该节点的父亲结点指向该节点的右孩子，然后删除该节点，返回true；
			node=node.right;		
		}
		return node;
	}
public int height(BinaryTree node) {//计算二叉树深度
	if(node==null) {
		return 0;
	}
	else {
		int l=height(node.left);
		int r=height(node.right);//计算出左子树的深度和右子树的深度
		if(l>r) {
			return l+1;
		}
		else {
			return r+1;//比较左子树与右子树的深度，最后返回深度大的即可
		}
	}
	
}
public int size(BinaryTree node) {
	if(node==null) {
		return 0;
	}
	else {
		return size(node.left)+1+size(node.right);
	}
}

	public static void main(String[] args) {
		BinaryTree a=new BinaryTree(7);
		BinaryTree b=new BinaryTree(2);
		BinaryTree c=new BinaryTree(9);
		BinaryTree d=new BinaryTree(1);
		BinaryTree e=new BinaryTree(5);
		BinaryTree f=new BinaryTree(8);
		BinaryTree g=new BinaryTree(3);
		BinaryTree h=new BinaryTree(4);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        e.left=g;
        g.right=h;
		//System.out.println(d.isleaf());

       // a.insert(12,a);
		//System.out.println(c.right.data);
//a.preorder(a);
        //a.inorder(a);
        //a.postorder(a);
//a.findMin(e);
//a.findMax(a);
//a.delete(a, 5);
//a.postorder(a);
//System.out.println(b.right.data);
//a.delete(a,2);
//a.postorder(a);
//a.inorder(a);
//System.out.println(a.left.data);
//System.out.println(b.right.data);
        //System.out.println (a.height(a));
        //System.out.println (a.size(a));
        System.out.println (a.search(2,a));



	}
	
}

