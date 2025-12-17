import java.util.*;

public class Queue {

    static class QueueDef {

        String[] arr;
        int front, rear, size, n;

        QueueDef(int n) {
            this.n = n;
            arr = new String[n];
            front = 0;
            rear = -1;
            size = 0;
        }

        public void enqueue(String str) {
            if (size == n) {
                System.out.println("Queue is full");
                return;
            }
            rear = (rear + 1) % n;
            arr[rear] = str;
            size++;
        }

        public void dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty");
            }
            front = (front + 1) % n;
            size--;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(front + 1) % n] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter queue size:");
        int size = sc.nextInt();
        sc.nextLine();
        QueueDef q = new QueueDef(size);
        q.enqueue("19");
        q.enqueue("22");
        q.enqueue("25");
        System.out.println("queue after enqueue:");
        q.display();
        q.dequeue();
        System.out.println("queue after one  dequeue:");
        q.display();
    }
}