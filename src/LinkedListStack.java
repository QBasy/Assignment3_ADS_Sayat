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

    public void popMethod()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        stack.removeFirst();
    }

    public T peekMethod()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public int getSize()
    {
        return stack.size();
    }
}

