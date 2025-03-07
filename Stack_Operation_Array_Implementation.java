import java.util.*;
class Stack{
    int size;
    int top;
    int[] arr;
    Stack(int n){
        size=n;
        arr = new int[size];
        top=-1;
    }
    public void push(int val){
        if(isFull()){
            return ;
        }
        arr[++top]=val;
    }
    public int pop(){
       if(isEmpty()){
           return 0;
       }
       return arr[top--];
    }
    public int  peek(){
        if(isEmpty()){
            return 0;
        }
        return arr[top];
    }
    public boolean isFull(){
        return top==size-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void display(){
        for(int i=top;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n=5;
		Stack stack=new Stack(n);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.display();
		System.out.println("Peek Element :"+stack.peek());
		System.out.println("Pop Element :"+stack.pop());
		stack.display();
	}
}
