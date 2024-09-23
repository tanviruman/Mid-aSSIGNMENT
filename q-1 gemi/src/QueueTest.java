public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(5.2);
        q.enqueue(2.1);
        q.enqueue(-0.2);
        q.enqueue(7.88);
        q.enqueue(5.5);

        // Test enqueue when queue is full
        q.enqueue(1.1);

        q.printElements();

        q.dequeue();
        q.dequeue();
        q.dequeue();

        // Test dequeue when queue is empty
        q.dequeue();

        q.printElements();

        q.enqueue(10.666);
        q.printElements();
    }
}
