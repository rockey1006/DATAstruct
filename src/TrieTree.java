
public class TrieTree {
	public class Node{//一个结点字符串，eg,in
		int prefix;//记录以该结点字符串为前缀的字符串数量
		int dumpli;//该结点字符串的重复的数目
		boolean isLeaf;//判断是否为子节点
		Node[]child;//Node类型的数组，存的是26个子节点的地址值(类类型变量存的都是对象的地址值)
		public Node() {//初始化NODE
			prefix=0;
			dumpli=0;
			isLeaf=false;
			child=new Node[26];
			
		}
		
	}

	public static void main(String[] args) {

            
  
	}

}
