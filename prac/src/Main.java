public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);  // Create a queue with capacity 5
        q.enqueue(1.1);
        q.enqueue(2.2);
        q.enqueue(3.3);
        q.printElements();  // Output: Queue elements: 1.1 2.2 3.3
        q.dequeue();
        q.printElements();  // Output: Queue elements: 2.2 3.3
        q.enqueue(4.4);
        q.enqueue(5.5);
        q.enqueue(6.6);
        q.enqueue(7.7);  // This will print an error message
        q.printElements();  // Output: Queue elements: 2.2 3.3 4.4 5.5 6.6
    }
}
