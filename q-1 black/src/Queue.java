public class Queue {
    public double[] queueElements;
    private int queueCapacity;
    private int lastIndex;

    public Queue(int capacity) {
        this.queueCapacity = capacity;
        this.queueElements = new double[capacity];
        this.lastIndex = -1; // initialize lastIndex to -1, since the first element will be at index 0
        System.out.println("Creating a Queue: Capacity " + capacity);
    }

    public void enqueue(double n) {
        if (lastIndex == queueCapacity - 1) {
            System.out.println("Error Enqueuing " + n);
            return;
        }
        lastIndex++;
        queueElements[lastIndex] = n;
        System.out.println("Enqueue " + n + ": Successful");
    }

    public void dequeue() {
        if (lastIndex == -1) {
            System.out.println("Error Dequeuing");
            return;
        }
        System.out.println("Dequeuing: Successful");
        // shift all elements to the left by one position
        for (int i = 0; i < lastIndex; i++) {
            queueElements[i] = queueElements[i + 1];
        }
        lastIndex--;
    }

    public void printElements() {
        System.out.print("Showing Elements of queue: ");
        for (int i = 0; i <= lastIndex; i++) {
            System.out.print(queueElements[i] + " ,");
        }
        System.out.println();
    }
}

