public class Queue {
    private double[] queueElements;
    private int queueCapacity;
    private int lastIndex;

    public Queue(int capacity) {
        queueElements = new double[capacity];
        queueCapacity = capacity;
        lastIndex = -1;
    }

    public void enqueue(double n) {
        if (lastIndex == queueCapacity - 1) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        lastIndex++;
        queueElements[lastIndex] = n;
    }

    public void dequeue() {
        if (lastIndex == -1) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        for (int i = 0; i < lastIndex; i++) {
            queueElements[i] = queueElements[i + 1];
        }
        lastIndex--;
    }

    public void printElements() {
        if (lastIndex == -1) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i <= lastIndex; i++) {
            System.out.print(queueElements[i] + " ");
        }
        System.out.println();
    }
}