import java.util.*;

class Node {
    Node next;
    int data;
    Node(int val) {
        data = val;
        next = null;
    }
}

class Stack_LinkedList {
    Node head;

    public void push(int val) {
        Node nnode = new Node(val);
        if (head == null) {
            head = nnode;
        } else {
            nnode.next = head;
            head = nnode;
        }
    }
    public void pop(){
        if(head==null) return;
        System.out.println("Delete element in stack :"+head.data);
        head = head.next;
    }
    public int peak(){
        if(head==null) return 0;
        else
        return head.data;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Stack_LinkedList s = new Stack_LinkedList();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.display();
        s.pop();
        System.out.println(s.peak());
        s.display();
    }
}