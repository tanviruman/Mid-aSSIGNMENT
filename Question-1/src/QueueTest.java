public class QueueTest {

    public static void main(String[] args) {
        Queue q = new Queue(5);  // Create a queue with capacity 5

        q.enqueue(5.2);
        q.enqueue(2.1);
        q.enqueue(-0.2);
        q.enqueue(7.88);
        q.enqueue(5.5);
        q.enqueue(1.1);  // This will show an error

        q.printElements();  // Show the current state of the queue

        q.dequeue();  // Remove the first element
        q.printElements();  // Show the updated state of the queue

        q.dequeue();  // Remove the next element
        q.dequeue();  // Remove another element
        q.printElements();  // Show the updated state of the queue

        q.enqueue(10.666);  // Add a new element
        q.printElements();  // Show the final state of the queue
    }
}
