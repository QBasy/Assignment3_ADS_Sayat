import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stack (on LinkedList) - 1\nQueue (on ArrayList) - 2");
        int n = scanner.nextInt();
        if (n > 2) {
            System.out.println("Don't be a 🤡");
            System.exit(0);
        }
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
        }
    }
}