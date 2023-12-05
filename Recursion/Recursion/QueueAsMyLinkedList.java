
public class QueueAsMyLinkedList<Integer>
{   
    private MyLinkedList<Integer> theQueue;  // list header
	
	
    public QueueAsMyLinkedList()
    {  theQueue = new MyLinkedList<Integer>();       
    }
	
    public void enqueue(Integer newElement) //insert at tail
    {  
		   theQueue.append(newElement);
    }
	
	public  Integer dequeue() //remove from head
    {  
		Integer temp = null;
		boolean isDone = false;
		
		temp = theQueue.getFirst();
		if (temp != null)
		{
			isDone=theQueue.delete(temp);
		}
		if (isDone)
			return temp;
		else
			return null;
    }
    
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }
    
	public String toString()
	{
		return theQueue.toString();
	}
	
   public static QueueAsMyLinkedList method(QueueAsMyLinkedList pl, int x) {
        if (x <= 1) {
            // If the queue has 0 or 1 element, it's already sorted
            return pl;
        }

        QueueAsMyLinkedList leftQueue = new QueueAsMyLinkedList();
        QueueAsMyLinkedList rightQueue = new QueueAsMyLinkedList();

        // Split the input queue into two halves
        int halfSize = x / 2;
        for (int i = 0; i < halfSize; i++) {
            leftQueue.enqueue(pl.dequeue());
        }
        for (int i = halfSize; i < x; i++) {
            rightQueue.enqueue(pl.dequeue());
        }

        // Recursively sort the two halves
        leftQueue = method(leftQueue, halfSize);
        rightQueue = method(rightQueue, x - halfSize);

        // Merge the two sorted halves
        QueueAsMyLinkedList result = merge(leftQueue, rightQueue);

        return result;
    }
    
    public static QueueAsMyLinkedList merge(QueueAsMyLinkedList left, QueueAsMyLinkedList right) {
    QueueAsMyLinkedList result = new QueueAsMyLinkedList();

    while (!left.isEmpty() && !right.isEmpty()) {
        int leftElement = (int) left.theQueue.getFirst();
        int rightElement = (int) right.theQueue.getFirst();

        if (leftElement <= rightElement) {
            result.enqueue(left.dequeue());
        } else {
            result.enqueue(right.dequeue());
        }
    }

    while (!left.isEmpty()) {
        result.enqueue(left.dequeue());
    }

    while (!right.isEmpty()) {
        result.enqueue(right.dequeue());
    }

    return result;
}






   
}//end class