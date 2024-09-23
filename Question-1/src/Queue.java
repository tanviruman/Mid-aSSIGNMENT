class Queue {
    public double[] queueElements;  // Public array to store the queue elements
    private int queueCapacity;  // Private variable to store the capacity of the queue
    private int lastIndex;  // Private variable to track the last index of the queue

    // Constructor to initialize the queue with the given capacity
    public Queue(int capacity) {
        queueCapacity = capacity;
        queueElements = new double[capacity];
        lastIndex = -1;  // Initialize the lastIndex to -1 indicating the queue is empty
        System.out.println("Creating a Queue: Capacity " + capacity);
    }

    // Method to add an element to the queue
    public void enqueue(double n) {
        if (lastIndex < queueCapacity - 1) {
            lastIndex++;  // Increment the index
            queueElements[lastIndex] = n;  // Add the element at the end of the queue
            System.out.println("Enqueue " + n + ": Successful");
        } else {
            System.out.println("Error Enqueuing " + n);
        }
    }

    // Method to remove the first element of the queue
    public void dequeue() {
        if (lastIndex >= 0) {
            System.out.println("Dequeuing: Successful");
            // Shift elements to the left
            for (int i = 0; i < lastIndex; i++) {
                queueElements[i] = queueElements[i + 1];
            }
            lastIndex--;  // Decrease the index
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }

    // Method to print the elements in the queue
    public void printElements() {
        if (lastIndex >= 0) {
            System.out.print("Showing Elements of queue: ");
            for (int i = 0; i <= lastIndex; i++) {
                if (i == lastIndex) {
                    System.out.print(queueElements[i]);
                } else {
                    System.out.print(queueElements[i] + ", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty.");
        }
    }


}

