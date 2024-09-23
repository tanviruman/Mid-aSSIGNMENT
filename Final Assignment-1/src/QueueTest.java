public class QueueTest {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(5.2);
        q.enqueue(2.1);
        q.enqueue(-0.2);
        q.enqueue(7.88);
        q.enqueue(5.5);
        q.enqueue(1.1);
        System.out.println();
        q.printElements();
        q.dequeue();
        q.printElements();
        q.dequeue();
        q.dequeue();
        q.printElements();
        q.enqueue(10.666);
        q.printElements();
    }
}
