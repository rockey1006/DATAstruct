public class arrayStack {
int top;
int[]stack;
final int SIZE=10;
public arrayStack() {
	stack=new int[SIZE];
	top=-1;
}
public void push(int data) {
	stack[++top]=data;
}
public int pop() {
	return stack[top--];
}
public int peek() {
	return stack[top];
}
	public static void main(String[] args) {

	}

}
