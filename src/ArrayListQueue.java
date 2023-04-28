import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListQueue<T> {
    private ArrayList<T> queue;

    public void enqueue(T data)
    {
        queue.add(data);
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
    public T dequeue ()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }

    public T peek()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    public int getSize()
    {
        return queue.size();
    }
}
