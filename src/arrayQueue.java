public class arrayQueue {
	int first;
	int last;
	int[]aq;
	final int SIZE=10;
	public arrayQueue() {
		first=0;
		last=-1;
		aq=new int[SIZE];	
	}
	public void enqueue(int data) {
		if(last==SIZE-1) {
			last=-1;
		}
		aq[++last]=data;
	}
	public int dequeue() {
		if(first==SIZE) {
			first=0;
		}
		return aq[first++];
		
	}

	public static void main(String[] args) {
		arrayQueue a=new arrayQueue();
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		a.enqueue(4);
		System.out.println(a.dequeue());
		System.out.println(a.dequeue());
		System.out.println(a.dequeue());
		System.out.println(a.dequeue());


	}

}
