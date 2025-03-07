import java.util.*;
class Node{
    int data;
    Node next;
    Node(int val){
        data = val;
        next=null;
    }
}
class Queue{
    Node head;
    Node tail;
    public void enQueue(int val){
        Node nnode = new Node(val);
        if(head==null){
            head = nnode;
            tail = nnode;
        } 
        tail.next = nnode;
        nnode = tail;
    }
    public int front(){
        return head.data;
    }
    public void deQueue(){
        head = head.next;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
public class Main
{
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.display();
		q.deQueue();
		q.display();
		System.out.println(q.front());
	}
}
