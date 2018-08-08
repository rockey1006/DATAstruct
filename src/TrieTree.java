import java.lang.*;
import java.util.*;
import java.util.HashMap;
public class TrieTree {//前缀树，树对象里是一个名为root的指针
	Node root;//全局变量
	public class Node{//一个结点字符串，eg,in
		int prefix;//记录以该结点字符串为前缀的字符串数量
		int dumpli;//该结点字符串的重复的数目
		boolean isLeaf;//判断是否为子节点
		Node[]child;//Node类型的数组，存的是26个子节点的地址值(类类型变量存的都是对象的地址值)
		public Node() {//初始化NODE
			prefix=0;
			dumpli=0;
			isLeaf=false;
			child=new Node[26];//声明并初始化数组	
		}	
		}
	public TrieTree() {
	root=new Node();//树的初始化是创建一个Node对象
	}
	
    public void insert(Node root,String str) {//新插入的字符串和已存在的字典树对比，所以需要这两个参数
    	String word=str.toLowerCase();//转换为小写
    	char[] ch=word.toCharArray();//将字符串转换为字符数组储存
    	for(int i=0;i<ch.length;i++) {
    		int index=ch[i]-'a';//找到要插入的字符的索引，用相对于a字母的位置作为索引
    		if(root.child[index]!=null) {//如果要插入的字符存在
    			root.child[index].prefix++;//该子结点的前缀数加1
    		}
    		else {
    			root.child[index]=new Node();//如果不存在就新建一个结点
    			root.child[index].prefix++;
    		}
    		if(i==ch.length-1){
				root.child[index].isLeaf=true;
				root.child[index].dumpli++;
				}
    		root=root.child[index];//root更新为子结点，继续循环
    	
    	}

    	
    }
    	
    	
    public boolean search(Node root,String str) {
    	String word=str.toLowerCase();//转换为小写

    	char[]ch=word.toCharArray();
    	for(int i=0;i<ch.length;i++) {
    		int index=ch[i]-'a';
    		if(root.child[index]==null) {
    			return false;
    		}
    		root=root.child[index];
    		}
    			return true;
    		
    	}
    public  HashMap<String,Integer> preTraversal(Node root,String prefixs){
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		if(root!=null){
			
			if(root.isLeaf==true){
			////当前即为一个单词
				map.put(prefixs, root.dumpli);
			}
			
			for(int i=0;i<root.child.length;i++){
				if(root.child[i]!=null){
					char ch=(char) (i+'a');
					////递归调用前序遍历
					String tempStr=prefixs+ch;
					map.putAll(preTraversal(root.child[i], tempStr));
				}
			}
		}		
		
		return map;
		}
    	
	public static void main(String[] args) {

            TrieTree a= new TrieTree(); 
            
            a.insert(a.root,"abc");
            a.insert(a.root,"abf");
            a.insert(a.root,"abd");
            System.out.println(a.search(a.root,"df"));
            System.out.println(a.search(a.root,"def"));
            System.out.println(a.search(a.root,"DEF"));
            System.out.println(a.search(a.root,"AbC"));
            System.out.println(a.preTraversal(a.root,"ab"));





	}

}
