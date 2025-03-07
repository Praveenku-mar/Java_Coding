//SINGLLY LINKED LIST (insert,insert at beg, insert at end, delete at beg, delete at end, insert at specifc, delete at specific, reverse, duplicate remove)

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class single{
    Node head, tail;
    public void insert(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void insert_beg(int data){
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void insert_end(int data){
        Node newnode = new Node(data);
        tail.next=newnode;
        tail=newnode;
    }
    public void insert_specific(int pos,int data){
        Node newnode = new Node(data);
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        
    }
    public void delete_beg(){
        head=head.next;
    }
    public void delete_end(){
        Node temp=head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next=null;
    }
    public void delete_specific(int pos){
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public void duplicate(){
        if(head==null){
            System.out.println("null");
        }
        Node temp=head;
        while(temp.next != null && temp != null){
            if(temp.data == temp.next.data){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
    }
    public void middle_element(){
        Node temp = head;
        if(temp==null){
            return;
        }
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        temp = head;
        for(int i=0;i<count/2;i++){
            temp=temp.next;
        }
        System.out.println("Middle element:"+temp.data);
    }
    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class Main{
    public static void main(String[]args){
        single ss = new single();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            int data=0;
            ss.insert(data=s.nextInt());
        }
        System.out.print("Inserting the elements:");
        ss.display();
        ss.insert_beg(10);
        System.out.print("Inserting the begin elements:");
        ss.display();
        ss.insert_end(20);
        System.out.print("Inserting the end elements:");
        ss.display();
        ss.insert_specific(1,30);
        System.out.print("Inserting at specific position:");
        ss.display();
        ss.delete_beg();
        System.out.print("Delete at Begin:");
        ss.display();
        ss.delete_end();
        System.out.print("Delete at End:");
        ss.display();
        ss.delete_specific(4);
        System.out.print("Deleting at specific position:");
        ss.display();
        ss.reverse();
        System.out.print("Reverse the list:");
        ss.display();
        ss.duplicate();
        System.out.print("Remove the duplicate list:");
        ss.display();
        ss.middle_element();
        
    }
}