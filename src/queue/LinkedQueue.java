package queue;

import java.util.NoSuchElementException;

public class LinkedQueue {
    private Node front;
    private Node rear;
    private int size;

    public void enqueue(int value) {
        Node node = new Node(value);

        if (front == null && rear == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }

        size++;
    }

    public int dequeue() {
        if (front == null){
            throw new NoSuchElementException("No elements in the list");
        }
        int output = front.data;

        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }

        size--;
        return output;
    }

    public int peek() {
        if (front == null){
            throw new NoSuchElementException("No elements in the list");
        }

        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        // 1. size() on a new queue returns 0
        System.out.println("New queue size: " + queue.size()); // 0

        // 2. After enqueueing three values, size() returns 3
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Size after 3 enqueues: " + queue.size()); // 3

        // 3. After one dequeue, size() returns 2
        queue.dequeue();
        System.out.println("Size after 1 dequeue: " + queue.size()); // 2

        // 4. After removing every element, size() returns 0
        queue.dequeue();
        queue.dequeue();
        System.out.println("Size after removing all elements: " + queue.size()); // 0

        // 5. Enqueue after the queue becomes empty; verify front and rear behave correctly
        queue.enqueue(50);
        System.out.println("Peek after re-enqueueing to empty queue: " + queue.peek()); // 50
        System.out.println("Size after re-enqueue: " + queue.size()); // 1
        queue.dequeue(); // Empty it back out

        // 6. dequeue() on an empty queue throws NoSuchElementException
        try {
            queue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception on dequeue from empty queue (Passed)");
        }

        // 7. Repeated peek() calls do not change size()
        queue.enqueue(100);
        System.out.println("First peek: " + queue.peek());
        System.out.println("Second peek: " + queue.peek());
        System.out.println("Size after peeks: " + queue.size()); // 1

        // 8. Test clear() method
        queue.enqueue(200);
        queue.enqueue(300);
        System.out.println("Size before clear: " + queue.size()); // 3
        queue.clear();
        System.out.println("Size after clear: " + queue.size()); // 0
        System.out.println("Is queue empty after clear? " + queue.isEmpty()); // true
    }



}
