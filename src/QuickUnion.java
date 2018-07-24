public class QuickUnion {
public int[]id;
public int count;
public QuickUnion(int N) {
	int count=N;
	id=new int[N];
	for(int i=0;i<id.length;i++) {
		id[i]=i;//往数组里放数
	}
}
public int find(int p) {
	while(p!=id[p]) {// 寻找p节点所在组的根节点，根节点具有性质id[root] = root

		p=id[p];
	}
	return p;
}
public void union(int p,int q) {
	int pID=find(p);
	int qID=find(q);
	if(pID!=qID) {
		id[pID]=qID;
		count--;
		
	}
}
public boolean connected(int p,int q) {
	return find(p)==find(q);
}
public int count() {
	return count;
}
	public static void main(String[] args) {
		QuickUnion a=new QuickUnion(9);
		a.union(3, 4);
		System.out.println(a.connected(3,4));

	}

}
