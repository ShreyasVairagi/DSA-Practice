package linkedlist;

public class SinglyLinkedList {

    private Node head;

    public void addFirst(int value){
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
    }

    public void removeFirst() {

        if(head == null){
            return;
        }

        head = head.next;
    }

    public void addLast(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }

    public void removeLast() {

        if(head == null){
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public int size(){
        int count = 0;

        if(head == null){
            return 0;
        }

        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public boolean contains(int value){
        if(head == null){
            return false;
        }

        Node current = head;

        while (current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }

        return false;

    }

    public int get(int index) {

        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        int count = 0;
        Node current = head;

        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        return current.data;

    }

    public int indexOf(int value) {

        int count = 0;
        Node current = head;

        while (current != null) {
            if (current.data == value){
                return count;
            }
            current = current.next;
            count++;
        }

        return -1;
    }

    public void set(int index, int value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        int count = 0;
        Node current = head;

        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        current.data = value;
    }


    public void remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        int count  = 0;
        Node current = head;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        current.next = current.next.next;

    }

    public void printList(){
        Node current = head;

        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        // Test 1: Empty list
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.addLast(40);
        list1.printList();  // Expected: 40

        // Test 2: Non-empty list
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addFirst(10);
        list2.addFirst(20);
        list2.addLast(30);
        list2.addLast(40);
        System.out.println();
        list2.printList();  // Expected: 20, 10, 30, 40

        System.out.println();
        System.out.println("List Size: "+ list1.size());
        System.out.println("List Size: "+ list2.size());

        System.out.println(list2.contains(40));
        System.out.println("Get method " + list2.get(2));
        System.out.println("Get method " + list2.indexOf(1110));

    }
}
