
public class UnionFind {//根据一个索引的数组实现
	public int[]id;
	public int count;//类别
	public UnionFind(int N) {//构造方法
		this.count=N;
		this.id=new int[N];
		for(int i=0;i<N;i++) {
			this.id[i]=i;//给数组赋值
		}
		
	}
public int count() {//主要用于算经过union后类别数
	return this.count;
}
public int find(int p) {//找到某个数所属的类别
	return id[p];
	
}
  public boolean connected(int p,int q) {//判断两个数是否相连
	
	return find(p)==find(q); 
}
  public void union(int p,int q) {//连通两个数
	  int pid=find(p);
	  int qid=find(q);
	  if(pid==qid) {
		  return;
	  }
	  else {
		  for(int i=0;i<id.length;i++) {//是id而不是N
			  if(id[i]==pid) {
				  id[i]=qid;
				  count--;
			  }
		  }
	  }
	  
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        UnionFind a=new UnionFind(7);
        a.union(3, 4);
        System.out.println(a.connected(3,4));
	}

}
