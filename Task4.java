import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Task4 {

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

    void reverse() {

        Stack<Integer> stack = new Stack<>();

        Node temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
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

        Task4 list = new Task4();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original:");
        list.display();

        list.reverse();

        System.out.println("Reversed:");
        list.display();
    }
}