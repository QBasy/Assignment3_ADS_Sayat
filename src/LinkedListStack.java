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

    public T popMethod()
    {
        if (stack.isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }


}
