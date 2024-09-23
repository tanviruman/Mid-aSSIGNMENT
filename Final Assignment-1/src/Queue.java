public class Queue

{
    public double[] queueElements;
    private int queueCapacity;
    private int lastIndex;

    public Queue(int capacity)
    {
        this.queueCapacity = capacity;
        this.queueElements = new double[capacity];
        this.lastIndex = -1;
        System.out.println();
        System.out.println("Creating a Queue: Capacity " + capacity);
        System.out.println();
    }

    public void enqueue(double n) {
        if (lastIndex < queueCapacity - 1)

        {
            lastIndex++;
            queueElements[lastIndex] = n;
            System.out.println("Enqueue " + n + ": Successful");

        }

        else
        {
            System.out.println("Error Enqueuing " + n);
        }
    }

    public void dequeue()
    {
        if (lastIndex == -1)

        {
            System.out.println(" Cannot dequeue Because Queue is empty");
            return;
        }

        System.out.println("Dequeuing: Successful");

        for (int i = 0; i < lastIndex; i++)
        {
            queueElements[i] = queueElements[i + 1];
        }
        lastIndex--;
    }

    public void printElements()

    {
        if (lastIndex >= 0)
        {
            System.out.print("Showing Elements of queue: ");

            for (int i = 0; i <= lastIndex; i++)
            {
                if (i == lastIndex)
                {
                    System.out.print(queueElements[i]);
                }

                else

                {
                    System.out.print(queueElements[i] + ", ");
                }

            }
            System.out.println();
        }
        else

        {
            System.out.println("Queue is empty");
        }
        System.out.println();
    }

}
