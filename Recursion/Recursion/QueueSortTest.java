public class QueueSortTest {
    public static void main(String[] args) {
        // Create an empty queue
        QueueAsMyLinkedList emptyQueue = new QueueAsMyLinkedList();
        System.out.println("Empty Queue:");
        displayQueue(emptyQueue);
        int emptySize = calculateSize(emptyQueue);
        emptyQueue = QueueAsMyLinkedList.method(emptyQueue, emptySize);
        System.out.println("Sorted Empty Queue:");
        displayQueue(emptyQueue);
        System.out.println();

        // Create a queue with one element
        QueueAsMyLinkedList singleElementQueue = new QueueAsMyLinkedList();
        singleElementQueue.enqueue(1);
        System.out.println("Single Element Queue:");
        displayQueue(singleElementQueue);
        int singleSize = calculateSize(singleElementQueue);
        singleElementQueue = QueueAsMyLinkedList.method(singleElementQueue, singleSize);
        System.out.println("Sorted Single Element Queue:");
        displayQueue(singleElementQueue);
        System.out.println();

        // Create a queue with multiple elements
        QueueAsMyLinkedList queue = new QueueAsMyLinkedList();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(2);

        System.out.println("Original Queue:");
        displayQueue(queue);
        int size = calculateSize(queue);
        //queue = QueueAsMyLinkedList.method(queue, size);
        //System.out.println("Sorted Queue:");
        //displayQueue(queue);
        //System.out.println();

        // Create a queue with all elements already in sorted order
        QueueAsMyLinkedList sortedQueue = new QueueAsMyLinkedList();
        sortedQueue.enqueue(1);
        sortedQueue.enqueue(2);
        sortedQueue.enqueue(3);
        sortedQueue.enqueue(4);
        sortedQueue.enqueue(5);

        System.out.println("Sorted Queue:");
        displayQueue(sortedQueue);
        int sortedSize = calculateSize(sortedQueue);
        sortedQueue = QueueAsMyLinkedList.method(sortedQueue, sortedSize);
        //System.out.println("Sorted Queue (no change):");
        //displayQueue(sortedQueue);
        //System.out.println();
    }

    public static void displayQueue(QueueAsMyLinkedList queue) {
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }

    public static int calculateSize(QueueAsMyLinkedList queue) {
        int size = 0;
        QueueAsMyLinkedList temp = new QueueAsMyLinkedList();

        while (!queue.isEmpty()) {
            temp.enqueue(queue.dequeue());
            size++;
        }

        while (!temp.isEmpty()) {
            queue.enqueue(temp.dequeue());
        }

        return size;
    }
}