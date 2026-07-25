public class Task3 {

    int[] queue = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int data) {

        if (rear == queue.length - 1) {
            System.out.println("Queue Full");
            return;
        }

        queue[++rear] = data;
    }

    void dequeue() {

        if (front > rear) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Deleted: " + queue[front]);
        front++;
    }

    void display() {

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Task3 q = new Task3();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}