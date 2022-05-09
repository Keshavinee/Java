interface Operations<T>{
	public boolean isEmpty();
	public boolean isFull();
	public void push(T value);
	public void pop();
	public void display();
	public T top();
}

class Stack<T> implements Operations<T>{
	T stk[];
	int top;
	
	public Stack(T stk[]){
		this.stk = stk;
		top = -1;
	}
	
	public boolean isFull(){
		if (top >= stk.length-1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty(){
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void push(T value){
		if (isFull()){
			System.out.println("Stack is full!");
		}
		
		else{
			top++;
			stk[top] = value;
		}
	}

	public void pop(){
		if (isEmpty()) {
			System.out.println("Stack is empty!");
		}

		else{
			System.out.println(stk[top]+" is popped!");
			top--;
		}
	}

	public void display(){
		for (int i = top; i >= 0; i--) {
			System.out.println(stk[i]);
		}
	}

	public T top(){
		return stk[top];
	}
}

public class TestStack{
	public static void main(String[] args) {
		String arr[]= new String[10];
		Stack<String> stk = new Stack<String>(arr);
		stk.push("Java");
		stk.push("Python");
		stk.push("C");
		stk.display();
		stk.pop();
		System.out.println("Top of stack : " + stk.top());
	}
}
