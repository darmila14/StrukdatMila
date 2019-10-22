package belajar;

public class stack1 {
private String stack[];

private int top;

public stack1(int size) {
	
	stack = new String[size];
	top=0;
	
}
public void push(String value) {
	if(top<stack.length) {
		stack[top++]= value;
	} else {
		
	}
	
}
public String pop() {
	if (top>0) {
		return stack[--top];
	} else {
		return "";
	}
	
}
/*public String peek() {
	return stack[top];
}
*/
public void print () {
	for(int i=0;i<stack.length;i++) {
	System.out.println(stack[i]);	
	}
}


	public static void main(String[] args) {
	stack1 a = new stack1(5);
	System.out.println("sebelum diurutkan :");
	a.push("E");
	a.push("D");
	a.push("C");
	a.push("B");
	a.push("A");
	a.print();
	System.out.println("");
	System.out.println("setelah diurutkan :");
	System.out.println(a.pop());
	System.out.println(a.pop());
	System.out.println(a.pop());
	System.out.println(a.pop());
	System.out.println(a.pop());
	
	
	
	
	
	

	}

}
