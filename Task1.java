class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Task1 {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void delete(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Task1 list = new Task1();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Before Delete:");
        list.display();

        list.delete(20);

        System.out.println("After Delete:");
        list.display();
    }
}