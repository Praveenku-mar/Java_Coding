import java.util.*;

class Queue {
    int front, rear;
    int[] arr;
    int size;

    Queue(int n) {
        front = -1;
        rear = -1;
        size = n;
        arr = new int[size];
    }

    public void enQueue(int val) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1 && rear == -1) {
            front++;
        }
        arr[++rear] = val;
    }

    public void deQueue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued element: " + arr[front]);
        front++;
        if (front > rear) { // Reset when queue becomes empty
            front = rear = -1;
        }
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.display(); // Display queue
        q.deQueue(); // Dequeue an element
        q.display(); // Display queue after dequeue
        q.enQueue(60); // Try to enqueue in a full queue
        q.deQueue(); // Dequeue an element
        q.deQueue(); // Dequeue an element
        q.deQueue(); // Dequeue an element
        q.deQueue(); // Dequeue an element
        q.deQueue(); // Try to dequeue from an empty queue
        q.display(); // Display empty queue
    }
}