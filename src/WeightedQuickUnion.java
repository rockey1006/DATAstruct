
public class WeightedQuickUnion {
public int[]id;
public int[]sz;//头节点记录当前树的结点数
int count;
public WeightedQuickUnion(int N) {
	count=N;
	id=new int[N];//初始化数组
	sz=new int[N];
	for(int i=0;i<N;i++) {
		id[i]=i;//每个点的父节点都是自己
		sz[i]=1;//每个点的所有子节点树都是1

	}
	}
public int find(int p) {//找到父节点
	/*while(id[p]!=p) {//数据量不大时使用非优化的
		id[p]=id[id[p]];//优化1，压缩路径为half
		p=id[p];*/
	int root,j;//优化2，压缩路径为扁平形状,
	//有3个变量因为：1 需要定义变量记住当前结点P的值2.记住ROOT的值
	//3.j记下当前结点的父节点的值
	root=p;
	while(id[root]!=root) {//第一个循环找到root
		root=id[root];//先找到根节点，用root记下，更新root
	}
	
	
	while(p!=root) {//第二个循环每一个点都指向根节点
		j=id[p];//j记下当前结点的父节点的值
		id[p]=root;
		p=j;//更新k
		
	}
	return root;
}
public void union(int p,int q) {
	int pID=find(p);//用pID记录p的根节点
	int qID=find(q);
	if(pID==qID) {
		return;//相当于break
		
	}
	if(sz[pID]<sz[qID]) {//如果p的根节点的sz小于q的根节点的sz
		id[pID]=qID;//p的根节点的父节点就是q
		sz[qID]+=sz[pID];//重要，需要更新根节点的包含子节点数的大小
		
}
	else {
		id[qID]=p;
		sz[pID]+=sz[qID];
		
	}
	count--;
}
	public static void main(String[] args) {
       WeightedQuickUnion a=new WeightedQuickUnion(9);
       a.union(3,4);
       a.union(2, 3);
       System.out.println(a.id[3]);
       System.out.println(a.id[2]);
       System.out.println(a.sz[3]);

       
	}

}
