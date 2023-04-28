import java.util.LinkedList;
import java.util.EmptyStackException;

public class LinkedListStack<T> {
    private LinkedList<T> stack;

    public LinkedListStack()
    {
        stack = new LinkedList<T>();
    }

    public void pushMethod(T data)
    {
        stack.addFirst(data);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public T popMethod()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public T peekMethod()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }

    public int getSize()
    {
        return stack.size();
    }
}

