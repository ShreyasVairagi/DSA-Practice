package stack;
import java.util.NoSuchElementException;

public class LinkedStack {
    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node topNode = new Node(value);
        topNode.next = top;
        top = topNode;
    }

    public int pop() {

        if (top == null) {
            throw new NoSuchElementException("Stack is empty");
        }

        int value = top.data;
        top = top.next;

        return value;
    }

    public int peek() {

        if (top == null) {
            throw new NoSuchElementException("Stack is empty");
        }

        return top.data;
    }

    public int size() {
        int count = 0;
        Node current = top;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        // 1. Empty stack
        System.out.println(stack.isEmpty()); // true

        // 2 & 3. Push three values and peek
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek()); // 30

        // 4. Pop
        System.out.println(stack.pop()); // 30

        // 5. Pop remaining values
        System.out.println(stack.pop()); // 20
        System.out.println(stack.pop()); // 10

        // 6. Empty after popping everything
        System.out.println(stack.isEmpty()); // true

        // 7. Peek on empty stack
        try {
            stack.peek();
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception on peek");
        }

        // 8. Pop on empty stack
        try {
            stack.pop();
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception on pop");
        }
    }

}
