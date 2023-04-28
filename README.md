# Assignment 3
### Made with :heart: by Sayat Adilkhanov


---


# Main 🚀 [Link](src/Main.java)

The Main class is created to call each class by using Scanner and methods (switch-case)

```java
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stack (on LinkedList) - 1\nQueue (on ArrayList) - 2");
        int n = scanner.nextInt();
        switch (n)
        {
            case 1 ->
            {
                LinkedListStack<String> stack = new LinkedListStack<>();
                System.out.println("how many pushes?");
                int case1 = scanner.nextInt();
                for (int i = 0; i < case1; i++)
                {
                    stack.pushMethod(scanner.next());
                }
                while (a == 0)
                {
                    System.out.println("Stack implementation\nPop - 2\nPeek - 3\nIs Empty - 4\nGet Size - 5");
                    switch (scanner.nextInt())
                    {
                        case 2 ->
                        {
                            stack.popMethod();
                            System.out.println("Removed");
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                        }
                        case 3 ->
                        {
                            System.out.println(stack.peekMethod());
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                        }
                        case 4 ->
                        {
                            System.out.println(stack.isEmpty());
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                        }
                        case 5 ->
                        {
                            System.out.println(stack.getSize());
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                        }
                    }
                }
            }
            case 2 ->
            {
                ArrayListQueue<Integer> queue = new ArrayListQueue<>();
                System.out.println("how many queues?");
                int case2 = scanner.nextInt();
                for (int i = 0; i < case2; i++)
                {
                    queue.enqueue(scanner.nextInt());
                }
                while (a == 0)
                {
                    System.out.println("Queue implementation\nDequeue - 2\nPeek - 3\nIs Empty - 4\nGet Size - 5");
                    switch (scanner.nextInt())
                    {
                        case 2 ->
                        {
                            System.out.println(queue.dequeue());
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                        }
                        case 3 ->
                        {
                            System.out.println(queue.peek());
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                        }
                        case 4 ->
                        {
                            if (queue.isEmpty())
                            {
                                System.out.println("Empty");
                            } else
                                System.out.println("Not Empty");
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                        }
                        case 5 ->
                        {
                            System.out.println(queue.getSize());
                            System.out.println("go back to the selection?\n 0 - yes\n 1 - no");
                            a = scanner.nextInt();
                        }
                    }
                }
            }
            case 3 -> System.out.println("Don't be a 🤡");
        }
``` 


---


# Class ArrayListQueue [Link](src/ArrayListQueue.java)

This Class was created to work with "Queue".

# Function :one: ```enqueue()```.
Adds an element to the back of the queue by using method ```add```.

```java
    public void enqueue(T data)
    {
        queue.add(data);
    }
```

# Function :two: ```dequeue()```.
1) Removes by using method ```remove```.
2) Then returns the front element of the queue by using method ```remove```.
3) Also it checks is query empty and throwing exception ```NoSuchElementException()```.

```java
    public T dequeue ()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }
```

# Function :three: ```peek()```.
1) Returns the front element of the queue without removing it.
2) Also it checks is query empty and throwing exception ```NoSuchElementException()```.

```java
    public T peek()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }
```

# Function :four: ```getSize()```.
Returns size number the number of elements in queue by using method ```size()```.

```java
    public int getSize()
    {
        return queue.size();
    }
```

# Function :five: ```isEmpty```.
Boolean fucntion checks is query empty and returns False or True.

```java
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
```


---


# Class LinkedListStack [Link](src/LinkedListStack.java)

# Function :one: ```pushMethod()```

```java
    public void pushMethod(T data)
    {
        stack.addFirst(data);
    }
```

# Function :two: ```popMethod()```

```java
    public void popMethod()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        stack.removeFirst();
    }
```

# Function :three: ```peekMethod()```

```java
    public T peekMethod()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack.peek();
    }
```

# Function :four: ```getSize()```

```java
    public int getSize()
    {
        return stack.size();
    }
```
# Function :five: ```isEmpty()```

```java
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
```
